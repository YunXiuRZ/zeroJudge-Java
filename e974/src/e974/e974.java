package e974;
import java.util.Scanner;
public class e974 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int R = Integer.parseInt(input[0]),
			C = Integer.parseInt(input[1]),
			N = Integer.parseInt(input[2]);
		int rightCount = 0,
			behindCount = 0;
		for(int i = 2; i <= N; i++) {
			if(i % 2 == 0) 
				rightCount++;
			else
				behindCount++;
		}
		int k = 1;
		int[][] students = new int[R][C];
		for(int y = 0; y < R; y++) 
			for(int x = 0; x < C; x++) 
				students[(y + behindCount)%R][(x + rightCount)%C] = k++;
		for(int j = 0; j < R; j++) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < C; i++) {
				sb.append(students[j][i]);
				sb.append(" ");
			}
			System.out.println(sb.toString());
		}
	}

}
