package myjava;

public class genArrPrinting {
	public static<E>void print(E[] arr){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		Character[] ctr= {'a','b','c','d','e'};
		print(arr);
		print(ctr);
	}
}
