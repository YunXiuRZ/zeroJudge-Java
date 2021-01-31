package b266;
import java.util.*;
public class b266 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int line = Integer.parseInt(input[0]);
		int row = Integer.parseInt(input[1]);
		String[][] array = new String[line][];
		for(int i = 0; i < line; i++) {
			array[i] = scanner.nextLine().split(" ");
		}
		String[] operates = scanner.nextLine().split(" ");
		String[][] temp = new String[1][1];
		for(int i = 0; i < operates.length; i++) {
			switch(operates[i]) {
			case "1":
				temp = new String[line][row];
				for(int j = 0; j < line; j++) {
					temp[j] = array[line - j - 1];
				}
				array = temp;
				break;
			case "0":
				temp = new String[row][line];
				for(int j = 0; j < row; j++) {
					for(int k = 0; k < line; k++) {
						temp[j][k] = array[line - k - 1][j];
					}
				}
				int n = line;
				line = row;
				row = n;
				array = temp;
			}
		}
		System.out.printf("%d %d\n", line, row);
		StringBuilder sb = new StringBuilder();
		for(String[] sa : array) {
			for(String s : sa) {
				sb.append(s+" ");
			}
			sb.append(String.format("\n"));
		}
		System.out.print(sb.toString());
	}

}
