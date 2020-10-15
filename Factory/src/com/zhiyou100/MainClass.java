package com.zhiyou100;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fruits fruits = FruitsFactory.getFruits(sc.next());
		fruits.bloom();
		fruits.result();
	}
}
