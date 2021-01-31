package e973;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class e973 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] counts = new int[10];
		char[] input = scanner.nextLine().toCharArray();
		for(char c : input) {
			counts[(int)c - 48]++;
		}
		int[] clone = new int[10];
		for(int i = 0; i < 10; i++) {
			clone[i] = counts[i];
		}
		Arrays.sort(clone);
		for(int i = 9; i >= 0; i--) {
			int n = clone[i];
			if(n == 0)
				break;
			int index = 0;
			for(int j = 0; j < 10; j++) {
				if(counts[j] == n) {
					index = j;
					counts[j] = -1;
					break;
				}
			}
			System.out.print(index);
			System.out.print(" ");
		}
	}

}
