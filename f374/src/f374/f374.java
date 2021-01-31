package f374;
import java.util.Scanner;
public class f374 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		sb.append(input[1]);
		String[] powerList = sb.reverse().toString().split("");
		int maxium = 0;
		int resultNumber = 0;
		int N = Integer.parseInt(input[0]);
		int totalPower = 0, people = 0;
		for(int i = 0; i < powerList.length; i++) {
			totalPower+=Integer.parseInt(powerList[i]);
			people++;
			if(people == N || i == powerList.length - 1) {
				if(totalPower >= maxium) {
					resultNumber = i / N + 1;
					maxium = totalPower;
				}
				people = 0;
					totalPower = 0;
			}
		}
		System.out.printf("%d %d", resultNumber, maxium);
	}

}
