package com.zhiyou200;
//���幤����
public class BananaFactory implements FruitsFactory{

	@Override
	public Fruits getFruits() {
		
		return new Banana();
	}

}
