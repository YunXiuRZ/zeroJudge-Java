package c294;
import java.util.Scanner;
import java.util.Arrays;
public class c294 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] numbers = new int[] {Integer.parseInt(input[0]),
							       Integer.parseInt(input[1]),
								   Integer.parseInt(input[2])};
		Arrays.sort(numbers);
		StringBuilder sb = new StringBuilder();
		for(int n : numbers) {
			sb.append(n);
			sb.append(" ");
		}
		System.out.println(sb.toString());
		int left = numbers[0] * numbers[0] + numbers[1] * numbers[1];
		int right = numbers[2] * numbers[2];
		if(numbers[0] + numbers[1] <= numbers[2])
			System.out.println("No");
		else if(left < right)
			System.out.println("Obtuse");
		else if(left == right)
			System.out.println("Right");
		else
			System.out.println("Acute");
	}

}
