package com.zhiyou400;

public class FruitsFactory {
	
	
	// �򵥹�����Ҫ����һ������,Ȼ��ͨ���жϲ������������صĶ�������һ��
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
