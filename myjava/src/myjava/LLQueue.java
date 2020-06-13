package myjava;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class QfUN{
	Node front=null;
	Node rear=null;
	boolean isEmpty() {
		return (front==null&&rear==null);
	}
	int peek() {
		return front.data;
	}
	void enqueue(int data) {
		Node temp=new Node(data);
		if(isEmpty()) {
			rear=temp;
			front=temp;
		}
		rear.next=temp;
		rear=temp;
			
		}
	int dequeue(){
		if(isEmpty()) {
			System.out.println("Nothing to remove, your queue is already empty");
			return-1;
		}
		if(rear==front) {
			Node x=front;
			rear=null;
			front=null;
			return x.data;	
		}
		Node y=front;
		front=front.next;
		return y.data;
	}
}
public class LLQueue {
	public static void main(String args[]) {
		QfUN s=new QfUN();
		System.out.println(s.isEmpty());
		s.enqueue(1);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(5);
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
	}
}
