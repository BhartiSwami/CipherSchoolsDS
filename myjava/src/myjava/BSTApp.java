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
class BST
{
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
	boolean search(BSTNode root, int data)
	{	
		if(root==null) return false;
		if(root.data==data) return true;
 		if(data<=root.data)
		{
			return search(root.left,data);
		}
		else{
			return search(root.right,data);
			}
	}
	void preorder(BSTNode root)
	{
		if(root == null) return;
		System.out.print(root.data+" ");
		preorder(root.left); //go to LST
		preorder(root.right); //go to RST
	}
	void inorder(BSTNode root) //LVR
	{
		if(root == null) return;
		inorder(root.left); //go to LST
		System.out.print(root.data+" ");
		inorder(root.right); //go to RST
	}
	void postorder(BSTNode root) //LVR
	{
		if(root == null) return;
		postorder(root.left); //go to LST
		postorder(root.right); //go to RST
		System.out.print(root.data+" ");
	}
	int min(BSTNode root)
	{
		if(root==null)
		{
			System.out.println("tree is Empty, No Min element");
//			System.exit(0);
			return -1;
		}
		while(root.left!=null)
		{
			root=root.left;
		}
		return root.data;
	}
	int max(BSTNode root)
	{
		if(root==null)
		{
			System.out.println("tree is Empty, No Max element");
			return -1;
		}
		while(root.right!=null)
		{
			root=root.right;
		}
		return root.data;
	}
	//data is the value to be deleted
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
	BSTNode lcaBST(BSTNode root, int n1, int n2)
	{
		if(root==null) return null;
		if(n1<root.data && n2<root.data)
		{
			return lcaBST(root.left,n1,n2);
		}
		if(n1>root.data && n2>root.data)
		{
			return lcaBST(root.right,n1,n2);
		}
		return root;
	}
	
}
public class BSTApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		BSTNode root = null;
		System.out.println(bst.search(root, 8));
		root = bst.insert(root, 15);//update root after insertion
		root = bst.insert(root, 10);
		root = bst.insert(root, 20);
		root = bst.insert(root, 8);
		root = bst.insert(root, 12);
		root = bst.insert(root, 17);
		root = bst.insert(root, 25);
		System.out.println(bst.search(root, 8));
		System.out.print("PreOrder: ");
		bst.preorder(root);
		System.out.println();
		System.out.print("InOrder: ");
		bst.inorder(root);
		System.out.println();
		System.out.print("PostOrder: ");
		bst.postorder(root);
		System.out.println();
		System.out.println("Min Element is: "+bst.min(root));
		System.out.println("Max Element is: "+bst.max(root));
		root = bst.deleteNode(root, 15);
		bst.inorder(root);
		System.out.println();
		root = bst.deleteNode(root, 20);
		bst.inorder(root);
		System.out.println();
		System.out.println(bst.lcaBST(root, 8, 25).data);
		System.out.println(bst.lcaBST(root, 17, 20).data);
		System.out.println(bst.lcaBST(root, 8, 10).data);
	}
}
