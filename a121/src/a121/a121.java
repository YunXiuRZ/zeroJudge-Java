package a121;
import java.util.Scanner;
public class a121 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
			int count = 0;
			for(int i = a; i <= b; i++) {
				if(isPrimeNumber(i))
					count++;
			}
			System.out.println(count);
		}
	}

	public static boolean isPrimeNumber(int n) {
		if(n == 1)
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}

