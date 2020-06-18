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
public class IdenticalBT {
	Node root;
	IdenticalBT(){
		root=null;
	}
	IdenticalBT(int data){
		root=new Node(data);
	}
	public static void main(String args[]) {
		IdenticalBT s=new IdenticalBT(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.left.right=new Node(9);
		s.root.right.left=new Node(7);
		IdenticalBT s1=new IdenticalBT(2);
		s1.root.left=new Node(3);
		s1.root.right=new Node(5);
		s1.root.left.right=new Node(9);
		s1.root.right.left=new Node(7);
		System.out.println(s.isIdentical(s.root,s1.root));
	}
	boolean isIdentical(Node root1,Node root2) {
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		return root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
	}
}
