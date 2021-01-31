package a225;
import java.util.Scanner;
import java.util.Arrays;
public class a225 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			String[] input = scanner.nextLine().split(" ");
			Element[] numbers = new Element[n];
			for(int i = 0; i < input.length; i++) {
				Element e = new Element(Integer.parseInt(input[i]));
				numbers[i] = e;
			}
			Arrays.sort(numbers);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) 
				sb.append(numbers[i].value + " ");
			System.out.println(sb);
		}
	}

}

class Element implements Comparable<Element>{
	public int value;
	public int digits;
	public int tens;
	
	public Element(int n) {
		value = n;
		digits = value%10;
		tens = value/10;
	}
	
	
	public int getDigits() {
		return digits;
	}
	
	public int getTens() {
		return tens;
	}
	
	public int compareTo(Element e) {
		if(this.getDigits() > e.getDigits()) 
			return 1;
		else if(this.getDigits() < e.getDigits()) 
			return -1;
		else {
			if(this.getTens() > e.getTens()) 
				return -1;
			else if(this.getTens() < e.getTens())
				return 1;
			else 
				return 0;
				
		}
	}
}