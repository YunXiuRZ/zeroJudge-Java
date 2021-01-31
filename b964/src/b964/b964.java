package b964;
import java.util.*;
public class b964 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int student = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] scores = new int[student];
		for(int i = 0; i < student; i++) {
			scores[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(scores);
		int worsePassScore = 101;
		int bestFailScore = -1;
		for(int n : scores) {
			System.out.print(n + " ");
			if(n >= 60 && n < worsePassScore) {
				worsePassScore = n;
			}
			if(n < 60 && n > bestFailScore) {
				bestFailScore = n;
			}
		}
		System.out.println();
		System.out.println(bestFailScore == -1 ? "best case" : bestFailScore);
		System.out.println(worsePassScore == 101 ? "worst case" : worsePassScore);
	}

}
