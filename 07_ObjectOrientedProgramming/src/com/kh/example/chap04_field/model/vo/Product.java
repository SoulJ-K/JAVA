package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100;
	
	{
		name = "칸초";
		price = 1000;
		brand = "롯데";
		num -= 10;
	}
	
	static {
//		name = "홈런볼";
//		brand = "해태";
//		price = 2000;
		num = 150;
		num--;
	}
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
		
	}
}
