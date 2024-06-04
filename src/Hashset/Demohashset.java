package Hashset;
import java.util.HashSet;
public class Demohashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(3);
		hs.add(null);
		hs.add("hello");
		hs.add(true);
		
//		order of insertion is not follwed it will print random values
		System.out.println(hs);
//		index accessing is also not possible
		
		System.out.println(hs.contains(null));
		
		HashSet hs2=new HashSet();
		hs2.add("world");
		hs2.add(50);
		hs2.add("virat");
		hs2.add('A');
		System.out.println(hs2);
		
		hs2.addAll(hs);
		System.out.println(hs2);
		
		System.out.println(hs2.containsAll(hs));
	

	}

}
