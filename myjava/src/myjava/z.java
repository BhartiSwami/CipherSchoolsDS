package myjava;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data);
	{
		this.data=data;
		this.next=null;
	}
}
public class z {
static void DeleteFromPos(Node head,int pos) {
	Node h=head;int len=0;
	while(h!=null) {
		h=h.next;
		len++;
	}
	if(pos>len) {
		System.out.println("You choose an Invalid Position to delete");
	}
	if(head==null)
		return;
	if(pos==0)
	{
		head=head.next;
		return;
	}
	Node temp=head;
   for(int i=0;i<pos-1;i++) {
	   temp=temp.next;
   }
   Node next=temp.next.next;
   temp.next=next;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Node head=new Node(1);
	head.next=new Node(2);
	head.next.next=new Node(3);
	head.next.next.next=new Node(4);
	head.next.next.next.next=new Node(5);
	Node emp=head;
	while(emp!=null) {
		System.out.print(emp.data+" ");
		emp=emp.next;
	}
	System.out.println();
	System.out.println("Enter the position from which you want to delete");
	int n=sc.nextInt();
	DeleteFromPos(head,n);
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
}


