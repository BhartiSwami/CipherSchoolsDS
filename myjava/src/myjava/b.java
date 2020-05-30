
package myjava;
import java.util.*;

public class b {
	public static void main(String []rags) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows"); 
		int p=sc.nextInt();                                                    //taking no. of rows from the user
		System.out.println("enter the no. of cols");
		int q=sc.nextInt();                                                    //taking no. of columns from the user
		int arr[][]=new int[p][q];
		System.out.println("enter the elements of array");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				arr[i][j]=sc.nextInt();                                        //taking input array from user
			}
		}
		System.out.println("You entred");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(arr[i][j]+" ");                               //printing the array
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("hashCode of the array is:");
		System.out.println(arr);                                               //to print hash code
		System.out.println();
		System.out.println("No. of rows:");
		System.out.println(arr.length);                                        //to print no. of rows
		System.out.println();
		System.out.println("No of columns:");
		System.out.println(arr[0].length);                                     //to print no. of columns
	}
}
