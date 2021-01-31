package a021;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			BigNumber n1 = new BigNumber(input[0]);
			BigNumber n2 = new BigNumber(input[2]);
			Operator o = new Operator(n1, n2);
			BigNumber result = o.minus();
			System.out.println(result.toString());
		}
	}

}

class BigNumber{
	
	int[] numbers;
	int level = 0;
	
	public BigNumber(int l) {
		numbers = new int[l];
		for(int i = 0; i < l; i++) 
			numbers[i] = 0;
		level = l;
	}
	
	public BigNumber(String s) {
		String[] datas = s.split("");
		numbers = new int[datas.length];
		level = numbers.length;
		for(int i = 0; i < numbers.length; i++) 
			numbers[level - i - 1] = Integer.parseInt(datas[i]);
		System.out.println();
	}
	
	public void appendLevel(int l) {
		int[] temp = new int[level+l];
		System.arraycopy(numbers, 0, temp, 0, level);
		for(int i = level; i < level+l; i++) 
			temp[i] = 0;
		numbers = temp;
		level+=l;
	}
	
	public int getNumberOfIndex(int index) {
		if(index < this.level)
			return numbers[index];
		return 0;
	}
	
	public void setNumberOfIndex(int index, int value) {
		numbers[index] = value;
	}
	
	public void upTen() {
		for(int i = 0; i < level; i++) {
			if(numbers[i] >= 10) {
				if(i == level - 1)
					appendLevel(1);
				numbers[i+1] += numbers[i]/10;
				numbers[i]%=10;
			}
		}
	}
	
	public void downTen() {
		for(int i = 0; i < level - 1; i++) {
			if(numbers[i] < 0) {
				numbers[i]+=10;
				numbers[i + 1]--;
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		boolean hasNone0 = false;
		for(int i = level - 1; i >=0; i--) {
			int n = numbers[i];
			if(!hasNone0 && n == 0) 
				continue;
			hasNone0 = true;
			sb.append(n);
		}
		return sb.toString();
	}
	
	public void showNumbers() {
		for(int n : numbers)
			System.out.print(n);
		System.out.println();
	}
}

class Operator{
	
	BigNumber n1;
	BigNumber n2;
	
	public Operator(BigNumber bn1, BigNumber bn2) {
		n1 = bn1;
		n2 = bn2;
	}
	
	public void compare() {
		if(n1.level > n2.level) 
			n2.appendLevel(n1.level - n2.level);
		else if(n1.level < n2.level)
			n1.appendLevel(n2.level - n1.level);
		for(int i = n1.level - 1; i >= 0; i--) {
			if(n1.getNumberOfIndex(i) < n2.getNumberOfIndex(i)) {
				switchNumber();
				break;
			}
		}
	}
	
	public void switchNumber() {
		BigNumber temp = n1;
			n1 = n2;
			n2 = temp;
	}
	
	public BigNumber plus() {
		compare();
		int resultLevel = n1.level;
		BigNumber resultNumber = new BigNumber(resultLevel);
		for(int i = 0; i < resultLevel; i++) {
			int levelResult = n1.getNumberOfIndex(i) + n2.getNumberOfIndex(i);
			resultNumber.setNumberOfIndex(i, levelResult);
		}
		resultNumber.upTen();
		return resultNumber;
	}
	
	public BigNumber minus() {
		compare();
		n1.showNumbers();
		n2.showNumbers();
		int resultLevel = n1.level;
		BigNumber resultNumber = new BigNumber(resultLevel);
		for(int i = 0; i < resultLevel; i++) {
			int levelResult = n1.getNumberOfIndex(i) - n2.getNumberOfIndex(i);
			resultNumber.setNumberOfIndex(i,  levelResult);
		}
		System.out.println(resultNumber.toString());
		resultNumber.downTen();
		return resultNumber;
	}
}