package e975;
import java.util.Scanner;
public class e975 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.replaceAll(" ", "").toLowerCase();
		char[] letters = input.toCharArray();
		for(int k = 0; ; k++) {
			change(letters);
			String check = new String(letters);
			if(check.contains("love")) {
				k++;
				k%=26;
				System.out.print(k);
				break;
			}
		}
	}
	
	public static void change(char[] letters) {
		for(int i = 0; i < letters.length; i++) {
			letters[i] = (char)((letters[i] - 97 + 1) % 26 + 97);
		}
	}

}
