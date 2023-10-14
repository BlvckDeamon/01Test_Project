package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("vivek","suraj","kaniph","tushar","sagar","Vivek");
		
		List<String> collect = list.stream()
				.filter(obj -> obj.equalsIgnoreCase("vivek")).collect(Collectors.toList());
		
		collect.forEach(name -> System.out.println(name));
	}

}
