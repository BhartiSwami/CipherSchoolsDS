package myjava;
import java.util.*;
// Code for printing the alternative elements


public class c {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of test cases");
	int m=sc.nextInt();                                                                 //taking no of test cases from user
	for(int j=0;j<m;j++) {
		System.out.println("Enter the size of your array");
	int n=sc.nextInt();                                                              //taking no. of elements in array from user
	int arr[]=new int[n];
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++) {                                                           // taking array elements
		arr[i]=sc.nextInt();
	}
	System.out.println("You Entred!!");
	System.out.println();
	for(int i=0;i<n;i++) {                                                            //printing the array elements entered by user
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("The alternative elements are!!");
	for(int i=0;i<n;i=i+2) {                                                         //printing alternative elements
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	}
}
