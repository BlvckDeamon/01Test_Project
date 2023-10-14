package Interview_Prog;

import java.util.HashSet;
import java.util.Set;

public class Find_Dub_Ele_inArray {

	public static void main(String[] args) {
		
		System.out.println("hello");
		int[] arr = {1,2,3,4,8,9,5,6,7,8, 1,2,3};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(set.add(arr[i]))
			{
				
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}

}
