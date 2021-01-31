package e808;
import java.util.Scanner;
public class e808 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] times = new int[N + 1];
		String[] input = scanner.nextLine().split(" ");
		times[0] = Integer.parseInt(input[0]) * 60 + Integer.parseInt(input[1]);
		for(int i = 1; i <= N; i++) {
			int t = Integer.parseInt(scanner.nextLine());
			times[i] = times[i - 1] + t;
		}
		input = scanner.nextLine().split(" ");
		for(String s : input) {
			if(s.equals("0"))
				break;
			int result = times[Integer.parseInt(s)] % 1440;
			int h = result / 60,
				m = result % 60;
			String sh = "", sm = "";
			if(h / 10 < 1) 
				sh = "0";
			sh+=h;
			if(m / 10 < 1)
				sm = "0";
			sm+=m;
			System.out.printf("%s:%s\n", sh, sm);
		}
	}

}
