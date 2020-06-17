package myjava;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	BinaryTree(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println(bt.BTSum(bt.root));
	}
	int BTSum(Node root) {
		if(root==null)
			return 0;
		return root.data+BTSum(root.left)+BTSum(root.right);
	}
}
