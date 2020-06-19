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
public class intoMirror {
	Node root;
	intoMirror(){
		root=null;
	}
	intoMirror(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		intoMirror s=new intoMirror(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.left.right=new Node(9);
		s.root.right.left=new Node(7);
	}
	void Mirror(Node root) {
		if(root==null)
			return;
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
}
