package com.basic.stream.programme;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindVowelGivenCharAray {

	public static void main(String[] args) {

		// Find Vowel in Given Char Array 
		
		char[] ch = {'A', 'b', 'C', 'd', 'E', 'f', 'G',
                'h', 'I', 'j', 'K', 'l', 'M', 'n',
                'O', 'p', 'Q', 'r', 'S', 't', 'U',
                'v', 'W', 'x', 'Y', 'z'
            };
		
		// Using stream i will create 
		
//		List<Character> list = IntStream.range(0, ch.length).mapToObj(i -> ch[i]).
//				filter(n -> "AEIOU".indexOf(n)>=0).collect(
//						Collectors.toList());
//		
//		System.out.println("Vowels are : " + list);
		
		// find other than Vowels
		
		List<Character> list = IntStream.range(0, ch.length).mapToObj(i -> ch[i]).
				filter(n -> "AEIOU".indexOf(n)<0).collect(Collectors.toList());
		
		System.out.print("Consonaint are : " + list);
		

	}

}
