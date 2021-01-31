package f044;
import java.util.Scanner;
public class f044 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			T = Integer.parseInt(input[1]);
		T/=N;
		N = 1;
		int t = 0, count = 0;
		while(t != T) {
			t = 2 * t + 1;
			count++;
		}
		System.out.println(count);
	}

}
