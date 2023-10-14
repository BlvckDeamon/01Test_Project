package Collections_prog;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Program {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(36);
		l.add(86);
		l.add(67);
		l.add(34);
		l.add(89);
		l.add(24);
		
		for(int i : l)
		{
			System.out.println(i);
		}

	}

}
