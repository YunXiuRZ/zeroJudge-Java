package e970;
import java.util.Scanner;
public class e970 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] numbers = new int[N];
		for(int i = 0; i < N; i++) 
			numbers[i] = Integer.parseInt(input[i]);
		int B = numbers[N - 1];
		int total = 0;
		for(int i = 0; i < N; i+=B) {
			total+=numbers[i];
		}
		int index = total % N;
		if(index == 0)
			index = N;
		System.out.printf("%d %d\n", index, numbers[index - 1]);
	}

}
