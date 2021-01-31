package f168;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class f168 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		String[] input = scanner.nextLine().split(" ");
		V v = new V();
		int total = 0;
		for(int i = 0; i < N; i++) {
			v.add(Integer.parseInt(input[i]));
			total+=Integer.parseInt(input[i]);
		}
		
		v.sort();
		double ava = total/3;
		
		total = 0;
		LinkedList<Integer> selects = new LinkedList<Integer>();
		int[][] selectNumbers = new int[3][];
		int pointer = 0;
		boolean result = true;
		O:
		for(int i = 0; i < 3; i++) {
			while((double)total != ava) {
				int selectNumber = v.get(pointer);
				total+=selectNumber;
				if(total > ava) {
					total-=selectNumber;
					pointer++;
				}else {
					v.remove(selectNumber);
					selects.push(selectNumber);
				}
				
				while(pointer == v.size() && (double)total != ava) {
					if(selects.size() > 0) {
						int returnValue = selects.pop();
						total-=returnValue;
						v.add(returnValue);
						v.sort();
						pointer = v.getIndex(returnValue)+1;
					}else {
						result = false;
						break O;
					}
				}
			}
			Collections.reverse(selects);
			int[] n = new int[selects.size()];
			for(int j = 0; j < selects.size(); j++)
				n[j] = selects.get(j);
 			selectNumbers[i] = n;
			pointer = 0;
			selects.clear();
			total = 0;
		}
		if(result)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

class V{
	
	ArrayList<Integer> values = new ArrayList<Integer>();
	
	public void add(int v) {
		values.add(v);
	}
	
	public void sort() {
		Collections.sort(values, Collections.reverseOrder());
	}
	
	public Integer get(int index) {
		return values.get(index);
	}
	
	public void remove(int n) {
		for(Integer v : values) {
			if(v.equals(n)) {
				values.remove(v);
				return;
			}
		}
	}
	
	public int size() {
		return values.size();
	}
	
	public int getIndex(int n) {
		for(int i = 0; i < values.size(); i++) {
			Integer v = values.get(i);
			if(v.equals(n)) {
				return i;
			}
		}
		return -1;
	}
}

