package streams;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "vivek");
		Employee e2 = new Employee(2, "tushar");
		Employee e3 = new Employee(3, "suraj");
		Employee e4 = new Employee(4, "kaniph");
		Employee e5 = new Employee(5, "vishal");

		List<Employee> list = List.of(e1, e2, e3, e4, e5);

		Map<Integer, String> collect = list.stream()
							.collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));

		collect.forEach((k, v) -> System.out.println(k + " = " + v));
		
		System.out.println("=--------------=");

		List<Employee> collect2 = collect.entrySet().stream().map(eachEntry -> {
						return new Employee(eachEntry.getKey(), eachEntry.getValue());
						}).collect(Collectors.toList());
		
		collect2.forEach(System.out::println);
	}

}
