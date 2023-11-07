package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,6,7,8,9);
		List<Integer> list1 = Arrays.asList(3,5,10);
		
		List<Integer> collect = Stream.of(list , list1)
				.flatMap(List::stream).sorted().collect(Collectors.toList());
		
		System.out.println(collect);
		

		List<Integer> collect2 = collect.stream().sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
