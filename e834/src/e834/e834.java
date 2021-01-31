package e834;
import java.util.Scanner;
public class e834 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		scanner.nextLine();
		String[] input = scanner.nextLine().split(" ");
		int[] N = new int[input.length-1];
		for(int i = 0; i < input.length-1; i++) {
			N[i] = Integer.parseInt(input[i]);
		}
		
		for(int n : N) {
			if(n%M == 0)
				System.out.println(n/M);
			else {
				int k = n/M;
				System.out.println((k+1)*M-n);
			}
		}
	}

}
