package a147;
import java.util.Scanner;
public class a147 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int input = Integer.parseInt(scanner.nextLine());
			if(input == 0)
				break;
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i < input; i++) {
				if(i % 7 != 0)
					sb.append(i + " ");
			}
			System.out.println(sb.toString());
		}
	}
}