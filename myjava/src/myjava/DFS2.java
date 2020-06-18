package myjava;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
public class DFS2 {
	Node root;
	DFS2(){
		root=null;
	}
	DFS2(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		DFS2 s=new DFS2(2);
		s.root.left=new Node(3);
		s.root.left.right=new Node(9);
		s.root.right=new Node(5);
		s.root.right.left=new Node(7);
		s.inOrderDFS(s.root);
	}
	void inOrderDFS(Node root) {
		if(root==null)
			return;
		inOrderDFS(root.left);
		System.out.print(root.data+" ");
		inOrderDFS(root.right);
	}
}
