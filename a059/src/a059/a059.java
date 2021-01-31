package a059;
import java.util.Scanner;
public class a059 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases = Integer.parseInt(scanner.nextLine());
		for(int i = 1; i <= cases; i++) {
			int total = 0;
			int n = Integer.parseInt(scanner.nextLine());
			int m = Integer.parseInt(scanner.nextLine());
			for(int j = n; j <= m; j++) {
				if(isSquareNumber(j)) {
					total+=j;
				}
			}
			System.out.printf("Case %d: %d\n", i, total);
		}
	}
	
	public static boolean isSquareNumber(int n) {
		if((int)Math.sqrt(n) == Math.sqrt(n))
			return true;
		return false;
	}
}
