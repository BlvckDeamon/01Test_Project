package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindFirstDubOccurenceByJava8 {

	public static void main(String[] args) {

		String s = "abcdb";

		String[] split = s.split("");
		Set<String> set = new TreeSet<>();

		Optional<String> findFirst = Arrays.stream(split).filter(e -> !set.add(e)).findFirst();
		System.out.println(findFirst.get());

		System.out.println("=======================");

		List<String> collect = Arrays.stream(split).filter(e -> !set.add(e)).collect(Collectors.toList());

		System.out.println(collect.get(0));

	}
}
