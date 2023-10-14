package Collection_Prog_Imp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting_byUsing_LambdaEX {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(200);
		l.add(100);
		l.add(600);
		l.add(900);
		l.add(400);
		l.add(800);
		
		System.out.println(l);
		
		Collections.sort(l,(l1,l2)->( l1).compareTo( l2));
		
		System.out.println(l);

	}

}
