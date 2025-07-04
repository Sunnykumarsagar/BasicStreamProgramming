package com.basic.stream.programme;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// How do you find the first non-repeated character in a String using Stream API?
		String str = "aabbcddef";
		
		// we use Map
		Character res = str.chars().mapToObj(n -> (char) n).collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().	
				stream().filter(c -> c.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
		
		System.out.println(res);

	}

}
