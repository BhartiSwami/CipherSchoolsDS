package myjava;
import java.util.LinkedList;

public class LLClass {
	public static void main(String[] args) {
		LinkedList<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.size());
	}
}
