package myjava;


class CircularQueue{
	final int size = 10;
	int arr[]=new int[size];
	int front = -1,rear=-1;
	void enqueue(int data)
	{
		if(this.isEmpty())
		{
			front++;
			rear++;
			arr[rear] = data;
		}
		else if((rear+1)%size == front)//if queue is full
		{
			System.out.println("Queue is Full, No space to add");
		}
		else{
			rear=(rear+1)%size;
			arr[rear]=data;
		}
	}
	int dequeue()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is Empty, Nothing to Dequeue");
			return -1;
		}
		if(front==rear)
		{
			int x = arr[front];
			front=-1;
			rear=-1;
			return x;
		}
		int x = arr[front];
		front=(front+1)%size;
		return x;
	}
	int peek()
	{
		if(this.isEmpty()) 
		{
			System.out.println("Queue is Empty, No Peek element");
			return -1;
		}
		return arr[front];
	}
	boolean isEmpty()
	{
		return(front == -1 && rear == -1);
	}
}

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq = new CircularQueue();
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.enqueue(7);
		cq.enqueue(8);
		cq.enqueue(9);
		cq.enqueue(10);
		System.out.println(cq.peek());
		cq.enqueue(11);
		System.out.println(cq.dequeue());
		cq.enqueue(11);
		System.out.println(cq.rear);
		cq.enqueue(12);
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.front);
		System.out.println(cq.rear);
	}

}