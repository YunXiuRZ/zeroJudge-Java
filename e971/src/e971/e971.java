package e971;
import java.util.Scanner;
import java.util.ArrayList;
public class e971 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int m = Integer.parseInt(input[0]),
			n = Integer.parseInt(input[1]);
		for(int i = 0; i < m; i++) {
			input = scanner.nextLine().split(" ");
			boolean start = false;
			ArrayList<Integer> area = new ArrayList<Integer>();
			for(int j = 0; j < n; j++) {
				String s = input[j];
				if(start) {
					if(s.equals("1")) {
						for(int N: area)
							input[N] = "1";
						start = false;
					}else {
						area.add(j);
					}
				}else {
					if(s.equals("1"))
						start = true;
				}
			}
			for(String string : input) {
					System.out.print(string);
					System.out.print(" ");
				}
				System.out.println("");
		}
	}

}
