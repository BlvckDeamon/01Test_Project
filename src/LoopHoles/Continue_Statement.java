package LoopHoles;

public class Continue_Statement 
{
	public static void main(String[] s)
	{
		int x = 0;
		do {
			x++;
			System.out.println(x);
			if(++x < 5)
				continue;
			x++;
			System.out.println(x);
		}while(++x<10);
	}

}
