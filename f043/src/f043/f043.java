package f043;
import java.util.Scanner;
public class f043 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		long R = Long.parseLong(input[0]),
			A = Long.parseLong(input[1]);
		if(R == A)
			A-=3;
		long N = R - A;
		if(N < A) {
			long temp = N;
			N = A;
			A = temp;
		}
		System.out.printf("%d+%d=%d\n", A, N, R);
	}

}
