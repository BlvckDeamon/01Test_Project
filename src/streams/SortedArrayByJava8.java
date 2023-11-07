package streams;

import java.util.Arrays;

public class SortedArrayByJava8 {
	public static void main(String[] args) {

		int[] ar1 = { 1, 4, 5, 6, 3, 9, 7, 4 };

		int[] sortedArray = Arrays.stream(ar1).sorted().toArray();

		System.out.println(Arrays.toString(sortedArray));

	}
}
