package Collection_Prog_Imp;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String str = "nitin";
		String temp ="";
		
		for( int i = str.length()-1 ; i>=0 ; i--)
		{
			temp += str.charAt(i);
		}
		
		if(str.equals(temp) )
		{
			System.out.println("palindrome String");
		}
		else 
		{
			System.out.println("Not Palindrome String");
		}

	}

}
