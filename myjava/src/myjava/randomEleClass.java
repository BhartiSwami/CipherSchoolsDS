package myjava;
import java.util.*;

public class randomEleClass {
	public static void main(String[] args) {
		Random r=new Random();
		int r1=r.nextInt(10);    //random element b/w 0-9
		int r2=r.nextInt(10);
		System.out.println(r1);
		System.out.println(r2);
		double d1=r.nextDouble();
		double d2=r.nextDouble();
		System.out.println(d1);
		System.out.println(d2);
	}
}
