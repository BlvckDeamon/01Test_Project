package Static_Control_Flow;

class Parent_Control
{
	
	static int i = 10 ;
	
	static 
	{
		m1();
		System.out.println("base static block");
	}
	public static void main(String[] args) {
		
		m1();
		System.out.println("Base main");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static int j = 20;
}

public class Child_Control_Flow extends Parent_Control
{
	
	static int x = 100;
	
	static 
	{
	
		m2();
		System.out.println("Derived class static block");
	}
	
	public static void main(String[] args) {
		
		m2();
		System.out.println("Derived class main method ");
	}
	public static void m2() {
		
		System.out.println(y);
	}
	static 
	{
		System.out.println("Derived class second static block");
	}
	static int y = 200 ;

}
