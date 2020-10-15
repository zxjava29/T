package com.zhiyou400;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Fruits fruits = FruitsFactory.getFruits("com.zhiyou400.Banana");
		fruits.bloom();
		fruits.result();	
	
	}
}
