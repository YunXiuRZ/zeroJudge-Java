package a040;
import java.util.*;
public class a040 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int n1 = Integer.parseInt(input[0]), n2 = Integer.parseInt(input[1]);
		StringBuilder sb = new StringBuilder();
		for(int i = n1; i <= n2; i++) {
			if(checkANumber(i))
				sb.append(i + " ");
		}
		String output = sb.toString();
		if(output.equals("")){
			System.out.println("none");
		}else {
			System.out.println(output);
		}
	}
	
	public static boolean checkANumber(int inputNumber) {
		String[] numberArray = String.valueOf(inputNumber).split("");
		int total = 0;
		for(String s: numberArray) {
			int n = Integer.parseInt(s);
			total+= (int)Math.pow(n, numberArray.length);
		}
		if(total == inputNumber)
			return true;
		return false;
	}
}
