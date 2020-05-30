package practice;
import java.util.*;

public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                                     //Making an scanner class.
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();                                                    //taking size of an array as input.
		int arr[]=new int[n];  
		System.out.println("You Entred!!");
		System.out.println(n);
		System.out.println();//declaring an array
		System.out.println("Please enter the array elements");
		for(int i=0;i<n;i++) {                                                 //Taking array elements from the user.
			arr[i]=sc.nextInt();
		}
		System.out.println("You Entred!!");
		for(int i=0;i<n;i++) {                                                 //Printing the array elements.
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Thanks for giving the info!!");
	}
}
