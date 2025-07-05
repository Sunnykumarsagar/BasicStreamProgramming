package com.basic.stream.programme;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ALLMostAllStreamQuestionWithBestPractice {

	public static void main(String[] args) {


		// $Java Program find count the String length as a value and name as a key
		
		// Please Uncomment and use this

//		List<String> list = Arrays.asList("Arjun","Sunny","Sunil","Anil","Kaushal");
		
		/* Map<String,Integer> map = list.stream().collect(Collectors.toMap(
				Function.identity(),String::length));
		
		System.out.println("Value are : " + map);*/
		
		// Same Programe but some Changes don't count Space
		
		/*List<String> list1 = Arrays.asList("Arjun Kumar","Sunny Kumar ","Sunil Kumar",
				"Anil Kumar","Kaushal Kumar");
		
		Map<String,Integer> res = list1.stream().collect(Collectors.toMap(name ->name, 
				name -> name.replace(" ","").length()));
		
		System.out.println("Values are :" + res);
		
		res.forEach((k,v) ->
			System.out.println("Name is : "	+ k +  " Length are " + v));*/
		
		// $Java Program To Find Largest Second Largest and Third Largest
		

		int arr[] = {23,54,12,67,100,321,32,98};
		
		// I use Here Stream in Stream I use sorted method and natural and Customize 
		
		//	###Maximum Value
		
		/* Integer maxValue1 = Arrays.stream(arr).boxed().sorted(
				(i1,i2) ->
					i2.compareTo(i1)
				).findAny().orElse(-1);
		
		System.out.println("Max Value is : " + maxValue1);*/
		
		/*Integer maxValue2 = Arrays.stream(arr).boxed().sorted(
				(i1,i2) -> i1 < i2 ? 1 : i1 > i2 ? -1 : 0).findFirst().orElse(-1);
		
		System.out.println("Max Value is : " + maxValue2);*/
		
		
		// ###Second Maximum Value 
		
		/*Integer sencondMaxValue = Arrays.stream(arr).boxed().sorted(
				(i1,i2) -> 
					i2.compareTo(i1)
				).skip(1).findAny().orElse(-1);
		
		System.out.println("Second Maximum Value is : " + sencondMaxValue);*/
		
		// ## Third Largest Value 
		
		/*Integer thirdLargestValue = Arrays.stream(arr).boxed().sorted(
				(i1,i2) -> 
					i2.compareTo(i1)
				).skip(2).findAny().orElse(-1);
		
		System.out.println("Third Max Value is : " + thirdLargestValue);*/
		
	}

}
