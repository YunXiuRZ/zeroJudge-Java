package f315;
import java.util.Scanner;
public class f315 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] hills = new int[2 * N];
		for(int i = 0; i < 2 * N; i++) 
			hills[i] = Integer.parseInt(input[i]);
		long result = 0;
		O:
		for(int i = 1; i <= N; i++) {
			boolean flag = false;
			I:
			for(int j = 0; j < 2 * N; j++) {
				if(flag) {
					if(hills[j] == i) 
						continue O;
					else 
						if(i > hills[j])
							result++;
				}else 
					if(hills[j] == i)
						flag = true;
			}
		}
		System.out.println(result);
	}

}
