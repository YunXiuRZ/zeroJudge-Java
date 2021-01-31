package a215;
import java.util.Scanner;
public class a215 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
			if(m < 0) {
				System.out.println(1);
				continue;
			}
			int plusNumber = n-1;
			int total = 0;
			while(m >= total) 
				total += ++plusNumber;
			int result = plusNumber - n + 1;
			System.out.println(result);
		}
	}

}
