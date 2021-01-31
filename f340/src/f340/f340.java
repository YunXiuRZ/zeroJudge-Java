package f340;
import java.util.Scanner;
public class f340 {

	public static int xr, yr;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		xr = Integer.parseInt(input[0]);
		yr = Integer.parseInt(input[1]);
		Tetris t = new Tetris(xr, yr);
		int N = scanner.nextInt();
		scanner.nextLine();
		input = scanner.nextLine().split(" ");
		for(String s : input) {
			if(s.equals("1"))
				t.right();
			else if(s.equals("2"))
				t.left();
			else if(s.equals("3")) {
				t.toFloor();
				break;
			}else if(s.equals("4"))
				t.spin();
			else
				t.down();
		}
		
	}

	class Tetris{
	
		int xMax;
		int yMax;
		int x;
		int y;
		int[][] area = {{0, 1, -1, -1}, {1, 0, -1, -1}, {1, 1, 0, -1}, {1, 1, -1, 0}};
		int areaPointer = 0;
		
		public Tetris(int x, int y) {
			this.xMax = x;
			this.yMax = y;
			this.x = (x+1)/2;
			this.y = y;
		}
	
		public boolean isFloor() {
			return y + area[areaPointer][2] == 1;
		}
	
		public void down() {
			if(!isFloor())
				y--;
		}
	
		public boolean isOutBound() {
			int areaMax = this.y + area[areaPointer][1];
			int areaMin = this.y + area[areaPointer][3];
			return (areaMin <= 0 || areaMax > yMax);
		}
		
		
		public void right() {
			if(isFloor())
				return;
			down();
			x++;
			if(isOutBound())
				x--;
		}
		
		public void left() {
			if(isFloor())
				return;
			down();
			x--;
			if(isOutBound())
				x++;
		}
		
		public void toFloor() {
			y = 1 - area[areaPointer][2];
		}
		
		public void spin() {
			if(isFloor())
				return;
			down();
			areaPointer = ++areaPointer % 4;
			if(isOutBound()) {
				areaPointer = (areaPointer + 3) % 4;
			}
		}
	}
}

