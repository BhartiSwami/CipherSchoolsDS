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
public class DFS3 {
	Node root;
	DFS3(){
		root=null;
	}
	DFS3(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		DFS3 s=new DFS3(2);
		s.root.left=new Node(3);
		s.root.left.right=new Node(9);
		s.root.right=new Node(5);
		s.root.right.left=new Node(7);
		s.postOrderDFS(s.root);
	}
	void postOrderDFS(Node root) {
		if(root==null)
			return;
		postOrderDFS(root.left);
		postOrderDFS(root.right);
		System.out.print(root.data+" ");
	}
}
