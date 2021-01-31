package a024;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(divide(a,b));
	}
	
	public static int divide(int small, int big) {
		if(big%small == 0) {
			return small;
		}
		return divide(big%small, small);
	}
}
