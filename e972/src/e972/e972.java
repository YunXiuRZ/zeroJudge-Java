package e972;
import java.util.Scanner;
import java.util.HashMap;
public class e972 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("T", 1.0);
		hm.put("U", 30.9);
		hm.put("J", 0.28);
		hm.put("E", 34.5);
		double N = Double.parseDouble(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		double result = (N / hm.get(input[1]) - Double.parseDouble(input[0]));
		if(result >= 0 && result <= 0.05)
			result = 0.0;
		if(result < 0) 
			System.out.println("No Money");
		else 
			System.out.printf("%s %.2f\n", input[1], result);
	}

}
