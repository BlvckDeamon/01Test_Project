package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_Print_DubElementPos {
	
	public static void main(String[] args) {
		
		int[] ar = {5,7,7,8,8,8,8,8,10}; 
		int f1 = 0 ;
		int f2 = 0 ;
		List<Integer> list = new ArrayList<Integer>();   
		
		for (int i = 0; i< ar.length ; i++)
		{
			if(ar[i] == 10)
			{
				list.add(i);
			}
		}
		
		if(list.size() == 1)
		{
			System.out.println("not dublicate element find : " + list.get(0));
		}
		else
		{
			 f1 = list.get(0);
			 f2 = list.get(list.size()-1);
			 
			 System.out.println(f1);
			 System.out.println(f2);
		}
		
		
		
	}

}
