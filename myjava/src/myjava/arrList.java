package myjava;
import java.util.*;

public class arrList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println(a.size());
		a.add(1);
		a.add(9);
		a.add(7);
		a.add(0);
		a.add(3);
		System.out.println(a.size());
		System.out.println(a.get(4));
		System.out.println(a.get(1));
		System.out.println(a.contains(6));
		System.out.println(a.contains(0));
		a.remove(3);
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
	}
}
