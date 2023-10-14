package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = ()-> {return new Random().nextInt(5000);};

		Stream<Integer> generate = Stream.generate(supplier).limit(10);
		
		generate.forEach(System.out::println);
	}

}
