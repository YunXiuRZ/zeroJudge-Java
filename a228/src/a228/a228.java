package a228;
import java.util.Scanner;
public class a228 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < T; i++) {
			String[] input = scanner.nextLine().split(" ");
			int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
			int[][]  map = new int[N][M];
			for(int j = 0; j < N; j++) {
				input = scanner.nextLine().split(" ");
				for(int k = 0; k < M; k++) {
					map[j][k] = Integer.parseInt(input[k]);
				}
			}
			Floor floor = new Floor(map);
			
		}
	}

}

class Floor{
	
	
	int[][] map;
	
	public Floor(int[][] map) {
		this.map = map;
	}
	
	
}