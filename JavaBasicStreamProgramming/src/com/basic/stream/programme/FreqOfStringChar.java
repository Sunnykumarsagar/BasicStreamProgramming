package com.basic.stream.programme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfStringChar {

	public static void main(String[] args) {
		// 
		String str = "aaabbccdeffg";
		// we use map
		Map<Character,Long> frq = str.chars().mapToObj(c -> (char) c).
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(frq);
	}

}
