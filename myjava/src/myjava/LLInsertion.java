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
class LLInsertion{
	
	
	                                   //Function to Insert At Head Position
	
	
	static Node InsertionAtHead(Node head, int data) {
		Node temp=new Node(data);
		temp.next=head;
//		head=temp;
//		return head
//		    or
		return temp;
	}
	
	
	                                    //Function to insert At the End Position  
	
	
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
	
	                                 //Function to Insert At the nth Position
	
	static Node InsertAtPos(Node head,int data,int pos) {
		Node newNode=new Node(data);
		if(pos==1) {
			return newNode;
		}
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
		
		                                         //Insertion at head
		
		System.out.println("Enter the No. that you want to insert at head");
		int n=sc.nextInt();
		head=InsertionAtHead(head,n);
		System.out.println("Linked List After Insertion at head");
		Node temp2=head;
		while(temp2!=null) {
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
		System.out.println();
		
	                                        	//Insertion at end 
		
		System.out.println("Enter the element to insert at the end of your linked list");
		int m=sc.nextInt();
		head=InsertAtEnd(head,m);
		Node temp3=head;
		while(temp3!=null) {
			System.out.print(temp3.data+" ");
			temp3=temp3.next;
		}
		System.out.println();
		
		
		                                        //Insertion at nth Position
		
		
		System.out.println("Enter the element which you want to insert");
		int ele=sc.nextInt();
		System.out.println("Enter the Position at which you want to insert the element");
		int pos=sc.nextInt();
		head=InsertAtPos(head,ele,pos);
		Node temp4=head;
		while(temp4!=null) {
			System.out.print(temp4.data+" ");
			temp4=temp4.next;
		}
		
	}
}
