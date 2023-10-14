package Java_8_feature;

import java.util.function.Function;

public class TestFunction {
	
	public static void main(String[] args) {
		
		Function<String, Integer> function = (String str) -> {

			return Integer.valueOf(str);
		};
		
		Function<Integer, String> function1 = (Integer i ) -> {
			return "the given number is :"+i;
		};
		
		System.out.println(function.apply("010011"));
		System.out.println(function1.apply(001));
		
		
	}

}
