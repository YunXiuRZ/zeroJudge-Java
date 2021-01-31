package a244;
import java.util.Scanner;
public class a244 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < N; i++) {
			String[] input = scanner.nextLine().split(" ");
			long b = Integer.parseInt(input[1]), c = Integer.parseInt(input[2]);
			switch(input[0]) {
			case "1":
				System.out.println(b + c);
				break;
			case "2":
				System.out.println(b - c);
				break;
			case "3":
				System.out.println(b * c);
				break;
			case "4":
				System.out.println(b / c);
				break;
			}
		}
	}
}
