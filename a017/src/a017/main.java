package a017;
import java.util.Scanner;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			Polynomial mp = new Polynomial();
			mp = PolynomialMaker.makePolynomial(input);
			System.out.println(mp.getValue());
		}
	}
}

class Number{
	public int value;
	public String operator;
	public Number nextNumber = null;
	
	public Number(int v, String o) {
		value = v;
		operator = o;
	}
	
	public void setNextNumber(Number n) {
		nextNumber = n;
	}
	
	public void setOperator(String o) {
		this.operator = o;
	}
	
	public boolean isPriority() {
		if(operator.equals("*")||operator.equals("/")||operator.equals("%")) {
			return true;
		}
		return false;
	}
	
	public void operate() {
		switch(this.operator){
		case "*":
			this.value*=nextNumber.value;
			break;
		case "/":
			this.value/=nextNumber.value;
			break;
		case "%":
			this.value%=nextNumber.value;
			break;
		case "+":
			this.value+=nextNumber.value;
			break;
		case "-":
			this.value-=nextNumber.value;
		}
		this.operator = nextNumber.operator;
		this.nextNumber = nextNumber.nextNumber;
	}
}

class Polynomial{
	public ArrayList<Number> numbers = new ArrayList<>();
	
	public void addNumber(Number n) {
		if(!numbers.isEmpty()) {
			this.getLastNumber().setNextNumber(n);
		}
		numbers.add(n);
	}
	
	public Number getLastNumber() {
		return numbers.get(numbers.size()-1);
	}
	
	public Number getPriorityNumber() {
		for(Number n:numbers) {
			if(n.isPriority()) {
				return n;
			}
		}
		return null;
	}
	
	public int getValue() {
		Number calcNumber = getPriorityNumber();
		while(calcNumber != null) {
			calcNumber.operate();
			calcNumber = getPriorityNumber();
		}
		while(numbers.get(0).nextNumber != null) {
			numbers.get(0).operate();
		}
		return numbers.get(0).value;
	}
	
	public String getOperator() {
		return numbers.get(0).operator;
	}

	
}

class PolynomialMaker{
	
	public static Polynomial makePolynomial(String[] datas) {
		Polynomial p = new Polynomial();
		for(int i = 0; i < datas.length; i++) {
			int value = 0;
			String operator;
			if(datas[i].equals("(")) {
				String[] internalPolynomial = getPriorityPolynomial(datas);
				Polynomial ip = makePolynomial(internalPolynomial);
				value = ip.getValue();
				i += internalPolynomial.length + 1;
			}else 
				value = Integer.parseInt(datas[i]);
			try {
				operator = datas[++i];
			}catch(ArrayIndexOutOfBoundsException e) {
				operator = "";
			}
			Number n = new Number(value, operator);
			p.addNumber(n);
		}
		return p;
	}
	
	public static String[] getPriorityPolynomial(String[] datas) {
		int startPosition = 0, endPosition = 0;
		int startCount = 0, endCount = 0;
		for(int i = 0; i < datas.length; i++) {
			if(datas[i].equals("(")) {
				startPosition = i;
				break;
			}
		}
		for(int i = startPosition; i < datas.length; i++) {
			if(datas[i].equals("("))
				startCount++;
			else if(datas[i].equals(")"))
				endCount++;
			if(startCount == endCount) {
				endPosition = i;
				break;
			}
		}
		String[] outputDatas = new String[endPosition - startPosition - 1];
		System.arraycopy(datas, startPosition + 1, outputDatas, 0, outputDatas.length);
		return outputDatas;
	}
}