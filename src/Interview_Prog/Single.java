package Interview_Prog;

 public class Single {

	private static Single single ;

	private Single() {

	}

	public static Single getObject() {
		if (single == null) {
			
			return single = new Single();
			
			
		} else {
			return single;
		}
	}
	
	
}
