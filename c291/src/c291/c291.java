package c291;
import java.util.Scanner;
import java.util.ArrayList;
public class c291 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		Class c = new Class();
		for(int i = 0; i< input.length; i++) {
			int friendNumber = Integer.parseInt(input[i]);
			c.addStudent();
			c.setFriend(i, friendNumber);
		}
		System.out.println(c.getGroupCount());
	}

}

class Class{
	
	public ArrayList<Student> students = new ArrayList<Student>();
	public static int studentCount = 0;
	
	public void addStudent() {
		Student s = new Student(studentCount++);
		students.add(s);
	}
	
	public void setFriend(int sn, int fn) {
		studentOfNumber(sn).setFriend(fn);
	}
	
	public Student getFriend(int n) {
		return studentOfNumber(studentOfNumber(n).getFriendNumber());
	}
	
	public Student studentOfNumber(int n) {
		for(Student s : students) {
			if(s.number == n) {
				return s;
			}
		}
		return null;
	}
	
	public Student getFriendOfNumber(int n) {
		return studentOfNumber(studentOfNumber(n).friend);
	}
	
	public int getGroupCount() {
		int count = 0;
		do {
			count++;
			Student pointer = students.remove(0);
			while(students.contains(studentOfNumber(pointer.getFriendNumber()))){
				pointer = studentOfNumber(pointer.getFriendNumber());
				students.remove(pointer);
			}
		}while(students.size() != 0);
		return count;
	}
}

class Student{
	
	public int number;
	public int friend;
	
	public Student(int n) {
		number = n;
	}
	
	public void setFriend(int n) {
		friend = n;
	}
	
	public int getFriendNumber() {
		return friend;
	}
}