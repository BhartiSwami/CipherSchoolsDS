package myjava;
import java.util.Queue;
import java.util.LinkedList;

class SQ{
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	int pop() {
		return q1.poll();
	}
	void push(int data) {
		while(q1.size()!=0) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(q2.size!=0) {
			q1.add(q2.poll);
		}
	}
	boolean isEmpty() {
		if(q1.size()==0) 
			return true;
		return false;
	}
}
public class Stack_Using_Queue {
	public static void main(String[] args) {
		SQ s=new SQ();
		System.out.println(s.isEmpty());
		s.push(9);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
