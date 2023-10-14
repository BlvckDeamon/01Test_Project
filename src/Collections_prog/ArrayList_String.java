package Collections_prog;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_String {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("Shubham");
		l.add("Shubh");
		l.add("Shubhangi");
		l.add("Shubhratri");
		l.add("Vivek");
		l.add("Ashish");
		
		for(String s : l)
		{
			if(s.equals("Shubh"))
			{
				System.out.println(" Find the "+s);
			}
			/*
			 * else { System.out.println(" not find the user"); }
			 */
		}
	}
}
