package f341;
import java.util.Scanner;
public class f341 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder S = new StringBuilder(scanner.nextLine());
		String T = scanner.nextLine();
		int start = S.indexOf(T);
		StringBuilder sb = new StringBuilder();
		StringBuilder head = new StringBuilder(S.substring(0, start));
		StringBuilder tail = new StringBuilder(S.substring(start+T.length()));
		sb.append(tail.reverse());
		sb.append(T);
		sb.append(head.reverse());
		System.out.println(sb);
	}

}
