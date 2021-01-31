package e797;
import java.util.Scanner;
public class e797 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			T = Integer.parseInt(input[1]);
		String[][] datas = new String[N][T];
		for(int i = 0; i < N; i++) 
			datas[i] = scanner.nextLine().split(" ");
		
		System.out.print("AND:");
		for(int i = 0; i < T; i++) {
			boolean and = true;
			for(int j = 0; j < N; j++) {
				if(!datas[j][i].equals("1")) {
					and = false;
					break;
				}
			}
			if(and)
				System.out.print(" 1");
			else
				System.out.print(" 0");
		}
		System.out.println("");
		
		System.out.print(" OR:");
		for(int i = 0; i < T; i++) {
			boolean or = false;
			for(int j = 0; j < N; j++) {
				if(datas[j][i].equals("1")) {
					or = true;
					break;
				}
			}
			if(or)
				System.out.print(" 1");
			else
				System.out.print(" 0");
		}
		System.out.println("");
		
		System.out.print("XOR:");
		for(int i = 0; i < T; i++) {
			int oneCount = 0;
			for(int j = 0; j < N; j++) {
				if(datas[j][i].equals("1"))
					oneCount++;
			}
			if(oneCount%2 == 1)
				System.out.print(" 1");
			else
				System.out.print(" 0");
		}
		System.out.println("");
	}

}
