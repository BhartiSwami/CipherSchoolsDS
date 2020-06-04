package myjava;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		}
}
public class y {
public static void main(String[] args) {
	Node head=new Node(1);
	head.next=new Node(2);
	head.next.next=new Node(3);
	head.next.next.next=new Node(4);
	head.next.next.next.next=new Node(5);
	System.out.println("Linked List elements are");
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
	int len=0;
	Node temp1=head;
	while(temp1!=null) {
		temp1=temp1.next;
		len++;
	}
	System.out.println("length of your node is:"+" "+len);
	Node temp3=head;
	for(int i=0;i<len/2;i++) {
		temp3=temp3.next;
	}
	System.out.println("Data at the middle position is:"+" "+temp3.data);
}
}
