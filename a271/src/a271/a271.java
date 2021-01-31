package a271;
import java.util.Scanner;
public class a271 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataAmount = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < dataAmount; i++) {
			String[] input = scanner.nextLine().split(" ");
			int x = Integer.parseInt(input[0]),
				y = Integer.parseInt(input[1]),
				z = Integer.parseInt(input[2]),
				w = Integer.parseInt(input[3]),
				n = Integer.parseInt(input[4]),
				m = input.length == 6 ?Integer.parseInt(input[5]) : 1;
			input = scanner.nextLine().split(" ");
			Rabbit rabbit = new Rabbit(m); 
			for(int j = 0; j < m; j++)
		}
	}
}

class Rabbit{
	
	int weight;
	int poison = 0;
	
	public Rabbit(int w) {
		weight = w;
	}
	
	public boolean 
}