package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
	public static void main(String[] args) {

		Custumer cz = new Custumer("vivek","pune",50000,"male") ;
		Custumer c1 = new Custumer("vivek","nagar",10000,"male");
		Custumer c2 = new Custumer("tushar","banglore",10000,"male");
		Custumer c3 = new Custumer("vishal","pune",10000,"female");
		Custumer c4 = new Custumer("xyz","chennai",10000,"male");
		Custumer c5 = new Custumer("suraj","nagar",30000,"male");
		
		List<Custumer> of = List.of(c1,c2,c3,c4,c5,cz);
		
		// find the custumer whose resides in nagar and bill > 20000
		Stream<Custumer> filter = of.stream().filter(c -> { return "nagar".equalsIgnoreCase(c.getCity()) ;})
					.filter(c -> {return c.getBill() > 20000 ;});
		
		filter.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		
		List<Custumer> collect = of.stream().filter(c-> {return "male".equalsIgnoreCase(c.getGender());})
					.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
	}
}
