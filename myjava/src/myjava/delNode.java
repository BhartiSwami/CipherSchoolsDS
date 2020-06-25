package myjava;

class BSTNode{
	int data;
	BSTNode left;
	BSTNode right;
	BSTNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BSTS{
	BSTNode insert(BSTNode root, int data)
	{
		if(root==null)
		{
			return new BSTNode(data);
		}
		if(data<=root.data)
		{
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
int min(BSTNode root)
{
	if(root==null)
	{
		System.out.println("tree is Empty, No Min element");
//		System.exit(0);
		return -1;
	}
	while(root.left!=null)
	{
		root=root.left;
	}
	return root.data;
}

BSTNode deleteNode(BSTNode root, int data)
{
	if(root==null) return null;
	if(data<root.data)
	{
		root.left = deleteNode(root.left,data);
	}
	else if(data>root.data)
	{
		root.right = deleteNode(root.right,data);
	}
	else{
		if(root.left == null) return root.right;          //1child case && No child case
		else if(root.right==null) return root.left;
		else{
			root.data = min(root.right);
			root.right = deleteNode(root.right,root.data);
		}
	}
	return root;
}
}
public class delNode {
	public static void main(String[] args) {
	BSTS bst = new BSTS();
	BSTNode root = null;
	root = bst.insert(root, 15);//update root after insertion
	root = bst.insert(root, 10);
	root = bst.insert(root, 20);
	root = bst.insert(root, 8);
	root = bst.insert(root, 12);
	root = bst.insert(root, 17);
	root = bst.insert(root, 25);
	root = bst.deleteNode(root, 15);
}
}
