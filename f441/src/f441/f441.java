package f441;
import java.util.Scanner;
public class f441 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			S = Integer.parseInt(input[1]);
		String[] answer = scanner.nextLine().split(" ");
		int student = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < student; i++) {
			int score = 0;
			String[] studentAnswer = scanner.nextLine().split(" ");
			for(int j = 0; j < N; j++) 
				if(answer[j].equals(studentAnswer[j]))
					score+=S;
			System.out.println(score);
		}
	}
}
