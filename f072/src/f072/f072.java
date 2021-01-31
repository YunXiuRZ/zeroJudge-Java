package f072;
import java.util.Scanner;
import java.util.ArrayList;
public class f072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		boolean[] canPlant = new boolean[N];
		int[] range = new int[2];
		
		for(int i = 0; i < N; i++) 
			if(!input[i].equals("1")) 
				canPlant[i] = true;
			else
				canPlant[i] = false;
		
		for(int i = 0; i < N; i++) {
			if(input[i].equals("9")) {
				for(int j = i - 1; j <= i+1; j++) {
					try {
						canPlant[j] = false;
					}catch(Exception e) {
						
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(input[i].equals("1")) {
				range[0] = i;
				break;
			}
		}
		
		for(int i = N-1; i >= 0; i--) {
			if(input[i].equals("1")) {
				range[1] = i;
				break;
			}
		}
		
		int result = 0;
		for(int i = range[0] + 1; i < range[1]; i++) {
			if(canPlant[i])
				result++;
		}
		System.out.println(result);
	}

}
