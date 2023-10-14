package Etc;

class Kiran_Demo
{
	private String name = "Vivek";
	private Kiran_Demo()
	{
		int x = 10 ;
		
	}
	public Kiran_Demo(int i)
	{
		System.out.println(" HI Chaman");
	}
	public static Kiran_Demo getObject()
	{
		return new Kiran_Demo();
	}
}

class Chota_Kiran extends Kiran_Demo
{

	public Chota_Kiran(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
}
public class Demo_Con {

	public static void main(String[] args) {
		
		Chota_Kiran obj = new Chota_Kiran(10);
		System.out.println(obj.hashCode());
		
		Kiran_Demo obj1 = obj.getObject();
		System.out.println(obj1.hashCode());
		
		Kiran_Demo obj2 = Kiran_Demo.getObject();
		System.out.println("Obj 2: HashCode "+obj2.hashCode() );
	}

}
