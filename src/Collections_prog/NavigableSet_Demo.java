package Collections_prog;

import java.util.TreeSet;

public class NavigableSet_Demo {

	public static void main(String[] args) {
	
		TreeSet t = new TreeSet();
		
		t.add("vivek");
		t.add("Shubham");
		t.add("Ashish");
		t.add("Suraj");
		t.add("Kiran");
		
		TreeSet t1 = new TreeSet();
		
		t.add("vivek");
		t.add("Shubham");
		t.add("Ashish");
		t.add("Suraj");
		t.add("Kiran");
		
		System.out.println(t);
		System.out.println("---------------");
		
		System.out.println(t.descendingSet());

	}

}
