package b965;
import java.util.Scanner;
public class b965 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			int R = Integer.parseInt(input[0]), 
				C = Integer.parseInt(input[1]),
				M = Integer.parseInt(input[2]);
			String[][] B = new String[R][C];
			for(int i = 0; i < R; i++) {
				B[i] = scanner.nextLine().split(" ");
			}
			String[] operates = scanner.nextLine().split(" ");
			for(int k = M - 1; k >= 0; k--) {
				String[][] temp = null;
				switch(operates[k]) {
				case "0":
					temp = new String[C][R];
					for(int i = 0; i < R; i++) {
						for(int j = 0; j < C; j++) {
							temp[C - j - 1][i] = B[i][j];
						}
					}
					int K = C;
					C = R;
					R = K;
					break;
				case "1":
					temp = new String[R][C];
					for(int i = 0; i < R; i++) {
						for(int j = 0; j < C; j++) {
							temp[R - i - 1][j] = B[i][j];
						}
					}
				}
				B = temp;
			}
			System.out.printf("%d %d\n", R, C);
			for(int i = 0; i < R; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < C; j++) {
					sb.append(B[i][j]);
					if(j + 1 != C) {
						sb.append(" ");
					}
				}
				System.out.println(sb.toString());
			}
		}
	}
}
