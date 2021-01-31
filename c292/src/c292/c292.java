package c292;
import java.util.Scanner;
public class c292 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		Numbers n = new Numbers(N);
		int turn = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < N; i++) {
			n.setLine(i, scanner.nextLine().split(" "));
		}
		n.printCurrent();
		int count = 0;
		int step = count/2 + 1;
		int xm = 0, ym = 0;
		while(step < N) {
			switch(turn % 4) {
			case 0:
				xm = -1;
				ym = 0;
				break;
			case 1:
				xm = 0;
				ym = -1;
				break;
			case 2:
				xm = 1;
				ym = 0;
				break;
			case 3:
				xm = 0;
				ym = 1;
				break;
			}
			for(int i = 0; i < step; i++) {
				n.move(xm, ym);
				n.printCurrent();
			}
			count++;
			step = count/2 + 1;
			turn++;
		}
		step--;
		switch(turn % 4) {
		case 0:
			xm = -1;
			ym = 0;
			break;
		case 1:
			xm = 0;
			ym = -1;
			break;
		case 2:
			xm = 1;
			ym = 0;
			break;
		case 3:
			xm = 0;
			ym = 1;
			break;
		}
		for(int i = 0; i < step; i++) {
			n.move(xm, ym);
			n.printCurrent();
		}
	}

}

class Numbers{
	
	String[][] numbers;
	int[] position;
	
	public Numbers(int N) {
		numbers = new String[N][N];
		position = new int[] {N/2, N/2};
	}
	
	public void setLine(int index, String[] s) {
		numbers[index] = s;
	}
	
	public void move(int xm, int ym) {
		position[0]+= xm;
		position[1]+= ym;
	}
	
	public void printCurrent() {
		System.out.print(numbers[position[1]][position[0]]);
	}
}