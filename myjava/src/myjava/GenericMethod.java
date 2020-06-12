package myjava;
class toe{
	<T>void print(T t){
		System.out.println(t.getClass().getName()+" = "+t);
	}
}
public class GenericMethod {
	public static void main(String[] args) {
		toe r=new toe();
		r.print(10);
		r.print("Hello");
		r.print(2.5);
	}
}
