package e794;
import java.util.Scanner;
public class e794 {

	static int[] record = new int[46];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		record[0] = 1;
		record[1] = 1;
		System.out.printf("%d:%d\n", f(N-1), f(N));
	}

	public static int f(int n) {
		
		if(record[n] != 0) {
			return record[n];
		}else {
			record[n] = f(n-2) + f(n-1);
			return record[n];
		}
	}
}
