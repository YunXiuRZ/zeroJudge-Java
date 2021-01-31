package a058;
import java.util.Scanner;
public class a058 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] result = {0,0,0};
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(scanner.nextLine());
			result[m%3]++;
		}
		System.out.printf("%d %d %d\n", result[0], result[1], result[2]);
	}

}
