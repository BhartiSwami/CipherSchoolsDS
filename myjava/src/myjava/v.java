package myjava;
import java.util.*;

public class v{
	public static void main(String[] args) {
	Stack<Integer> s=new Stack();      //Generic Datatype
	int x=5;  //Primitive Datatype
	s.push(5);
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	Stack<Character> m=new Stack();      //Generic Datatype
	m.push('a');
	System.out.println(m.peek());
	System.out.println(m.pop());
	System.out.println(m.isEmpty());
	}
}