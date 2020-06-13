package myjava;
class myFunQueue{
	final int size=10;
	int arr[]=new int[size];
	int front=-1;
	int rear=-1;
	boolean isEmpty() {
//		if(front==-1&&rear==-1)
//			return true;
//		else
//			return false;
		return (front==-1&&rear==-1);
				
	}
	void enqueue(int data) {
		if(isEmpty()) {
			front++;
			rear++;
			arr[rear]=data;
		}
		else if(rear>=size-1) {
			System.out.println("Your queue is full, No elements to insert");
			return;
		}
		else {
//			rear++;
//			arr[rear]=data;
			arr[++rear]=data;
		}		
	}
	int dequeue(){
		if(isEmpty()) {
			System.out.println("No elements in your Queue, No elements to dequeue");
			return -1;
		}
		else if(front==rear) {
			int x=front;
			front=-1;
			rear=-1;
			return x;
		}
		else {
//			int n=front;
//			front++;
//			return n;
			return arr[front++];
		}
	}
	int peek() {
		return arr[front];
	}
}
public class Queue {
	public static void main(String[] args) {
		myFunQueue s=new myFunQueue();
	    System.out.println(s.isEmpty());
	    s.dequeue();
		s.enqueue(1);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(5);
		s.enqueue(6);
		System.out.println("dequeued element:"+s.dequeue());
		System.out.println("peek element: "+s.peek());
		s.enqueue(7);
		s.enqueue(8);
		s.enqueue(9);
		s.enqueue(10);
		s.enqueue(11);
		System.out.println(s.isEmpty());
	}
}
