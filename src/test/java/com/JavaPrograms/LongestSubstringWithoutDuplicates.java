package com.JavaPrograms;

import java.util.HashMap;

public class LongestSubstringWithoutDuplicates {
	public static void main(String[] args) {
		String input = "abcabcbb"; // Example input string
		String longestSubstring = findLongestSubstring(input);
		System.out.println("Longest substring without duplicates: " + longestSubstring);
	}

	public static String findLongestSubstring(String str) {
		int n = str.length();
		int start = 0;
		int maxLength = 0;
		int startIdx = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (map.containsKey(c) && map.get(c) >= start) {
				start = map.get(c) + 1;
			}
			map.put(c, i);
			if (i - start + 1 > maxLength) {
				maxLength = i - start + 1;
				startIdx = start;
			}
		}
		return str.substring(startIdx, startIdx + maxLength);
	}
}