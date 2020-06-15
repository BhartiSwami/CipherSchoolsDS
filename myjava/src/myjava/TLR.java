package myjava;
import java.util.concurrent.ThreadLocalRandom;			

public class TLR {
	public static void main(String[] args) {
		int n1=ThreadLocalRandom.current().nextInt();          //for printing the random Integers
		int n2=ThreadLocalRandom.current().nextInt();
		System.out.println(n1);
		System.out.println(n2);
		double d1=ThreadLocalRandom.current().nextDouble();     //for printing random Doubles
		double d2=ThreadLocalRandom.current().nextDouble();
		System.out.println(d1);
		System.out.println(d2);
		boolean b1=ThreadLocalRandom.current().nextBoolean();   //for printig random boolean values
		boolean b2=ThreadLocalRandom.current().nextBoolean();
		System.out.println(b1);
		System.out.println(b2);
	}
}

