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
public class LeafNode {
	Node root;
	LeafNode(){
		root=null;
	}
	LeafNode(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		LeafNode bt=new LeafNode(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println(bt.LN(bt.root));
	}
	int LN(Node root) {
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		return LN(root.left)+LN(root.right);
	}
}
