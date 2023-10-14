package Collection_Prog_Imp;

import java.util.ArrayList;
import java.util.List;

public class Find_ArrayElement_Add {
	
	static int add ;

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int a1 = 2;
		int a2 = 4;
		
		List<Integer> l = new ArrayList();
		
		for(int i = 0 ; i < a.length ; i++ )
		{
			if(a[i] == a1)
			{
				l.add(a[i]);
			}
			else if(a[i] == a2)
			{
				l.add(a[i]);
			}
		}
		
		for(int x : l)
		{
			add = add + x;
		}
		if(l.size() > 1)
		{
			System.out.println("True ... And Addition = "+add);
		}
		else
		{
			System.out.println("False");
		}
	}

}
