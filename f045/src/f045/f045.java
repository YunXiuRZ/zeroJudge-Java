package f045;
import java.util.Scanner;
import java.util.Arrays;
public class f045 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		int[] numbers = new int[9];
		for(int i = 0; i < 9; i++) 
			numbers[i] = input[i] - 48;
		int checkNumber = 100 * numbers[6] + 10 * numbers[7] + numbers[8];
		Arrays.sort(numbers);
		int check = numbers[8]*numbers[8] + numbers[7]*numbers[7];
		if(check == checkNumber)
			System.out.println("Good Morning!");
		else
			System.out.println("SPY!");
	}

}
