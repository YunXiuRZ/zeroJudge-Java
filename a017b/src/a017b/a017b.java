package a017b;
import java.util.Scanner;


import java.util.ArrayList;
public class a017b {

	public static void main(String[] args) {
		String[] operators = {"(", "+", "-", "*", "/", "%"};
		int[] prioritition = {0, 1, 1, 2, 2, 2};
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String[] input = scanner.nextLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for(String s : input) 
				sb.append(s);
			String[] datas = sb.toString().split("");
			ArrayList<String> polynomial = new ArrayList<String>();
			Stack<String> s = new Stack<String>();
			for(String data : datas) {
				try{
					int n = Integer.parseInt(data);
					polynomial.add(String.valueOf(n));
				}catch(NumberFormatException e) {
					if(data.equals(")")) {
						String stringBuffer;
						while(true) {
							stringBuffer = s.pop();
							if(stringBuffer == null || stringBuffer.equals('(')) {
								break;
							}else {
								polynomial.add(stringBuffer);
							}
						}
					}else if (data.equals("(")) 
						s.push(data);
					else {
						int tokenIndex = 0;
						for(int i = 0; i < 6; i++) {
							if(data.equals(operators[i])) {
								tokenIndex = i;
								break;
							}
						}
						while(true) {
							String compareToken = s.pop();
							int compareIndex = 0;
							if(compareToken == null) {
								s.push(data);
								break;
							}else {
								for(int i = 0; i < 6; i++) {
									if(compareToken.equals(operators[i])) {
										compareIndex = i;
										break;
									}
								}
							}
							if(prioritition[tokenIndex] > prioritition[compareIndex]) {
								s.push(compareToken);
								s.push(data);
								break;
							}
							else {
								polynomial.add(compareToken);
							}
						}
					}
				}
			}
			while(true) {
				String temp = s.pop();
				if(temp == null)
					break;
				else if(temp.equals(')'))
					continue;
				polynomial.add(temp);
			}
			for(String string : polynomial) {
				System.out.print(string);
			}
			System.out.println();
			Stack<Integer> operateStack = new Stack<Integer>();
			for(String element : polynomial) {
				try {
					int number = Integer.parseInt(element);
					operateStack.push(number);
				}catch(NumberFormatException e) {
					int n1 = operateStack.pop(), n2 = operateStack.pop();
					int result = 0;
					switch(element) {
					case "+":
						result = n2 + n1;
						operateStack.push(result);
						break;
					case "-":
						result = n2 - n1;
						operateStack.push(result);
						break;
					case "*":
						result = n2 * n1;
						operateStack.push(result);
						break;
					case "/":
						result = n2 / n1;
						operateStack.push(result);
						break;
					case "%":
						result = n2 % n1;
						operateStack.push(result);
						break;
					}
				}
			}
			System.out.println(operateStack.pop());
			}
		}

	}

class Stack<T>{
	ArrayList<T> stack = new ArrayList<T>();
	
	public void push(T c) {
		stack.add(c);
	}
	
	public T pop() {
		if(stack.size() == 0)
			return null;
		return stack.remove(stack.size() - 1);
	}
}