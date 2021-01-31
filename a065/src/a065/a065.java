package a065;
import java.util.Scanner;
public class a065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String input = scanner.nextLine();
			char[] charList = input.toCharArray();
			for(int i = 0; i < 6; i++) {
				int code = Math.abs(charList[i+1] - charList[i]);
				sb.append(code);
			}
			System.out.println(sb.toString());
		}
	}

}
