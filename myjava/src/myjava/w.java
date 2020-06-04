package myjava;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		}
}
public class w {
	static Node ReverseLL(Node head) {
	Node current=head;
	Node next=null;
	Node prev=null;
	while(current!=null) {
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	return prev;
	}
public static void main(String[] args) {
	Node head=new Node(1);
	head.next=new Node(2);
	head.next.next=new Node(3);
	head.next.next.next=new Node(4);
	head.next.next.next.next=new Node(5);
	System.out.println("Original Linked List");
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
	head=ReverseLL(head);
	System.out.println("Reversed Linked List");
	Node temp1=head;
	while(temp1!=null) {
		System.out.print(temp1.data+" ");
		temp1=temp1.next;
	}
	}
}

