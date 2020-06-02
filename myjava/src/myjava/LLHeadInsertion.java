package myjava;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LLHeadInsertion {
	static Node InsertAtHead(Node head, int data) {
		Node temp=new Node(data);
		temp.next=head;
//		head=temp;
//		return head;
		return temp;
	}
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
	    head=InsertAtHead(head,6);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
