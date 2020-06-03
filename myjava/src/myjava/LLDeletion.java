package myjava;

class Node{
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}
public class LLDeletion {
	
	                  //Function for printing the Linked List
	
	static void Print(Node head)
	{
		if(head==null) {
			System.out.println("Your Linked List is Empty");
		}
		
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
	System.out.println();
	}
	
                   	//Main Function
	
public static void main(String[] args) {
	Node head=new Node(1);
	head.next=new Node(2);
	head.next.next=new Node(3);
	head.next.next.next=new Node(4);
	head.next.next.next.next=new Node(5);
	Print(head);
	               //Deleting the complete linked List
	head=null;
	Print(head);
}
}
