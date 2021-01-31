package e969;
import java.util.Scanner;
public class e969 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		boolean pie = true;
		int totalTime = 0;
		if(input[2].equals("1"))
			pie = false;
		while(N >= getPrice(pie)) {
			N -= getPrice(pie);
			String eat = pie? "eats an Apple pie" : "drinks a Corn soup";
			String s = "s";
			if(N == 1)
				s = "";
			if(N == 0)
				System.out.printf("%d: Wayne %s, and now he doesn't have money.\n", totalTime, eat);
			else
				System.out.printf("%d: Wayne %s, and now he has %d dollar%s.\n", totalTime, eat, N, s);
			totalTime+=M;
			pie = !pie;
		}
		if(totalTime == 0)
			System.out.println("Wayne can't eat and drink.");
	}

	public static int getPrice(boolean pie) {
		if(pie)
			return 32;
		else
			return 55;
	}
}
