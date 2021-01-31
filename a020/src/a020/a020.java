package a020;
import java.util.*;
public class a020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[][] dic =  {
			{"A","10"}, {"B","11"}, {"C","12"}, {"D","13"}, {"E","14"}, {"F","15"}, {"G","16"}, {"H","17"}, {"I","34"},
			{"J","18"}, {"K","19"}, {"L","20"}, {"M","21"}, {"N","22"}, {"O","35"}, {"P","23"}, {"Q","24"}, {"R","25"},
			{"S","26"}, {"T","27"}, {"U","28"}, {"V","29"}, {"W","32"}, {"X","30"}, {"Y","31"}, {"Z","33"}
		};
		
		String[] input =scanner.nextLine().split("");
		int total = 0;
		int checkNumber = Integer.parseInt(input[8]);
		for(int i = 0; i < 8; i++) {
			total+=Integer.parseInt(input[i])*(8-i);
		}
		for(String[] s : dic) {
			int number = Integer.parseInt(s[1]);
			int tenthNumber = number/10, onethNumber = number%10;
			int allTotal = total + tenthNumber + onethNumber * 9;
			if(allTotal % 10 == checkNumber)
				sb.append(s[0]);
		}
		System.out.println(sb.toString());
	}
}
