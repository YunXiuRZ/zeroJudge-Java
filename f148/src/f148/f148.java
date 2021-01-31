package f148;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
public class f148 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<Character, Integer[]> map = new TreeMap<Character, Integer[]>();
		String[] input = scanner.nextLine().split(" ");
		int W = Integer.parseInt(input[0]),
			H = Integer.parseInt(input[1]);
		int N = Integer.parseInt(scanner.nextLine());
		ArrayList<Character> names = new ArrayList<Character>();
		for(int i = 0; i < W; i++) {
			input = scanner.nextLine().split(" ");
			StringBuilder sb = new StringBuilder();
			for(String s : input)
				sb.append(s);
			char[] spots = sb.toString().toCharArray();
			for(int j = 0; j < H; j++) {
				if(spots[j] != '0') {
					names.add(spots[j]);
					map.put(Character.valueOf(spots[j]) , new Integer[] {i, j});
				}
			}
		}
		if(map.size() < N)
			System.out.println("Mission fail.");
		else {
			Collections.sort(names);
			int count = 0;
			for(Character c : names) {
				System.out.printf("%d %d\n", map.get(c)[0], map.get(c)[1]);
				count++;
				if(count == N)
					break;
			}
		}
	}

}
