package com.basic.stream.programme;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sunny","Sagar","Samir","Sagar","Samir");
		
		// we use Map to find the Frq
		Map<String,Long> frq = list.stream().collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting()));
		System.out.println(frq);

	}

}
