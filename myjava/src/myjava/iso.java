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
public class iso {
	Node root;
	iso(){
		root=null;
	}
	iso(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		iso s=new iso(2);
		s.root.left=new Node(3);
		s.root.right=new Node(5);
		s.root.right.left=new Node(7);
		s.root.left.right=new Node(9);
		iso s1=new iso(2);
		s1.root.left=new Node(3);
		s1.root.right=new Node(5);
		s1.root.right.left=new Node(7);
		//s1.root.left.right=new Node(9);
		System.out.println(s.isomorphic(s.root,s1.root));
	}
	boolean isomorphic(Node root1,Node root2) {
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		return root1.data==root2.data && isomorphic(root1.left,root2.left) && isomorphic(root1.right,root2.right) || isomorphic(root1.left,root2.right) && isomorphic(root1.right,root2.left);
	}
}
