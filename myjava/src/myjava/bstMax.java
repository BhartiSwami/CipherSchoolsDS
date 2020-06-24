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
public class bstMax {
	Node root;
	bstMax(){
		root=null;
	}
	bstMax(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		bstMax b=new bstMax(15);
		b.root.left=new Node(10);
		b.root.right=new Node(20);
		b.root.left.left=new Node(8);
		b.root.left.right=new Node(12);
		b.root.right.left=new Node(17);
		b.root.right.right=new Node(25);
		System.out.println(b.max(b.root));
	}
	int max(Node root) {
		if(root==null) {
			System.out.println("Tree is Empty,Nothing to find");
			System.exit(0);
		}
		while(root.right!=null) {
			root=root.right;
		}
		return root.data;
	}
}
