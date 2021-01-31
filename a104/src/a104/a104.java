package a104;
import java.util.Scanner;
import java.util.Arrays;
public class a104 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int length = Integer.parseInt(scanner.nextLine());
			String[] input = scanner.nextLine().split(" ");
			int[] numberList = new int[length];
			for(int i = 0; i < length; i++) {
				numberList[i] = Integer.parseInt(input[i]);
			}
			Arrays.sort(numberList);
			StringBuilder sb = new StringBuilder();
			for(int n : numberList)
				sb.append(n + " ");
			System.out.println(sb.toString());
		}
	}

}
