package Etc;

public class Class_Constructor_Private 
{
	private Class_Constructor_Private()
	{
		System.out.println("Kiran warkhade");
	}
	
	public static Class_Constructor_Private getObjecty()
	{
		return new Class_Constructor_Private();
	}
	
	public static void main(String[] args) {
		
		Class_Constructor_Private d = getObjecty();
		

	}

}
