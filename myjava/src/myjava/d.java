package myjava;
import java.util.*;

public class d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of your array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array without sorting");
		print(arr);
		selectionSort(arr);
		System.out.println();
		System.out.println("array after selection sort");
		print(arr);
	}
	static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
