package Collections_prog;

import java.util.Vector;

public class Enumeration {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(3);
		v.add(1);
		v.add(5);
		v.add(4);
		v.add(2);
		
		System.out.println(v);
		
		java.util.Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
