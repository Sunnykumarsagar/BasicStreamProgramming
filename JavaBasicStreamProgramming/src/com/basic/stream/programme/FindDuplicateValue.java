package com.basic.stream.programme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateValue {

	public static void main(String[] args) {
		// Find duplicate Value
		List<Integer> val = Arrays.asList(1,2,3,2,3,4,1,5);
		
		Set<Integer> seen = new HashSet<>();
//		Set<Integer> dup = new HashSet<>();
		
		// Using normal approach
		
//		for (int ar : val) {
//			if (!seen.add(ar)) {
//				dup.add(ar);
//			}
//		}
//		System.out.println("Remova Duplicate in this Set : " + seen);
//		System.out.println("Duplicate Value are : " + dup);
		
		// now using stream api
		
		Set<Integer> dup = val.stream().filter(n -> !seen.add(n)).collect(
				Collectors.toSet());
		
		System.out.println("Duplicates are " + dup);
		
		Set<Integer> res = val.stream().collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting())).entrySet().stream().
				filter(n -> n.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		
		System.out.println("Duplicate are : " + res);
		
	}

}
