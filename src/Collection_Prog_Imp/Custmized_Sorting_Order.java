package Collection_Prog_Imp;

import java.util.Comparator;
import java.util.TreeSet;

class MySortingOrder implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		if (i1 < i2)
		{
			return +1;
		}
		else if (i1 > i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

public class Custmized_Sorting_Order {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MySortingOrder());
		
		t.add(12);
		t.add(5);
		t.add(2);
		t.add(24);
		t.add(15);
		t.add(11);
		
		System.out.println(t);
	}

}
