package a034;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int input = Integer.parseInt(scanner.nextLine());
			int i = -1;
			while(input >= Math.pow(2, i+1)) {
				i++;
			}
			for(; i >=0; i--) {
				System.out.print((int)(input/Math.pow(2, i)));
				input%=Math.pow(2, i);
			}
			System.out.println();
		}
	}

}
