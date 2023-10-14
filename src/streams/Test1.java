package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		
		
		List<String> list = List.of("xyz","fgtm","hjsjd", "snkjfn");
		
		Stream<String> stream = list.stream();
		
		Predicate<String> pre =  (name) -> { return name.length()>=4 ;};
		
		Stream<String> filter = stream.filter(pre);
		
		Consumer<String> con = name -> System.out.println(name);
		
		filter.forEach(con);
		
		
		list.stream().filter(( name)->{ return name.length()>=4 ;})
					.forEach((name)-> System.out.println("name "+ name));;
	}

}
