package f149;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class f149 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int R = Integer.parseInt(input[0]),
			C = Integer.parseInt(input[1]);
		String[][] map = new String[R][C];
		ArrayList<Detector> detectors = new ArrayList<Detector>();
		HashSet<Detector> unDetectors = new HashSet<Detector>();
		int bombCount = 0;
		
		for(int i = 0; i < R; i++) {
			input = scanner.nextLine().split(" ");
			map[i] = input;
			for(int j = 0; j < C; j++) {
				if(input[j].equals("5")) {
					Detector d = new Detector(i, j);
					detectors.add(d);
				}else if(input[j].equals("1")) {
					bombCount++;
				}
			}
		}
		
		for(Detector d : detectors) {
			for(Detector dc : detectors) {
				if(d.neigh(dc)) {
					unDetectors.add(d);
				}
			}
		}
		
		for(Detector d : unDetectors) {
			detectors.remove(d);
		}
		
		int detect = 0;
		int[][] neigh = new int[][] {{-1, -1},{-1, 0}, {-1, 1},
									 {0, -1}, {0, 1},
									 {1, -1}, {1, 0}, {1, 1}};
		for(Detector d : detectors) {
			for(int[] n : neigh) {
				try {
					if(map[d.p1 + n[0]][d.p2 + n[1]].equals("1")) {
						detect++;
						map[d.p1 + n[0]][d.p2 + n[1]] = "0";
					}
				}catch(Exception e) {
					
				}
			}
		}
		
		System.out.printf("%d %d\n", detect, bombCount - detect);
	}

}

class Detector{
	
	int p1;
	int p2;
	
	public Detector(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public boolean equals(Detector d) {
		if(this.p1 == d.p1 && this.p2 == d.p2)
			return true;
		return false;
	}
	
	public boolean neigh(Detector d) {
		int p1d = Math.abs(this.p1 - d.p1),
			p2d = Math.abs(this.p2 - d.p2);
		if(p1d <= 1 && p2d <= 1 && !this.equals(d)) 
			return true;
		return false;
	}
}