package a013;
import java.util.*;
import java.lang.String;
public class main {

	public static void main(String[] args) {
		String[] romanNumber = {"I","V","X","L","C","D","M"};
		int[] romanInteger = {1,5,10,50,100,500,1000};
		Scanner scanner = new Scanner(System.in);
		String check = "1";
		while(!check.equals("#")) {
			String[] input = scanner.nextLine().split(" ");
			if(input[0].equals("#")) {
				check = "#";
				continue;
			}
			String[][] charList = {input[0].split(""),input[1].split("")};
			int[] a = new int[charList[0].length],b = new int[charList[1].length];
			int[][] intList = {a,b};
			for(int j = 0; j < 2; j++) {
				for(int i = 0; i < charList[j].length; i++) {
					switch(charList[j][i]) {
					case "I":
						intList[j][i] = 1;
						break;
					case "V":
						intList[j][i] = 5;
						break;
					case "X":
						intList[j][i] = 10;
						break;
					case "L":
						intList[j][i] = 50;
						break;
					case "C":
						intList[j][i] = 100;
						break;
					case "D":
						intList[j][i] = 500;
						break;
					case "M":
						intList[j][i] = 1000;
						break;
					}
				}
			}
			int[] integers = {0,0};
			for(int i = 0; i < 2; i++) {
				int temp = 0;
				for(int j = intList[i].length-1; j >=0; j--) {
					if(intList[i][j] >= temp) {
						integers[i]+=intList[i][j];
						temp = intList[i][j];
					}else {
						integers[i]-=intList[i][j];
					}
				}
			}
			int resultInteger = integers[0] - integers[1];
			if(resultInteger < 0){
				resultInteger*=-1;
			}
			int[] romanCount = new int[7];
			for(int i = 6; i >= 0; i--) {
				romanCount[i] = resultInteger/romanInteger[i];
				resultInteger%=romanInteger[i];
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < romanCount.length; i++) {
				if(romanCount[i] == 4) {
					switch(romanCount[i+1]) {
					case 0:
						sb.append(romanNumber[i+1]+romanNumber[i]);
						break;
					case 1:
						sb.append(romanNumber[i+2]+romanNumber[i]);
					}
					romanCount[i+1] = 0;
				}else {
					for(int j = 1; j <= romanCount[i]; j++) {
						sb.append(romanNumber[i]);
					}
				}
			}
			sb.reverse();
			if(sb.toString().equals("")) {
				System.out.println("ZERO");
			}else {
				System.out.println(sb);
			}
		}
	}
}
