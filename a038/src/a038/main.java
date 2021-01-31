package a038;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb.reverse();
		while(!sb.toString().equals("")&&sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		if(sb.toString().equals("")) {
			sb.append("0");
		}
		System.out.println(sb.toString());
		
	}

}
