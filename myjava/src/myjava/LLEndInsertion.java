package myjava;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LLEndInsertion {
	static Node InsertAtEnd(Node head,int data) {
		Node temp=new Node(data);
		if(head==null) {
			return temp;
		}
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
			last.next=temp;
			return head;
	}
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head=InsertAtEnd(head,7+989+56);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
