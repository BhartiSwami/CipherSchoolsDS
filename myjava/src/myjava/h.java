package myjava;
import java.util.*;

public class h {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the fibonacci series element");
		int n=sc.nextInt();
		System.out.println("Element at"+" "+n+"th"+" "+"position is:");
		int m=fib(n);
		System.out.println(m);
	}
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
}
