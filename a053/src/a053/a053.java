package a053;
import java.util.Scanner;
public class a053 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			int count = 0;
			if(n >= 10) {
				count += 60;
				n -= 10;
				if(n >= 10) {
					count += 20;
					n -= 10;
					if(n >= 20) {
						count = 100;
					}else {
						count += n;
					}
				}else {
					count += n*2;
				}
			}else {
				count += n*6;
			}
			System.out.println(count);
		}
	}

}
