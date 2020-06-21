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
public class IS {
	Node root;
	IS(){
		root=null;
	}
	IS(int data){
		root=new Node(data);
	}
	public static void main(String []args) {
		IS s=new IS(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.left.right=new Node(9);
		s.root.right.left=new Node(7);	
		IS s1=new IS(2);
		s1.root.left=new Node(5);
		s1.root.right=new Node(9);
		//s1.root.left.right=new Node(2);
		s1.root.right.left=new Node(1);	
		System.out.println(s.isSymmetric(s.root,s1.root));
		}
	boolean isSymmetric(Node root1,Node root2) {
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		return isSymmetric(root1.left,root2.left) && isSymmetric(root1.right,root2.right);
	}
}
