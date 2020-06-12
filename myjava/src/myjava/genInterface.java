package myjava;

interface Pair<K,V>{
	public K getKey();
	public V getValue();
}
class Orderdpair<K,V>implements Pair<K,V>{
	private K key;
	private V value;
	Orderdpair(K key,V value){
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class genInterface {
	public static void main(String[] args) {
		Pair<String,Integer>p=new Orderdpair<String,Integer>("Hello",2020);
		System.out.println(p.getKey()+" "+p.getValue());
	}
}
