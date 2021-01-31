package a009;
import java.util.*;
import java.lang.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
			for(int i = 0; i < string.length(); i++) {
			int code = string.charAt(i)-7;
			System.out.print((char)code);
		}
	}

}
