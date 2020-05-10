package com.gushaohua.study;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionStudy {
	static Collection gather(Collection<String> collection) {
		collection.add("gu");
		collection.add("shao");
		collection.add("hua");
		collection.add("is");
		collection.add("handsome");
		collection.add("handsome");
		return collection;		
	}
	static Map keyValue(Map<String,String> map) {
		map.put("gu", "谷");
		map.put("shao", "少");
		map.put("hua", "华");
		map.put("is", "是");
		map.put("handsome", "帅哥");
		map.put("handsome", "帅哥");
		return map;
	}
	
	public static void main(String[] args) {
		print(gather(new ArrayList<String>()));
		print(gather(new LinkedList<String>()));
		print(gather(new HashSet<String>()));
		
		print(gather(new TreeSet<String>()));
		print(gather(new LinkedHashSet<String>()));
		
		print(keyValue(new HashMap<String, String>()));
		print(keyValue(new TreeMap<String, String>()));
		print(keyValue(new LinkedHashMap<String, String>()));
		
	}
	
	static void print(Object ob) {
		System.out.println(ob.toString()); 
	}

}
