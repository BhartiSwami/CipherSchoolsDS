package myjava;
import java.util.*;

public class r{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter the number of test cases");
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0) {
			System.out.println("Enter the postFix Statement");
			String s=sc.nextLine();
			System.out.println("The answer of your post fi evaluation is:");
			System.out.println(postFixEvaluation(s));
			t--;
		}
	}
	static int postFixEvaluation(String s) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				st.push(c-'0');
			}
			else {
				int val2=st.pop();
				int val1=st.pop();
				int res=solve(c,val1,val2);
				st.push(res);
			}
		}
		return st.pop();
	}
	static int solve(char c,int val1,int val2) {
		if(c=='*')return val1*val2;
		if(c=='+')return val1+val2;
		if(c=='-')return val1-val2;
		if(c=='/')return val1/val2;
		return 0;
	}
}