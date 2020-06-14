package myjava;
import java.util.Queue;
import java.util.LinkedList;

class SQ{
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	int pop() {
		if(q1.size()==0) {
			System.out.println("Your Stack is empty, Nothing to pop/remove");
			return -1;
		}
		while(q1.size()!=1) {
			q2.add(q1.poll());
		}
		int x=q1.poll();
		while(q2.size()!=0) {
			q1.add(q2.poll());
		}
		return x;
	}
	void push(int data) {
		q1.add(data);
	}
	boolean isEmpty() {
		if(q1.size()==0) 
			return true;
		return false;
	}
}
public class StackUsingQueue {
	public static void main(String[] args) {
		SQ s=new SQ();
		System.out.println(s.isEmpty());
		s.push(9);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(7);
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
