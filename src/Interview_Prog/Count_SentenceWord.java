package Interview_Prog;

import java.util.HashMap;
import java.util.Map;

public class Count_SentenceWord {
	public static void main(String[] args) {
		String sentence = "India is my country and i love my country";
		String[] words = sentence.split(" ");
		Map<String, Integer> hash = new HashMap<>();

		for (String w : words) {
			if (hash.containsKey(w)) {
				hash.put(w, hash.get(w) + 1);
			} else {
				hash.put(w, 1);
			}
		}
		System.out.println(hash);
	}
}

