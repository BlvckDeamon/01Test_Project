package streams;

import java.util.Arrays;

public class SortingStringAssending {

	public static void main(String[] args) {
		
		String s = "vivek";
		
		Arrays.stream(s.split("")).sorted().forEach(System.out::println);
	}

}
