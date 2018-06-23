package javaprograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {
	String s = "shivamsharma";

	public void findduplicateCharInString(String s) {
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c) + 1);
			} else {
				hashmap.put(c, 1);
			}
		}
		Set<Character> keys = hashmap.keySet();
		for (Character c : keys) {
			if (hashmap.get(c) > 1) {
				System.out.println(c + "==============" + hashmap.get(c));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharInString obj = new DuplicateCharInString();
		obj.findduplicateCharInString(obj.s);
	}

}
