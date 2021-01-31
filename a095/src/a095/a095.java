package a095;
import java.util.Scanner;
public class a095 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			if(input[0].equals(input[1]))
				System.out.println(input[0]);
			else {
				int result = Integer.parseInt(input[1]) + 1;
				System.out.println(result);
			}
		}
		
	}

}
