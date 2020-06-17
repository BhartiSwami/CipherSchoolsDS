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
public class pal {
	Node root;
	pal(){
		root=null;
	}
	pal(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		pal s=new pal(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.left.right=new Node(9);
		s.root.right.left=new Node(7);
		s.levelPrint(s.root,1);
	}
	void levelPrint(Node root,int level) {
		if(root==null)
			return;
		if(level==0){
			System.out.print(root.data+" ");
			return;
		}
		levelPrint(root.left,level-1);
		levelPrint(root.right,level-1);
	}
}
