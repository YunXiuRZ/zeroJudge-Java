package f514;
import java.util.Scanner;
import java.util.Arrays;
public class f514 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] S = scanner.nextLine().toCharArray();
		char[] T = scanner.nextLine().toCharArray();
		for(char c: T) {
			int i;
			for(i = 0; i < S.length; i++) {
				if(S[i] == c) {
					System.out.printf("%d ", i+1);
					S[i] = '0';
					break;
				}
			}
			if(i == S.length)
				System.out.print("X ");
		}
	}

}
