package myjava;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class MyBST {
	Node root;
	MyBST(){
		root=null;
	}
	MyBST(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		MyBST b=new MyBST(15);
		b.root.left=new Node(10);
		b.root.right=new Node(20);
		b.root.left.left=new Node(8);
		b.root.left.right=new Node(12);
		b.root.right.left=new Node(11);
		b.root.right.right=new Node(25);
		System.out.println(b.search(b.root, 8));
	}
	int search(Node root,int key) {
		if(root==null||root.data==key)
			return root.data;
		if(root.data<key)
			return search(root.right,key);
		return search(root.left,key);
	}
}