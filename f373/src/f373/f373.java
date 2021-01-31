package f373;
import java.util.Scanner;
public class f373 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int m = N / 1000;
		if(m % 2 == 0) {
			m = N / 2000;
			int total = N - m * 200;
			System.out.printf("%d 0\n", total);
		}else {
			int total = N - m * 100;
			System.out.printf("%d 1\n", total);
		}
	}

}
