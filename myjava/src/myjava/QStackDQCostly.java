package myjava;
import java.util.*;
class QS{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	void insert(int data) {
		s1.push(data);
	}
	int delete() {
		if(s1.isEmpty()) {
			System.out.println("Your queue is empty nothig to dequeue");
			return -1;
		}
		while(s1.size()!=1) {
			s2.push(s1.pop());
		}
		int x=s1.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return x;
	}
}
public class QStackDQCostly {
	public static void main(String[] args) {
		QS s=new QS();
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		System.out.println(s.delete());
		System.out.println(s.delete());
		
	}
}
