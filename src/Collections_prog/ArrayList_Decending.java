package Collections_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer> ();
		List<Integer> l1 = new ArrayList<Integer> ();
		
		l.add(50);
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(30);
		
		Collections.sort(l);
		int s = l.size();
		
		
			for(int j = s-1 ; j >= 0 ; j--)
			{
				int t = l.get(j);
				l1.add(t);
				
			}
				
		for ( int i : l1) 
		{ 
			System.out.println(i); 	
		}
		
	}

}
