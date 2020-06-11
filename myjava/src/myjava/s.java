package myjava;
import java.util.*;
import java.lang.*;
import java.io.*;

public class s {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the number of test cases:");
	int t=Integer.parseInt(sc.nextLine());
	while(t>0) {
		System.out.println("Enter you parentheses String:");
		String s=sc.nextLine();
		System.out.println("you entred:"+" "+s);
		if(checkParentheses(s)) {
			System.out.println("The Given String is Balenced");
		}
		else {
			System.out.println("The Given String is NOT Balenced");
		}
		t--;
	}
}
static boolean checkParentheses(String s) {
	if(s.length()%2!=0)
		return false;
	Stack<Character> st=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='{'||c=='('||c=='[')
			st.push(c);
		if(c=='}'||c==')'||c==']')
		{
			if(st.isEmpty())
				return false;
			char ch=st.pop();
			if(c=='}'&&ch!='{'||c==')'&&ch!='('||c==']'&&ch!='[')
				return false;
		}
		if(st.isEmpty())
			return true;
		}
	return false;
	}
	
	
}

