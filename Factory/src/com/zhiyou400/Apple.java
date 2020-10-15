package com.zhiyou400;

import lombok.Data;

@Data
public class Apple implements Fruits{
	private String name;
	
	@Override
	public void bloom() {
		System.out.println("苹果树开花了");
	}

	@Override
	public void result() {
		System.out.println("苹果树结果了");
	}

}
