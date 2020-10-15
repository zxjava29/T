package com.zhiyou100;

public class Apple implements Fruits{

	@Override
	public void bloom() {

		System.out.println("苹果树");
	}

	@Override
	public void result() {
		System.out.println("苹果树结果了");
	}

}
