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
public class CI {
	Node root;
	CI(){
		root=null;
	}
	CI(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		CI bt=new CI(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.right.left=new Node(7);
		bt.root.left.right=new Node(9);
		CI bt1=new CI(2);
		bt1.root.left=new Node(5);
		bt1.root.right=new Node(3);
		bt1.root.right.left=new Node(9);
		bt1.root.left.right=new Node(7);
		System.out.println(bt.isMirror(bt.root,bt1.root));
	}
	boolean isMirror(Node root1,Node root2){
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		return root1.data==root2.data && isMirror(root1.left,root2.right) && isMirror(root1.right,root2.left);
	}
}
