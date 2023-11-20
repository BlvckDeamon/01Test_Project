package test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDublicateFromArray {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,2,3,5,7,8);
		
		Set<Integer> set = new TreeSet<>();
		asList.stream().filter(e -> !set.add(e)).forEach(System.out::println);

	}

}
