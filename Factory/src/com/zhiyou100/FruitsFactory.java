package com.zhiyou100;

public class FruitsFactory {
	
	
	// 简单工厂需要接收一个参数,然后通过判断参数来决定返回的对象是哪一个
	public static Fruits getFruits(String name) {
		switch (name) {
		case "香蕉":
			return new Banana();
		case "苹果":
			return new Apple();
		default:
			return null;
		}
	}
}
