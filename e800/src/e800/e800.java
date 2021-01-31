package e800;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class e800 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		String[] videos = new String[N];
		int[] rates = new int[N];
		String[] input;
		for(int i = 0; i < N; i++) {
			input = scanner.nextLine().split(" ");
			videos[i] = input[0];
			int P = Integer.parseInt(input[1]),
				L = Integer.parseInt(input[2]),
				W = Integer.parseInt(input[3]),
				R = Integer.parseInt(input[4]);
			int rate = P * W / L * R;
			rates[i] = rate;
		}
		int[] ratesSort = Arrays.copyOf(rates, N);
		Arrays.sort(ratesSort);
		for(int j = N-1; j >= 0; j--) {
			for(int i = 0; i < N; i++) {
				if(ratesSort[j] == rates[i]) {
					rates[i] = 0;
					System.out.println(videos[i]);
					break;
				}
			}
		}
	}

}
