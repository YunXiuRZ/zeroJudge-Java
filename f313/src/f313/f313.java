package f313;
import java.util.Scanner;
import java.util.ArrayList;
public class f313 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int R = Integer.parseInt(input[0]),
			C = Integer.parseInt(input[1]),
			K = Integer.parseInt(input[2]),
			M = Integer.parseInt(input[3]);
		Cities c = new Cities(R, C, K);
		for(int i = 0; i < R; i++) {
			c.addCities(scanner.nextLine().split(" "));
		}
		for(int i = 0; i < M; i++) {
			c.allPeopleOut();
		}
		System.out.println(c.getSmallestCity());
		System.out.println(c.getBiggestCity());
	}

}

class Cities{
	
	int citiesCount = 0;
	City[][] cityList;
	int k;
	int[][] neigh = new int[][] {{-1, 0}, {0, -1}};
	
	public Cities(int R, int C, int K) {
		cityList = new City[R][C];
		k = K;
	}
	
	public void addCities(String[] s) {
		for(int i = 0; i < cityList[0].length; i++) {
			if(s[i].equals("-1"))
				cityList[citiesCount][i] = null;
			else {
				City c = new City(Integer.parseInt(s[i]));
				cityList[citiesCount][i] = c;
				for(int[] n : neigh) {
					int x = i + n[0];
					int y = citiesCount + n[1];
					try {
						if(cityList[y][x] == null)
							continue;
						c.addNeigh(cityList[y][x]);
						cityList[y][x].addNeigh(c);
					}catch(ArrayIndexOutOfBoundsException e) {
						
					}catch(NegativeArraySizeException e) {
						
					}
				}
			}
		}
		citiesCount++;
	}
	
	public void setAllOutPeople() {
		for(City[] c : cityList) {
			for(City city : c) {
				if(city == null) 
					continue;
				city.setOutPeople(k);
			}
		}
	}
	
	public void allPeopleOut() {
		setAllOutPeople();
		for(City[] c : cityList) {
			for(City city : c) {
				if(city == null) 
					continue;
				city.peopleOut();
			}
		}
	}
	
	public int getBiggestCity(){
		int result = 0;
		for(City[] c : cityList) {
			for(City city : c) {
				if(city == null) 
					continue;
				if(city.people > result) {
					result = city.people;
				}
			}
		}
		return result;
	}
	
	public int getSmallestCity(){
		int result = Integer.MAX_VALUE;
		for(City[] c : cityList) {
			for(City city : c) {
				if(city == null) 
					continue;
				if(city.people < result) {
					result = city.people;
				}
			}
		}
		return result;
	}
}

class City{
	
	int people;
	int outPeople;
	ArrayList<City> neigh = new ArrayList<City>();
	
	public City(int p) {
		people = p;
	}
	
	public void addNeigh(City c) {
		neigh.add(c);
	}
	
	public void setOutPeople(int k) {
		outPeople = people/k;
	}
	
	public void peopleIn(int n) {
		people+=n;
	}
	
	public void peopleOut() {
		for(City c : neigh) {
			c.peopleIn(outPeople);
			people-=outPeople;
		}
	}
}