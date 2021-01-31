package e798;
import java.util.Scanner;
public class e798 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		long[][] datas = new long[N][N];
		for(int i = 0; i < N; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < N; j++) {
				datas[i][j] = Long.parseLong(input[j]);
			}
		}
		
		for(int i = 0; i < N-1; i+=2) {
			for(int j = 0; j < N-1; j+=2) {
				long max = Long.MIN_VALUE;
				if(max < datas[i][j])
					max = datas[i][j];
				if(max < datas[i][j+1])
					max = datas[i][j+1];
				if(max < datas[i+1][j])
					max = datas[i+1][j];
				if(max < datas[i+1][j+1])
					max = datas[i+1][j+1];
				System.out.printf("%d ", max);
			}
			System.out.println("");
		}
	}

}
