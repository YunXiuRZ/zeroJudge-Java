package c290;
import java.util.*;
public class c290 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("");
		boolean odd = true;
		int oddNum = 0, evenNum = 0;
		for(String s : input) {
			int n = Integer.parseInt(s);
			if(odd) {
				oddNum+=n;
			}else {
				evenNum+=n;
			}
			odd = !odd;
		}
		int secretDifference = oddNum - evenNum;
		if(evenNum > oddNum)
			secretDifference *= -1;
		System.out.println(secretDifference);
	}

}
