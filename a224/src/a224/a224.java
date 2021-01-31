package a224;
import java.util.Scanner;
public class a224 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			char[] input = scanner.nextLine().toUpperCase().toCharArray();
			boolean[] isSelected = new boolean[input.length];
			boolean hasUnPair = false;
			boolean result = true;
			for(int i = 0; i < input.length; i++) {
				if((int)input[i] < 65 || (int)input[i] > 90) {
					isSelected[i] = true;
				}
			}
			for(int i = 0; i < input.length - 2; i++) {
				if(isSelected[i] == true)
					continue;
				char checkChar = input[i];
				for(int j = i+1; j < input.length; j++) {
					char pairChar = input[j];
					if(isSelected[j] == true)
						continue;
					if(checkChar == input[j]) {
						isSelected[i] = true;
						isSelected[j] = true;
						break;
					}
				}
				if(isSelected[i] == false) {
					if(hasUnPair == false)
						hasUnPair = true;
					else {
						result = false;
						break;
					}
				}
			}
			System.out.println(result? "yes !" : "no...");
		}
	}

}
