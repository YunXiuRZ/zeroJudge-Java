package f170;
import java.util.Scanner;
public class f170 {

	static int[][][] map;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		String[] input = scanner.nextLine().split(" ");
		int x = Integer.parseInt(input[0]),
			y = Integer.parseInt(input[1]);
		int[][] move = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		map = new int[N][N][2];
		
		for(int i = 0; i < N; i++) {
			input = scanner.nextLine().split(" ");
			for(int j = 0; j < N; j++) {
				map[i][j][0] = Integer.parseInt(input[j]);
			}
		}
		
		map[y][x][1] = 1;
		int result = 0;
		while(hasPro) {
			
		}
	}

	public boolean hasPro() {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map.length; j++) {
				if(map[i][j][1] == 1)
					return true;
			}
		}
		return false;
	}
}
