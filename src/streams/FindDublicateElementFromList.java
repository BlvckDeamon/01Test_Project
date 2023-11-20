package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDublicateElementFromList {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,40,70,60,50,30,40,10);
		Set<Integer> set = new HashSet<>();
		
		asList.stream().filter(e-> ! set.add(e)).forEach(System.out::println);

	}

}
