package e796;
import java.util.Scanner;
public class e796 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input ;
		/*測資格式與範例不同
		 * input = scanner.nextLine().split(" ");
		 * int B = Integer.parseInt(input[0]),
		 *     P = Integer.parseInt(input[1]);
		 */
		int B = Integer.parseInt(scanner.nextLine()),
			P = Integer.parseInt(scanner.nextLine());
		
		int[] stops = new int[B];
		for(int i = 0; i < P; i++) {
			input = scanner.nextLine().split(" ");
			int start = Integer.parseInt(input[0]),
				finish = Integer.parseInt(input[1]);
			if(start > finish) {
				int temp = start;
				start = finish;
				finish = temp;
			}
			for(int j = start; j <= finish; j++) {
				stops[j-1]++;
			}
		}
		
		int min = 0, max = 0;
		for(int i = 1; i < B; i++) {
			if(stops[i] < stops[min])
				min = i;
			if(stops[i] >= stops[max])
				max = i;
		}
		System.out.printf("%d %d\n", min+1, max+1);
	}

}
