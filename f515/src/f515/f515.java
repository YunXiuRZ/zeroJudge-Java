package f515;
import java.util.Scanner;
public class f515 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().toUpperCase().split(" ");
		for(String s : input) {
			if(s.equals("FOR"))
				System.out.print("4");
			else if(s.equals("TO"))
				System.out.print("2");
			else if(s.equals("AND"))
				System.out.print("n");
			else if(s.equals("YOU"))
				System.out.print("u");
			else
				System.out.print(s.charAt(0));
		}
	}

}
