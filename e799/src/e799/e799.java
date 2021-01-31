package e799;
import java.util.Scanner;
public class e799 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		char C = scanner.nextLine().toCharArray()[0];
		for(int i = 0; i < N; i++) {
			long S = scanner.nextLong();
			scanner.nextLine();
			for(int j = M-1; j >= 0; j--) {
				long level = (long)Math.pow(2, j);
				if(level <= S) {
					System.out.printf("%c ", C);
					S-=level;
				}else {
					System.out.print(". ");
				}
			}
			System.out.println("");
		}
	}

}
