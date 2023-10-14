package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindOcc_OfStr_ArrayEle {

	public static void main(String[] args) {

		
		// find the occurence of each string in array
		String[] str = {"vi","i","vi","e","k"};
		  Arrays.stream(str)
		 	   .collect(Collectors.groupingBy(s-> s,Collectors.counting()))
		 	   .forEach((k,v) -> {System.out.println(k+" = "+v);});
	
		  System.out.println("------------==-------------------");
		  
		 Map<String, Long> collect = 
				 Arrays.stream(str)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 	 collect.forEach((k,v) -> {System.out.println(k+" = "+v);});
		 	  
		System.out.println("-------------==-----------------");
		
		// find the occurence of each character in string
		 String s1 = "vivek";
		 Arrays.stream(s1.split(""))
			   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			   .forEach((k,v) -> {System.out.println(k+" = "+v);});
		 System.out.println("-------------==-----------------");
		 
		// find the occurence of each character in string
				 String s2 = "vivek ankush mate vivek ankush mate";
				 Arrays.stream(s2.split(" "))
					   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					   .forEach((k,v) -> {System.out.println(k+" = "+v);});
				 System.out.println("-------------==-----------------");
				 
				 
				 String s3 = "vivek ankush mate vivek ankush mate";
				 Set<String> list = Arrays.stream(s2.split(" ")).collect(Collectors.toSet());
				 
				 System.out.println(list);
	}

}
