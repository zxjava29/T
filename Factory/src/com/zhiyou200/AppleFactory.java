package com.zhiyou200;

// ���幤��
public class AppleFactory implements FruitsFactory{

	@Override
	public Fruits getFruits() {
		
		return new Apple();
	}

}
