package f513;
import java.util.Scanner;
public class f513 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int R = Integer.parseInt(input[0]),
			C = Integer.parseInt(input[1]);
		String[][] flags = new String[R][C];
		for(int i = 0; i < R; i++) 
			flags[i] = scanner.nextLine().split(" ");
		
		int[][] M = new int[][] {{-1, -1}, {-1, 0}, {-1, 1},
								 {0, -1}, {0, 1},
								 {1, -1}, {1, 0}, {1, 1}};
		int result = 0;
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				String ownFlag = flags[i][j];
				boolean hasSame = false;
				for(int[] n : M) {
					int pr = i + n[0],
						pc = j + n[1];
					if(pr < 0 || pr >= R || pc < 0 || pc >= C)
						continue;
					String neighFlag = flags[pr][pc];
					if(ownFlag.equals(neighFlag)) {
						hasSame = true;
						break;
					}
				}
				if(!hasSame)
					result++;
			}
		}
		System.out.println(result);
	}
	

}
