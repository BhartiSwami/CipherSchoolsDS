package myjava;
import java.util.*;

public class g {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the sorted array od size"+" "+n);
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Element Which You Want To Search");
		int p=sc.nextInt();
		System.out.println("Your element is at Index:");
		int s=BSearch(arr,p);
				System.out.println(s);
		
	}
		static int BSearch(int arr[],int p) {
		int n=arr.length;
		int l=0;
		int r=n-1;
		int mid;
		while(l<=r) {
			mid=l+r/2;
			if(p==arr[mid])
				return mid;
			else if(p>arr[mid])
				return l=mid+1;
			else
				return r=mid-1;
		}
		return -1;
		}
}
