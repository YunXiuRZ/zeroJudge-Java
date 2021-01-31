package a148;
import java.util.Scanner;
public class a148 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int total = 0;
			for(int i = 1; i <= n; i++) {
				total+= Integer.parseInt(input[i]);
			}
			double ava = (double)total / n;
			System.out.println(ava > 59.0? "no" : "yes");
		}
	}

}
