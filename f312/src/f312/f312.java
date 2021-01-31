package f312;
import java.util.Scanner;
public class f312 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] f1 = new int[3];
		for(int i = 0; i < 3; i++) {
			f1[i] = Integer.parseInt(input[i]);
		}
		input = scanner.nextLine().split(" ");
		int[] f2 = new int[3];
		for(int i = 0; i < 3; i++) {
			f2[i] = Integer.parseInt(input[i]);
		}
		int N = Integer.parseInt(scanner.nextLine());
		int result = Integer.MIN_VALUE;
		boolean flag = false;
		for(int i = 0; i <= N; i++) {
			int y = f1[0] * i*i + f1[1] * i + f1[2] + 
					f2[0] * (N - i)*(N - i) + f2[1] * (N - i) + f2[2];
			if(y > result)
				result = y;
		}
		System.out.println(result);
	}

}
