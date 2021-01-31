package f337;
import java.util.Scanner;
public class f337 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		int min = N * 2,
			max = N * 3;
		int pizza = M * 8;
		if(pizza > max)
			System.out.println("Too much");
		else if(pizza >= min)
			System.out.println("Yes");
		else
			System.out.println("Not enough");
	}

}
