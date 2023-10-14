package streams;

import java.util.List;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String[] args) {
		 
		// convert string into integer 
//		List<String> list = List.of("1","2","3","4");
//		
//		Stream<Integer> map = list.stream().map( num -> {return Integer.valueOf(num);});
//		
//		map.forEach(System.out::println);
//		
//		
		// find even or odd number in list 
		
//		List<Integer> list = List.of(1,2,3,4,5,6,7);
//		
//		list.stream().filter(num -> {return num %2 !=0 ;}).forEach(System.out::println);
		
		
		//convert String into number andd find only odd numbers
		
		List<String> list = List.of("1","2","3","4");
		
		Stream<Integer> filter = list.stream().map(num -> {return Integer.valueOf(num);})
									 .filter(num -> {return num % 2!=0 ;});
		
		filter.forEach(System.out::println);
	}

}
