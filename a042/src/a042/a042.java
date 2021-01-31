package a042;
import java.util.Scanner;
public class a042 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			int result = n*n - n + 2;
			System.out.println(result);
		}
	}

}
