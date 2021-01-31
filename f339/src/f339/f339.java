package f339;
import java.util.Scanner;
public class f339 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		int[] road = new int[N];
		for(int i = 0; i < M; i++) {
			input = scanner.nextLine().split(" ");
			int start = Integer.parseInt(input[0]),
				finish = Integer.parseInt(input[1]);
			for(int j = start; j < finish; j++) {
				road[j] = 1;
			}
		}
		
		boolean flag = false;
		for(int i = 0; i < N; i++) {
			if(flag) {
				if(road[i] == 1) {
					flag = false;
					System.out.println(i);
				}
			}else {
				if(road[i] == 0) {
					flag = true;
					System.out.printf("%d ", i);
				}
			}
		}
		if(road[N-1] == 0)
			System.out.println(N);
	}

}
