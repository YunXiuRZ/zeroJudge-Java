package a044;
import java.util.Scanner;
public class a044 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			int result = (n*n*n+5*n+6)/6;
			System.out.println(result);
		}
	}

}
