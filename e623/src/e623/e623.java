package e623;
import java.util.Scanner;
public class e623 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] item = new String[] {"Pen", "Pineapple", "Apple", "Pineapple pen"};
		int N = Integer.parseInt(scanner.nextLine());
		int round = 1;
		int total = 1;
		while(total * 4 < N) {
			total+= ++round;
		}
		total-= round;
		System.out.println(item[((N - total * 4 - 1) / round) % 4]);
	}

}
