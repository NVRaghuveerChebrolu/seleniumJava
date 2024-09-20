package com.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class maxOcuurancesOfCharsPresentInString {
	public static void main(String[] args) {
		String str = "Sneha Deshpande zzzzz";
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Map.Entry<Character, Integer> MaxOccurance = null;

		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		int MaxValue = Integer.MIN_VALUE;
		for (int value : hmap.values()) {
			if (value > MaxValue) {
				MaxValue = value;
			}
		}
		for (Map.Entry<Character, Integer> map : hmap.entrySet()) {
			// System.out.println(map.getKey()+":"+map.getValue());
			if (map.getValue() == MaxValue) {
				System.out.println("Max Occurance Key is :" + map.getKey() + " and value is:" + map.getValue());
			}
		}

	}
}
