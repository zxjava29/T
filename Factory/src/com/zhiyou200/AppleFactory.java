package com.zhiyou200;

// 具体工厂
public class AppleFactory implements FruitsFactory{

	@Override
	public Fruits getFruits() {
		
		return new Apple();
	}

}
