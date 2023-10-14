package Interview_Prog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSeqOfNo {

	public static void main(String[] args) {
		
		int[] a = {1,2,1,8,12,2,2,8,1};
		
		Map< Integer, Integer> map = new HashMap<>();
		
		
		for(int i = 0 ; i< a.length ; i++)
		{
			int j = a[i];
			if(map.containsKey(j))
			{
				map.put(j, map.get(j) + 1);
			}
			else {
				map.put(j,1);
			}
		}
		
		System.out.println(map);
		
	}
}
