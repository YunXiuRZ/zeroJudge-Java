package e837;
import java.util.Scanner;
public class e837 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		int[] dif = new int[input.length];
		for(int i = 1; i < input.length; i++) {
			dif[i] = input[i] - input[i-1];
		}
		dif[0] = input[0];
		
		int max = 1;
		int startIndex = 0;
		int count = 1;
		for(int i = 0; i < dif.length; i++) {
			if(dif[i] == 1) {
				count++;
			}else {
				if(count>=max) {
					max = count;
					startIndex = i-count;
				}
				count = 1;
			}
		}
		if(max == 1)
			startIndex = input.length-1;
		System.out.printf("%d ", max);
		for(int i = 0; i < max; i++) {
			System.out.print(input[startIndex + i]);
		}
	}

}
