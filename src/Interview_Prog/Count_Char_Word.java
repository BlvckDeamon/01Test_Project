package Interview_Prog;

import java.util.HashMap;
import java.util.Map;

public class Count_Char_Word {

	public static void main(String[] args) {
		
		String s = "vivek";
		
		Map< Character, Integer> map = new HashMap<>();
		for (int i = 0 ; i<s.length();i++) {
			char w = s.charAt(i);
			if (map.containsKey(w)) {
				map.put(w, map.get(w) + 1);
			} else {
				map.put(w, 1);
			}
		}
		System.out.println(map);
	}

}
