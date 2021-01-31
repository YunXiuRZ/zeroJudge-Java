package e806;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
public class e806 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		for(int i = 0; i < n1; i++) {
			int pow = Integer.parseInt(input[i * 2]),
				number = Integer.parseInt(input[i * 2 + 1]);
			if(tm.containsKey(pow)) {
				tm.replace(pow, tm.get(pow) + number);
			}else {
				tm.put(pow, number);
			}
		}
		int n2 = Integer.parseInt(scanner.nextLine());
		input = scanner.nextLine().split(" ");
		for(int i = 0; i < n2; i++) {
			int pow = Integer.parseInt(input[i * 2]),
				number = Integer.parseInt(input[i * 2 + 1]);
			if(tm.containsKey(pow)) {
				tm.replace(pow, tm.get(pow) + number);
			}else {
				tm.put(pow, number);
			}
		}
		boolean flag = false;
		for(Integer n : tm.keySet()) {
			if(tm.get(n) != 0) {
				flag = true;
				System.out.printf("%d:%d\n", n, tm.get(n));
			}
		}
		if(!flag) {
			System.out.println("NULL!");
		}
	}

}
