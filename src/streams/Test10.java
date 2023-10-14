package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10 {

	public static void main(String[] args) {
		
		Employee1 emp1 = new Employee1(1,"vivek",230000,"male");
		Employee1 emp2 = new Employee1(2,"vivek",80000,"male");
		Employee1 emp3 = new Employee1(3,"xyz",30000,"female");
		Employee1 emp4 = new Employee1(4,"tushar",100000,"male");
		
		// find the employee whose salary > 50000 
		List<Employee1> list = List.of(emp1,emp2,emp3,emp4);
		List<Employee1> collect = list.stream()
				.filter(e ->{ return e.getSalary()>50000;}).collect(Collectors.toList());

		collect.forEach(System.out::println);
		
		System.out.println("=================================");
		
		// find the employee whose salary is > 50000 and male
		Stream<Employee1> filter = list.stream().filter(e->{ return e.getSalary()>= 50000 
									&& "vivek".equalsIgnoreCase(e.getName());});
		
		filter.forEach(System.out::println);
		
		System.out.println("=================================");
		
		// find the min and max salary from the employee
		
		Optional<Employee1> min = list.stream().min( Comparator.comparing(Employee1::getSalary)	);
		
		if(min.isPresent())
		{
			System.out.println(min.get());
		}
		
		Optional<Employee1> max = list.stream().max( Comparator.comparing(Employee1::getSalary)	);
		
		if(max.isPresent())
		{
			System.out.println(max.get());
		}
		
		System.out.println("=================================");
		
		// Finding the Employees count based on Gender and return as 
		//			Map object  O/P :{Male :50, Female :82}
		
		Map<String, Long> map = list.stream()
						.collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
		
		System.out.println(map);
		
		
		System.out.println("=================================");
		
		
		//Finding the frequencies of each word in given sentence 
		//and print the Non-Repeated Words using Java8 Streams.
		
		String s = "hi this is gaming laptop and this very poerfull laptop";
		
		 Map<String, Long> collect2 = Stream.of(s.split(" "))
				.collect(Collectors.groupingBy( (s1)->{ return s1;}, Collectors.counting()));
		System.out.println(collect2);
		
		Set<String> set = Stream.of(s.split(" ")).collect(Collectors.toSet());
		System.out.println(set);
		
		
		
		System.out.println("=================================");
		
		//Find all the employees information in the form of map object 
		//where key should be Employee object and Value should be Employee Email Id.
		
		Map<Integer, String> collect3 = list.stream()
				.collect(Collectors.toMap (Employee1::getId ,Employee1::getName));
		
		collect3.forEach((k,v)->System.out.println(k+"="+v));
		
		
		System.out.println("=================================");
		
		//Write Java8 Program to remove the duplicate values from two arraylist.
		
		 List<Integer> list2 = List.of(1,2,3,4,5,6,1,2,3,4,5,6,7,8,9,10);
		 
		 list2.stream().collect(Collectors.toSet())
		               .forEach(System.out::println);;
		               
		System.out.println("==============*===================");
		
		//Write Java8 Program to find the common elements from two ArrayList

		List<Integer> list3 = List.of(1, 2, 3, 4, 5);
		
		Set<Integer> collect4 = list2.stream().filter(list3::contains)
												.collect(Collectors.toSet());
		
		collect4.forEach(System.out::println);

		System.out.println("==================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
