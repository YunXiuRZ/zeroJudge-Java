package f071;
import java.util.Scanner;
import java.util.HashMap;
public class f071 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] luck = new int[3];
		for(int i = 0; i < 3; i++) 
			luck[i] = Integer.parseInt(input[i]);
		input = scanner.nextLine().split(" ");
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		String[] input2 = scanner.nextLine().split(" ");
		for(int i = 0; i < 5; i++) {
			int key = Integer.parseInt(input[i]);
			int value = Integer.parseInt(input2[i]);
			if(hm.containsKey(key)) {
				int v = hm.get(key);
				hm.put(key, v + value);
			}else {
				hm.put(key, value);
			}
		}
			
		int result = 0;
		if(hm.containsKey(luck[0])) {
			result +=hm.get(luck[0]);
		}
		if(hm.containsKey(luck[1]))
			result+=hm.get(luck[1]);
		if(hm.containsKey(luck[2]))
			result-=hm.get(luck[2]);
		else
			result*=2;
		if(result<0)
			result = 0;
		System.out.println(result);
	}

}
