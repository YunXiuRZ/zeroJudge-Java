package c296;
import java.util.Scanner;
import java.util.ArrayList;
public class c296 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int N = Integer.parseInt(input[0]),
			M = Integer.parseInt(input[1]),
			K = Integer.parseInt(input[2]);
		Students students = new Students(N, M);
		for(int i = 0; i < K; i++) {
			students.bomb();
		}
		System.out.println(students.getPointer().id);
	}

}

class Students{
	
	private int M;
	private static int studentCount = 0;
	ArrayList<Student> studentList = new ArrayList<Student>();
	private Student pointer;
	
	public Students(int N, int M) {
		this.M = M;
		for(int i = 0; i < N; i++) {
			addStudent();
		}
		makeCircle();
		pointer = studentList.get(0);
	}
	
	public void bomb() {
		for(int i = 1; i < M; i++) {
			pointer = pointer.getNext();
		}
		deleteStudent();
	}
	
	public void deleteStudent() {
		Student pre = pointer.getPre();
		Student next = pointer.getNext();
		pre.setNext(next);
		next.setPre(pre);
		pointer = next;
	}
	
	public void addStudent() {
		Student s = new Student(++studentCount);
		if(studentList.isEmpty()) {
			makeRelation(s, s);
		}else {
			makeRelation(studentList.get(studentList.size() - 1), s);
		}
		studentList.add(s);
	}
	
	private void makeRelation(Student pre, Student next) {
		pre.setNext(next);
		next.setPre(pre);
	}
	
	public void makeCircle() {
		makeRelation(studentList.get(studentList.size() - 1), studentList.get(0));
	}
	
	public Student getPointer() {
		return pointer;
	}
	
	class Student{
		
		public int id;
		private Student nextStudent = null;
		private Student preStudent = null;
		
		public Student(int n) {
			id = n;
		}
		
		public void setNext(Student s) {
			nextStudent = s;
		}
		
		public void setPre(Student s) {
			preStudent = s;
		}
		
		public Student getNext() {
			return nextStudent;
		}
		
		public Student getPre() {
			return preStudent;
		}
	}
}