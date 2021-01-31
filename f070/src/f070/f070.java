package f070;
import java.util.Scanner;
public class f070 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] numbers = new int[3][2];
		String[] input;
		for(int i = 0; i < 3; i++) {
			input = scanner.nextLine().split(" ");
			numbers[i][0] = Integer.parseInt(input[0]);
			numbers[i][1] = Integer.parseInt(input[1]);
		}
		for(int i = numbers[0][1]; ; i+=numbers[0][0]) {
			boolean flag = (i%numbers[1][0] == numbers[1][1]) && (i%numbers[2][0] == numbers[2][1]);
			if(flag) {
				System.out.println(i);
				break;
			}
		}
	}

}
