package e621;
import java.util.Scanner;
public class e621 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < N; i++) {
			boolean flag = false;
			String[] input = scanner.nextLine().split(" ");
			int A = Integer.parseInt(input[0]),
				B = Integer.parseInt(input[1]),
				C = Integer.parseInt(input[2]);
			for(int j = A + 1; j < B; j++) {
				if(!(j % C == 0)) {
					flag = true;
					System.out.print(j);
					System.out.print(" ");
				}
			}
			if(!flag)
				System.out.print("No free parking spaces.");
			System.out.println("");
		}
	}

}
