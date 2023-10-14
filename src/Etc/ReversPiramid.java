package Etc;

public class ReversPiramid {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 8 ; i++ )
		{
			for(int j = 9 ; j >= i ; j-- )
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i = 9 ; i >= 1 ; i-- )
		{
			for(int j = 9 ; j >= i ; j-- )
			{
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
