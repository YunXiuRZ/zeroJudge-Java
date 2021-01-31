package b966;
import java.util.*;
public class b966 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		LineList ll = new LineList();
		for(int i = 0; i < n; i++) {
			String[] input = scanner.nextLine().split(" ");
			Line l = new Line(Long.parseLong(input[0]), Long.parseLong(input[1]));
			ll.addLine(l);
		}
		System.out.println(ll.getAllDistance());
	}

}

class Line{
	
	public long start;
	public long finish;
	
	public Line(long s, long f) {
		start = s;
		finish = f;
	}
	
	public long getDistance() {
		long distance = finish - start;
		return distance;
	}
	
	public boolean isOverLapping(Line l) {
		if((this.start > l.start && this.start < l.finish) || (this.finish > l.start && this.finish < l.finish)) {
			return true;
		}
		return false;
	}
	
	public void combine(Line l) {
		if(this.start > l.start) {
			this.start = l.start;
		}
		if(this.finish < l.finish) {
			this.finish = l.finish;
		}
	}
}

class LineList{
	
	public ArrayList<Line> lineList = new ArrayList<>();
	
	public void addLine(Line l) {
		ArrayList<Line> deleteLineList = new ArrayList<Line>();
		for(Line checkLine : lineList) {
			if(checkTwoLine(checkLine, l)) {
				l.combine(checkLine);
				deleteLineList.add(checkLine);
			}
		}
		for(Line line : deleteLineList) {
			lineList.remove(line);
		}
		lineList.add(l);
	}
	
	public long getAllDistance() {
		long allDistance = 0;
		for(Line l : lineList) {
			allDistance+=l.getDistance();
		}
		return allDistance;
	}
	
	public boolean checkTwoLine(Line l1, Line l2) {
		return l1.isOverLapping(l2) || l2.isOverLapping(l1);
	}
}