package Etc;

public class String_EvenOdd {

	public static void main(String[] args) {
		
		String s = "to even numberr";
		
		
		for(String s1 : s.split(" "))
		{
			
			
			if ( s1.length() % 2 == 0 )
			{
				
				System.out.println(s1);
			}
			
		}
		
		
	}

}
