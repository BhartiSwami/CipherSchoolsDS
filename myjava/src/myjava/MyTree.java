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
public class MyTree {
	Node root;
	MyTree(){
		root=null;
	}
	MyTree(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		MyTree bt=new MyTree(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
	}
}
