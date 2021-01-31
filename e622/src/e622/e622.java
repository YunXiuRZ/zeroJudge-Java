package e622;
import java.util.Scanner;
public class e622 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int n = Integer.parseInt(input[0]),
			S = Integer.parseInt(input[1]);
		int[] status = new int[n];
		S/=1000;
		int highest = 0;
		for(int i = 0; i < n; i++) {
			int sand = S;
			input = scanner.nextLine().split(" ");
			int cp = Integer.parseInt(input[0]),
				iv = Integer.parseInt(input[1]);
			while(sand > 0) {
				sand--;
				if(0 <= iv && iv <= 29) 
					cp+=10;
				else if(30 <= iv && iv <= 39) 
					cp+=50;
				else if(40 <= iv) 
					cp+=100;
			}
			if(status[highest] < cp)
				highest = i;
			status[i] = cp;
		}
		System.out.printf("%d %d\n", highest + 1, status[highest]);
	}

}
