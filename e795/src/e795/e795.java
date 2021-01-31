package e795;
import java.util.Scanner;
public class e795 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < N; i++) {
			String input = scanner.nextLine();
			int number = Integer.parseInt(input);
			boolean flag = true;
			for(int j = input.length(); j > 0; j--) {
				if(!isPrime(number)) {
					flag = false;
					break;
				}else 
					number = cutHead(number, j);
			}
			if(flag)
				System.out.println(input + " is a Prime Day!");
			else
				System.out.println(input + " isn't a Prime Day!");
		}
	}

	public static boolean isPrime(int n) {
		int sqrt = (int)Math.sqrt(n);
		for(int i = 2; i <= sqrt; i++) 
			if(n % i == 0)
				return false;
		return true;
	}
	
	public static int cutHead(int n, int head) {
		int level = (int)Math.pow(10, head-1);
		int lead = n/level;
		return n - lead * level;
	}
}
