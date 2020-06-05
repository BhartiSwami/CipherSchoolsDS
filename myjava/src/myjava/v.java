package myjava;
import java.util.*;

	class MyStack{
		final int size=10;
		int arr[]=new int[size];
		int top=-1;
		boolean isEmpty() {
			if(top==-1)
				return true;
			else 
				return false;
		}
		int peek() {
			if(this.isEmpty()) {
				System.out.println("Array is Empty");
				return -1;
			}
			return arr[top];
		}
		void push(int data) {
			if(top==9) {
				System.out.println("Stack s full, can't add more element");
				return;
			}
//			top=top+1;
//			arr[top]=data;
			arr[++top]=data;
			
		}
		int pop() {
			if(this.isEmpty()) {
				System.out.println("Stack is already empty");
				return -1;
			}
//			int x=arr[top];
//			top--;
//			return x;
//			or
			return arr[top--];
		}
	}
	public class v {
		public static void main(String[] arg) {
			MyStack s=new MyStack();
			System.out.println(s.isEmpty());
			s.push(5);
			s.push(7);
			s.push(9);
			System.out.println(s.isEmpty());
			System.out.println(s.peek());
			System.out.println(s.pop());
			System.out.println(s.peek());
		}
}
