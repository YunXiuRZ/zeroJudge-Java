package f442;
import java.util.Scanner;
public class f442 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] chicken = scanner.nextLine().split(" ");
		String eagle = scanner.nextLine();
		int Q = Integer.parseInt(scanner.nextLine());
		String[] caught = scanner.nextLine().split(" ");
		for(String s : caught) {
			for(int i = 0; i < N; i++) {
				if(chicken[i].equals(s)) {
					String temp = chicken[i];
					chicken[i] = eagle;
					eagle = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String s : chicken){
			sb.append(s);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}
