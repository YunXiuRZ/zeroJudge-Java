package f167;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
public class f167 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]);
		Offices offices = new Offices();
		
		for(int i = 1; i <= N; i++) {
			Office o = new Office(i);
			offices.addOffice(o);
		}
		
		for(int i = 0; i < M; i++) {
			input = scanner.nextLine().split(" ");
			Office a = offices.getOfficeById(Integer.parseInt(input[0])),
				   b = offices.getOfficeById(Integer.parseInt(input[1]));
			b.addPre(a);
		}
		
		LinkedList<Office> waitForVisit = new LinkedList<Office>();
		ArrayList<Office> hasVisit = new ArrayList<Office>();
		boolean result = true;
		
		O:
		while(!offices.allVisit()) {
			Office o = offices.getOfficeNotVisit();
			waitForVisit.add(o);
			while(!o.canVisit()) {
				o = o.getPreOfficeNoVisit();
				if(waitForVisit.contains(o)) {
					result = false;
					break O;
				}
				waitForVisit.push(o);
			}
			
			while(!waitForVisit.isEmpty()) {
				Office visitOffice = waitForVisit.pop();
				if(visitOffice.canVisit()) {
					visitOffice.visit();
					hasVisit.add(visitOffice);
				}
			}
		}
		
		if(result) {
			System.out.println("YES");
			for(Office o : hasVisit)
				System.out.println(o.id);
		}else
			System.out.println("NO");
	}
}

class Office{
	
	boolean hasVisit = false;
	ArrayList<Office> preOffice = new ArrayList<Office>();
	int id;
	
	public Office(int n) {
		id = n;
	}
	
	public void addPre(Office o) {
		preOffice.add(o);
	}
	
	public boolean canVisit() {
		for(Office o : preOffice) 
			if(o.hasVisit == false) 
				return false;
		return true;
	}
	
	public Office getPreOfficeNoVisit() {
		for(Office o : preOffice)
			if(o.hasVisit == false)
				return o;
		return null;
	}
	
	public void visit() {
		this.hasVisit = true;
	}
}

class Offices{
	
	ArrayList<Office> offices = new ArrayList<Office>();
	
	public void addOffice(Office o) {
		offices.add(o);
	}
	
	public Office getOfficeById(int n) {
		for(Office o : offices) 
			if(o.id == n) 
				return o;
		return null;
	}
	
	public Office getOfficeNotVisit() {
		for(Office o : offices)
			if(o.hasVisit == false)
				return o;
		return null;
	}
	
	public boolean allVisit() {
		for(Office o : offices)
			if(o.hasVisit == false)
				return false;
		return true;
	}
}

