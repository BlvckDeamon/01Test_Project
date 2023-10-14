package Java_8_feature;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> userNameTest = (username) ->  
		{
			if("Mahesh".equalsIgnoreCase(username))
				return true;
			else
				return false;
		};
		
		System.out.println(userNameTest.test("Vivek"));
		System.out.println(userNameTest.test("mahesh"));
		System.out.println(userNameTest.test("tushar"));
		
		

	}

}
