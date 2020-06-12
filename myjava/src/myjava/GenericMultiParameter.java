package myjava;
class Reo<T,U>{
	T o1;
	U o2;
	Reo(T o1,U o2){
		this.o1=o1;
		this.o2=o2;
	}
	void print() {
		System.out.println("value of o1:"+" "+o1);
		System.out.println("value of o2:"+" "+o2);
	}
}
public class GenericMultiParameter {
	public static void main(String[] args) {
	Reo<String,Integer> r=new Reo<String,Integer>("Hello",2020);
	r.print();
	}
}
