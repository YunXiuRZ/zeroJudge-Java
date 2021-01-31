package e968;
import java.util.Scanner;
public class e968 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] absent = new int[input.length];
		for(int i = 0; i < input.length; i++) 
			absent[i] = Integer.parseInt(input[i]);
		O:
		for(int i = N; i > 0; i--) {
			for(int n : absent) 
				if(n == i)
					continue O;
			System.out.printf("No. %d\n", i);
		}
	}

}
