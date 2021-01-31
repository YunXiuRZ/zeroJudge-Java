package e948;
import java.util.Scanner;
public class e948 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < N; i++) {
			String[] input = scanner.nextLine().split(" ");
			int sex = Integer.parseInt(input[0]),
				age = Integer.parseInt(input[1]),
				height = Integer.parseInt(input[2]),
				weight = Integer.parseInt(input[3]);
			double result = 0;
			if(sex == 1) 
				result = (13.7 * weight) + (5.0 * height) - (6.8 * age) + 66;
			else 
				result = (9.6 * weight) + (1.8 * height) - (4.7 * age) + 655;
			System.out.printf("%2.2f\n", result);
		}
	}
}
