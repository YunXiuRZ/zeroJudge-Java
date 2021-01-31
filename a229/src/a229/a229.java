package a229;
import java.util.Scanner;
public class a229 {

	static int n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			n = Integer.parseInt(scanner.nextLine());
			f("", 0, 0);
			System.out.println();
		}
	}
	
	public static void f(String s, int upper, int lowwer) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		if(upper + lowwer == 2 * n)
			System.out.println(s);
		if(upper < n) {
			sb.append("(");
			f(sb.toString(), upper+1, lowwer);
			sb.deleteCharAt(sb.length()-1);
		}
		if(lowwer < upper) {
			sb.append(")");
			f(sb.toString(), upper, lowwer+1);
		}
	}
}
