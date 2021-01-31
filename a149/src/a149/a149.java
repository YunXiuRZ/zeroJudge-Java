package a149;
import java.util.Scanner;
public class a149 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < T; i++) {
			String[] input = scanner.nextLine().split("");
			int result = 1;
			for(String s : input) 
				result*=Integer.parseInt(s);
			System.out.println(result);
		}
	}

}
