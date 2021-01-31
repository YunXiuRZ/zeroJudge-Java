package a015;

import java.util.Scanner;
class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNext()){
    	String[] input = scanner.nextLine().split(" ");
    	int r = Integer.parseInt(input[0]),c = Integer.parseInt(input[1]);
    	String[][] integers = new String[r][c];
    	for(int i = 0; i < r; i++) {
    		integers[i] = scanner.nextLine().split(" ");
    	}
    	for(int i = 0; i < c; i++) {
    		for(int j = 0; j < r; j++) {
    			System.out.printf("%s ",integers[j][i]);
    		}
    		System.out.println("");
    	}
    }
  }
}
