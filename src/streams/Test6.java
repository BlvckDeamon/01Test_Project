package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {
		
		 List<Integer> collect = Stream.generate(()->{return new Random()
							.nextInt(10);}).limit(10)
		 					.collect(Collectors.toList());
		 
		 
		 collect.forEach(System.out::println);
	}
}
