package Collections_prog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Itr_Demo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println(set);
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
