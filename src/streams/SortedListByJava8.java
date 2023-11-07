package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListByJava8 {

	public static void main(String[] args) {
		
		//sort a list by assending 
		
		List<Integer> asList = Arrays.asList(1, 4, 5, 6, 3, 9, 7, 4, 23);

		List<Integer> collect = asList.stream()
									.sorted()
									.collect(Collectors.toList());

		collect.forEach(e -> System.out.print(e + " "));

		
		//sort a list by desending 
		
		List<Integer> asList2 = Arrays.asList(1, 4, 5, 6, 3, 9, 7, 4, 23);

		System.out.println();

		List<Integer> collect2 = asList2.stream()
									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());

		collect2.forEach(e -> System.out.print(e + " "));
	}

}
