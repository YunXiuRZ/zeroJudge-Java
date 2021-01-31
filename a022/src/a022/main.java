package a022;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		String rs = sb.toString();
		if(rs.equals(sb.reverse().toString())) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
