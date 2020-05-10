package com.gushaohua.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SimpleCollection {
	
	public static void main(String[] args) {
		Collection<Integer> integers = new ArrayList<Integer>();
		Integer[] integerArray = {1,2,3,4,5,6,7,8,9};
		integers.addAll(Arrays.asList(integerArray));
		Collections.addAll(integers, 1,23,34,45);
		Collections.addAll(integers, integerArray);
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		
	}

}
