package e807;
import java.util.Scanner;
public class e807 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] biggestDatas = new double[5];
		int biggest = 0;
		for(int i = 1; i <= 7; i++) {
			String[] input = scanner.nextLine().split(" ");
			double[] datas = new double[4];
			for(int j = 0; j < 4; j++) {
				datas[j] = Double.parseDouble(input[j]);
			}
			biggestDatas[0]+=datas[0];
			biggestDatas[1]+=datas[1];
			biggestDatas[2]+=datas[2];
			biggestDatas[3]+=datas[3];
			double total = datas[0] + datas[1] + datas[2] + datas[3]; 
			if(total > biggestDatas[4]) {
				biggestDatas[4] = total;
				biggest = i;
			}
		}
		System.out.println(biggest);
		int result = 0;
		for(int i = 0; i < 4; i++) {
			if(biggestDatas[i] > biggestDatas[result])
				result = i;
		}
		String output = "";
		switch(result) {
		case 0:
			output = "morning";
			break;
		case 1:
			output = "afternoon";
			break;
		case 2:
			output = "night";
			break;
		case 3:
			output = "early morning";
			break;
		}
		System.out.println(output);
	}

}
