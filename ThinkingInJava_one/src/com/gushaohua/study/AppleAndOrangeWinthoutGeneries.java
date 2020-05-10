package com.gushaohua.study;

import java.util.ArrayList;

public class AppleAndOrangeWinthoutGeneries {

	//@SuppressWarnings(value = { "gushaohua is handsome!!!" })
	public static void main(String[] args) {
		ArrayList<BaseEntity> bases =new  ArrayList<>();
		
		Apple apple = new Apple();
		
		Orange orange = new Orange();
		
		bases.add(apple);
		bases.add(orange);
		
		for (int i = 0; i < bases.size(); i++) {
		System.out.println(bases.get(i));	
		}
	}
	
}
