package com.gushaohua.study;

public class Apple extends BaseEntity implements FoodService  {

	
	private  static long counter;
	
	private final long serialNumber = counter++;
	
	public long serialNumber() {
		
		return serialNumber;
	}
	
	
	public Apple(String apple) {
		System.out.println(apple+" is a fruit! i love it");
	}
	
	
	
	public Apple() {
		super();
		
	}






	@Override
	public String foodType() {
		// TODO Auto-generated method stub
		return "fruits-apple";
	}
	
	

}
