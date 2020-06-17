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
public class NoOfNodes {
	Node root;
	NoOfNodes(){
		root=null;
	}
	NoOfNodes(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		NoOfNodes bt=new NoOfNodes(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println(bt.totalNodes(bt.root));
	}
	int totalNodes(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+totalNodes(root.left)+totalNodes(root.right);
	}
}
