package e835;
import java.util.Scanner;
public class e835 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] C = new int[] {25, 50, 25};
		int N = scanner.nextInt();
		int area;
		if(N > 7500) {
			area = 3;
			N-=7500;
		}
		else if(N > 2500) {
			area = 2;
			N-=2500;
		}
		else
			area = 1;
		int row = N/C[area-1]+1,
			seat = N%C[area-1];
		if(seat == 0) {
			seat = C[area-1];
			row--;
		}
			
		System.out.printf("%d %d %d", area, row, seat);
	}

}
