package Collections_prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Program {

	public static void main(String[] args) {
		
		Map<Integer,String>  h = new HashMap<Integer,String>();
		
		h.put(1, "Vivek");
		h.put(2, "Shubham");
		h.put(3, "Ashish");
		h.put(4, "Suraj");
		h.put(5, "Gotichand");
		h.put(6, "Pappu");
		
		for(Entry <Integer ,String> set : h.entrySet())
		{
			System.out.println(set.getKey() + "=" + set.getValue() );
		}
		
	}

}
