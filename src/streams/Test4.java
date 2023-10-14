package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// get only 3 elements from list
		List<Integer> list = List.of(1,2,3,4,6,6,7,8);
		
		list.stream().limit(3).forEach(System.out::println);

		//get only strings whose content is "nagar"
//		
//		List<String> of = List.of("nagar", "newasa","kopargaon","rahata","shirdi");
//		
//		List<String> collect = of.stream().filter(eachName -> { return "nagar".equalsIgnoreCase(eachName);})
//					.collect(Collectors.toList());
//		
//		collect.forEach(System.out:: println);
		
		
	}

}
