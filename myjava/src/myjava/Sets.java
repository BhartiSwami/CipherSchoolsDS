package myjava;
import java.util.*;

public class Sets {
	public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<>();
		System.out.println(s.size());
		s.add(1);
		s.add(5);
		s.add(6);
		s.add(9);
		s.add(0);
		System.out.println(s.size());
		System.out.println(s.contains(3));
		System.out.println(s.contains(6));
		System.out.println(s.remove(0));
		System.out.println(s.contains(0));
		s.clear();
		s.add(0);
		s.add(0);
		s.add(2);
		s.add(0);
		s.add(1);
		System.out.println(s.size());
	}
}
