package Collections_prog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Create_ArrayList {
	public static void main(String[] args) {
		// -----------------------create ArrayList --------------------------------
		List<Integer> l = new ArrayList<Integer>();
		l.add(6);
		l.add(7);
		l.add(6);
		l.add(9);
		l.add(9);
		l.add(10);
		l.add(10);
		l.add(9);

	//-------------------------Print Arraylist Element---------------------------------------
		for(int i : l)
		{
			System.out.println(i);
		}

		System.out.println("______________________________");
	// -------------------print every element is Even Or Odd---------------------------------	
		for(int j : l)
		{
			if(j % 2 == 0)
			{
				System.out.println("Even No => "+j);
			}
			else
			{
				System.out.println("Odd  NO => "+j);
			}
		}
		System.out.println("----------------");
		// ------------------Dublicate Element Find---------------------------------

		// -----------------option 1------------------------------

		Set<Integer> set = new HashSet<>();
		
		for (int r : l) {
			if (set.add(r)) {
				
			} else {
				System.out.println("Dublicate element is:" + r);
			}
		}
		// --------------option 2---------------------------------
		
		  for (int g = 0; g < l.size(); g++) 
		  {
		  
			  for (int g1 = g + 1; g1 < l.size(); g1++)
			  { 
				  if (l.get(g).equals(l.get(g1)))
				  {
					  System.out.println("dub" + l.get(g1));
			
				  }
			  
			  }
		  
		  }
		  
	}
}

