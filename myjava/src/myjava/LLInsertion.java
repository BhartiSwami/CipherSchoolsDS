package myjava;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LLInsertion {
	static Node InsertAtPos(Node head,int data,int pos) {
		if(pos==1) {
			Node temp=new Node(data);
			temp.next=head;
			return temp;
		}
		Node newNode=new Node(data);
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head=InsertAtPos(head,6,3);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
