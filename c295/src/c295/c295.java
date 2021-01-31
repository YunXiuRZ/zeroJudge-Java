package c295;
import java.util.Scanner;
import java.util.Arrays;
public class c295 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		int total = 0;
		int[] selectNumbers = new int[N];
		for(int i = 0; i < N; i++) {
			input = scanner.nextLine().split(" ");
			int[] inputNumbers = new int[M];
			for(int j = 0; j < M; j++)
				inputNumbers[j] = Integer.parseInt(input[j]);
			Arrays.sort(inputNumbers);
			int select = inputNumbers[M - 1];
			selectNumbers[i] = select;
			total+=select;
		}
		StringBuilder sb = new StringBuilder();
		for(int n : selectNumbers) {
			if(total % n == 0) {
				sb.append(n);
				sb.append(" ");
			}
		}
		System.out.println(total);
		System.out.println(sb.length() == 0? -1 : sb.toString());
	}

}
