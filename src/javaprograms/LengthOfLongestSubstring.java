package javaprograms;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	String s = "shivamsharma";

	public static int lengthoflongestsunstring(String s) {
		int len = 0;
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], i);
			} else {
				len = Math.max(len, map.size());
				map.clear();
			}

		}

		return Math.max(len, map.size());

	}

	public static void main(String[] args) {
		System.out.println(lengthoflongestsunstring("abcdefgha"));

	}

}
