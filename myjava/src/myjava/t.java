package myjava;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class t{
	static boolean isEmpty(Node head) {
		if(head==null)
			return true;
		else 
			return false;
	}
	static Node push(Node head,int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		return newNode;
	}
	static Node pop(Node head) {
		int popedData=head.data;
		head=head.next;
		return head;
	}
	static int peek(Node head) {
		return head.data;
	}
	static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		System.out.println("Our Current Node");
		print(head);
		System.out.println();
		System.out.println("Checking our Linked List is Empty or NOT!!");
		System.out.println(isEmpty(head));
		System.out.println("Enter the element to push");
		int p=sc.nextInt();
		System.out.println("Pushing the data"+" "+p+" "+"In the Linked List");
		head=push(head,p);
		System.out.println("Now our Linked List becomes:");
		print(head);
		System.out.println();
		System.out.println("Enter the element to push");
		int q=sc.nextInt();
		System.out.println("Pushing the data"+" "+p+" "+"In the Linked List");
		head=push(head,q);
		System.out.println("Now our Linked List becomes:");
		print(head);
		System.out.println();
		System.out.println("Poped a element from our Linked List");
		head=pop(head);
		System.out.println("Now our Linked List becomes:");
		print(head);
		System.out.println();
		System.out.println("peek element of our Linked List is:");
		System.out.println(peek(head));
		System.out.println("checking if our Linked List is empty or not");
		System.out.println(isEmpty(head));
	}
}