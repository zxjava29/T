package com.zhiyou100;

public class FruitsFactory {
	
	
	// �򵥹�����Ҫ����һ������,Ȼ��ͨ���жϲ������������صĶ�������һ��
	public static Fruits getFruits(String name) {
		switch (name) {
		case "�㽶":
			return new Banana();
		case "ƻ��":
			return new Apple();
		default:
			return null;
		}
	}
}
