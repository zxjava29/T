package com.zhiyou400;

public class FruitsFactory {
	
	
	// 简单工厂需要接收一个参数,然后通过判断参数来决定返回的对象是哪一个
	public static Fruits getFruits(String name) {
		Fruits object=null;
		try {
			Class class1 = Class.forName(name);
			object = (Fruits) class1.newInstance();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
