package com.zhiyou400;

import lombok.Data;

@Data
public class Banana implements Fruits{
	private String name;
	private Integer age;
	private Apple apple;
	
	@Override
	public void bloom() {
		System.out.println("�㽶��������");
	}

	@Override
	public void result() {
		System.out.println("�㽶�������");
	}

}
