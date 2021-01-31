package b967;
import java.util.Scanner;
import java.util.ArrayList;
public class b967 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		Tree tree = new Tree(N);
		for(int i = 1; i < N; i++) {
			String[] input = scanner.nextLine().split(" ");
			int pid = Integer.parseInt(input[0]),
				cid = Integer.parseInt(input[1]);
			tree.makeRelation(pid, cid);
		}
		
	}

}

class Node{
	
	public static int nodeCount = 0;
	public Node parent = null;
	public ArrayList<Node> children = new ArrayList<Node>();
	public int number;
	
	public Node() {
		number = nodeCount;
		nodeCount++;
	}
	
	public void addChildren(Node n) {
		children.add(n);
	}
	
	public void setParent(Node n) {
		parent = n;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public boolean isLeaf() {
		if(children.isEmpty())
			return true;
		return false;
	}
	
	public int getGenerationDistance(Node n) {
		int generationDistance = 1;
		Node pointer = parent;
		while(!pointer.equals(n)) {
			pointer = pointer.parent;
			generationDistance++;
		}
		return generationDistance;
	}
}

class Tree{
	public ArrayList<Node> nodeList = new ArrayList<Node>();
	
	public Tree(int n) {
		for(int i = 0; i < n; i++) {
			Node node = new Node();
		}
	}
	
	public void makeRelation(int pid, int cid) {
		Node parentNode = nodeList.get(pid),
			childNode = nodeList.get(cid);
		parentNode.addChildren(childNode);
		childNode.setParent(parentNode);
	}
	
	public Node getYoungestSameParent(Node n1, Node n2) {
		ArrayList<Node> parents = new ArrayList<Node>();
		parents.add(n1);
		parents.add(n2);
		while(parents.)
	}
}