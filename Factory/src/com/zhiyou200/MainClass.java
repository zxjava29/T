package com.zhiyou200;

public class MainClass {

	public static void main(String[] args) {
		FruitsFactory factory = new AppleFactory();
		Fruits fruits = factory.getFruits();
		fruits.bloom();
		fruits.result();
	}
}
