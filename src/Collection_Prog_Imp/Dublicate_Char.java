package Collection_Prog_Imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Dublicate_Char {

	public static void main(String[] args) {
		
		String s = "ravindra";
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char c = s.charAt(i);
			if(set.add(c))
			{
				
			}
			else
			{
				System.out.println(c);
			}
		}
	}

}
