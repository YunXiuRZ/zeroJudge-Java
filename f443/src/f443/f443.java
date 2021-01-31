package f443;
import java.util.Scanner;
import java.util.ArrayList;
public class f443 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] sold = new int[N];
		for(int i = 0; i < N; i++) {
			sold[i] = Integer.parseInt(input[i]);
		}
		ArrayList<int[]> itemClass = new ArrayList<int[]>();
		String[] item = scanner.nextLine().split(" ");
		boolean start = false;
		for(int i = 0; i < N; i++) {
			int[] area = new int[2];
			if(start) {
				if(!isBoard(item[i])) {
					area[0] = i;
					area[1] = i;
					while(i < N - 1 && !isBoard(item[++i]))
							area[1]++;
					if(i == N - 1 && !isBoard(item[i]))
						break;
					itemClass.add(area);
					start = false;
					i--;
				}
			}
			else 
				if(isBoard(item[i])) 
					start = true;
		}
		
		for(int[] length : itemClass) {
			int biggest = length[0];
			int smallest = length[0];
			for(int i = length[0]; i <= length[1]; i++) {
				if(sold[biggest] < sold[i])
					biggest = i;
				if(sold[smallest] > sold[i])
					smallest = i;
			}
			String temp = item[biggest];
			item[biggest] = item[smallest];
			item[smallest] = temp;
		}
		
		for(String s : item) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println("");
	}

	public static boolean isBoard(String s) {
		return s.equals("-1");
	}
}
