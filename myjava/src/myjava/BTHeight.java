package myjava;
import java.util.*;
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
public class BTHeight {
	Node root;
	BTHeight(){
		root=null;
	}
	BTHeight(int data){
		root=new Node(data);
	}
	public static void main(String[] args) {
		BTHeight bt=new BTHeight(2);
		bt.root.left=new Node(3);
		bt.root.right=new Node(5);
		bt.root.left.right=new Node(9);
		bt.root.right.left=new Node(7);
		System.out.println(bt.height(bt.root));
	}
	int height(Node root) {
		if(root==null)
			return -1;
		return 1+Math.max(height(root.left),height(root.right));
	}
	
}
