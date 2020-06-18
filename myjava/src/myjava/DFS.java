package myjava;

class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class DFS {
	Node root;
	DFS(){
		root=null;
	}
	DFS(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		DFS s=new DFS(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.left.right=new Node(9);
		s.root.right.left=new Node(7);
		s.preOrderDFS(s.root);
	}
	void preOrderDFS(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderDFS(root.left);
		preOrderDFS(root.right);
	}
}
