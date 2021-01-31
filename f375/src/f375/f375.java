package f375;
import java.util.Scanner;
public class f375 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int S = Integer.parseInt(input[0]),
			E = Integer.parseInt(input[1]),
			A = Integer.parseInt(input[2]);
		int day = 0;
		int growAmount = 0;
		A++;
		while(true) {
			day++;
			S += growAmount;
			if(S >= E) {
				System.out.println(day);
				break;
			}
			int c = day % 10;
			if(c == 0 || c == 9) {
				growAmount = 0;
			}else if(day % 3 == 0) {
				growAmount = S / 3;
			}else {
				growAmount = S / 10;
			}
			if(c == 1) {
				A--;
				if(A == 0) {
					System.out.println("unsalable");
					break;
				}
			}
		}
	}

}
