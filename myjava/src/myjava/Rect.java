package myjava;
class Rec<T>{
	private T len;
	private T wid;
	Rec(T l,T w){
		len=l;
		wid=w;
	}
	T getlength() {
		return len;
	}
	T getwidth() {
		return wid;
	}
}
public class Rect{
	public static void main(String[] args) {
		Rec<Integer> r=new Rec<Integer>(20,40);
		System.out.println("Area ="+" "+r.getlength()*r.getwidth());
		Rec<Double> rd=new Rec<Double>(2.2,2.5);
		System.out.println("Area ="+" "+rd.getlength()*rd.getwidth());
	}
}
