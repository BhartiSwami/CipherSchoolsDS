package myjava;
import java.util.*;

public class a {
	public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of your array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("You Entred!!");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println();
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
	}
	System.out.println("sum is:"+" "+sum);
	}
}

