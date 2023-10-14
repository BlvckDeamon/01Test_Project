package Collection_Prog_Imp;

import java.util.HashMap;

public class Count_All_Char_GivenString {

	public static void main(String[] args) {

		String s1 = "aabcabcc";
		HashMap<Character,Integer> h = new HashMap<>();
		
		
		for (int i = 0; i < s1.length(); i++) 
			{
				char ch = s1.charAt(i);
				
				if(h.containsKey(ch))
				{
					h.put(ch,h.get(ch)+1 );
				}
				else 
				{
					h.put(ch, 1);
				}
			}
		System.out.println(h);

	}

}
