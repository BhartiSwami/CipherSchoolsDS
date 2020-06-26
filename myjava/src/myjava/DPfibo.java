package myjava;

public class DPfibo {
	static int fibo(int n)                                         //Using Recursion
	{
		if(n==0 || n==1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	
	static int fiboM(int n, int storage[])                         //Using Memoization
	{                
		if(storage[n]!=0)
			return storage[n];
		if(n==0 || n==1)
			return n;
		int ans=fiboM(n-1,storage)+fiboM(n-2,storage);
		storage[n]=ans;
		return ans;
	}
	
	static int fiboT(int n) {
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		int n=789456;
		long startTime=System.currentTimeMillis();
		int storage[]=new int[n+1];
		System.out.println(fiboT(n));
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken:" +" "+ (endTime-startTime));
	
	}
}
