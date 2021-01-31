package f338;
import java.util.Scanner;
public class f338 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int X = Integer.parseInt(input[0]),
			Y = Integer.parseInt(input[1]),
			L = Integer.parseInt(input[2]),
			R = Integer.parseInt(input[3]);
		int N = scanner.nextInt();
		scanner.nextLine();
		int result = 0;
		for(int i = 0; i < N; i++) {
			input = scanner.nextLine().split(" ");
			int xs = Integer.parseInt(input[0]),
				ys = Integer.parseInt(input[1]),
				ls = Integer.parseInt(input[2]);
			if(ls > L)
				continue;
			double distant = Math.pow(Math.abs(xs - X), 2) + Math.pow(Math.abs(ys - Y), 2);
			if(distant > R*R)
				continue;
			result++;
		}
		System.out.println(result);
	}

}
