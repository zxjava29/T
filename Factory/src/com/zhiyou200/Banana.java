package com.zhiyou200;

public class Banana implements Fruits{

	@Override
	public void bloom() {
		System.out.println("香蕉树开花了");
	}

	@Override
	public void result() {
		System.out.println("香蕉树结果了");
	}

}
