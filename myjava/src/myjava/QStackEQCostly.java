package myjava;
import java.util.*;
class QS{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	void insert(int data) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	int delete() {
		if(s1.isEmpty()) {
			System.out.println("Nothing to dequeue, No element in you queue");
			return -1;
		}
		return s1.pop();
	}
}
public class QStackEQCostly {
	public static void main(String[] args) {
		QS s=new QS();
		s.insert(7);
		s.insert(2);
		s.insert(3);
		System.out.println(s.delete());
		System.out.println(s.delete());
		
	}
}
