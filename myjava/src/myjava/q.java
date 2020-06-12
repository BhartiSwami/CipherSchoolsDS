package myjava;
import java.util.*;

public class q {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Input your Infix Statement");
		String s=sc.nextLine();
		System.out.println("Your postfix statement is:");
		System.out.println(infixToPostfix(s));
	}
	static String infixToPostfix(String s) {
		String res="";
		Stack <Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(Character.isDigit(c)) {
			res=res+c;
		}
		else {
			while(!st.isEmpty()&&prec(c)<=prec(st.peek())) {
				res=res+st.pop();
			}
			st.push(c);
		}
		}
		while(!st.isEmpty()) {
			res=res+st.pop();
		}
		
		return res;
	}
	static int prec(char c) {
		if(c=='/')
			return 4;
		if(c=='*')
			return 3;
		if(c=='+')
			return 2;
		if(c=='-')
			return 1;
		return 0;
	}
}
