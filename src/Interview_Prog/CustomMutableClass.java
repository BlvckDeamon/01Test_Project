package Interview_Prog;

final class CustomMutableClass {

	// static CustomMutableClass obj=null;
	private String sname;

	public CustomMutableClass(String sname) {
		this.sname = sname;
	}

	public CustomMutableClass getInstance(String name) {
		if (this.sname.equals(name)) {
			return this;
		} else {
			return new CustomMutableClass(name);
		}
	}

	public static void main(String[] args) {

//		CustomMutableClass c = new CustomMutableClass("vivek");
//		System.out.println(c.hashCode());
//		CustomMutableClass obj2 = c.getInstance("vivek");
//		System.out.println(obj2.hashCode());

		Single single = Single.getObject();
		System.out.println(single.hashCode());
		
		Single single1 = Single.getObject();
		System.out.println(single1.hashCode());
		
	}
	
}
