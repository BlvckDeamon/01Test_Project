package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {

		String[] names = { "vivek", "tushar", "kaniph", "suraj" };
		Stream<String> stream = Arrays.stream(names);
		List<String> collect = stream.collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("------------");

		Stream<String> stream1 = Arrays.stream(names);
		String collect2 = stream1.collect(Collectors.joining(","));
		System.out.println(collect2);

		System.out.println("------------");

		Stream<String> stream2 = Arrays.stream(names);
		Stream<Map<String, String>> map = stream2.map(name -> {return Map.of(name,name);});
		map.forEach(System.out::println);
		

		System.out.println("------------");

		Stream<String> stream3 = Arrays.stream(names);
		Stream<Map<String, Integer>> map1 = stream3.map(name -> {return Map.of(name,name.length());});
		map1.forEach(System.out::println);
		
		System.out.println("-----*-------");
		Stream<String> stream4 = Arrays.stream(names);
		stream4.collect(Collectors.toMap(Function.identity(), Function.identity()))
				.forEach((k,v)->System.out.println(k+" = "+v));
	}

}
