package com.zhiyou200;
//具体工厂类
public class BananaFactory implements FruitsFactory{

	@Override
	public Fruits getFruits() {
		
		return new Banana();
	}

}
