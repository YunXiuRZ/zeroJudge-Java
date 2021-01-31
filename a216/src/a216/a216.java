package a216;
import java.util.Scanner;
public class a216 {
	public static long[] fList = new long[30000];
	public static long[] gList = new long[30001];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 30000; i++) {
			fList[i] = -1;
			gList[i] = -1;
		}
		fList[0] = 1;
		gList[0] = 0;
		gList[1] = 1;
		gList[30000] = -1;
		while(scanner.hasNext()) {
			int n = Integer.parseInt(scanner.nextLine());
			System.out.printf("%d %d\n", f(n), g(n));
		}
	}

	public static long f(int l) {
		if(fList[l-1] == -1) 
			fList[l-1] = l + f(l-1);
		return fList[l-1];
	}
	
	public static long g(int l) {
		if(gList[l] == -1) 
			gList[l] = f(l) + g(l-1);
		return gList[l];
	}
}
