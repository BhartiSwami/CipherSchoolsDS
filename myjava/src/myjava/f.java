package myjava;
import java.util.*;

public class f {
	static void revFun(int n) {
		if(n>0) {
			System.out.print(n+" ");
			revFun(n-1);                                               //direct recursion
		}
	}
	static void forFun(int n) {
		if(n>0) {
			forFun(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first element to start reverse counting");
		int n=sc.nextInt();
		System.out.println("Printing reverse counting using direct recursion");
		revFun(n);
		System.out.println();
		System.out.println("Enter the last element of your counting");
		int m=sc.nextInt();
		System.out.println("Printing of counting using direct recursion");
		forFun(m);
	}	
}
