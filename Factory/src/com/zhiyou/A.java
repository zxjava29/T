package com.zhiyou;

public class A {
	public static void main(String[] args) {
		Inter i = new  InterImplA();
	}
}
class B{
	public static void main(String[] args) {
		Inter i = new  InterImplA();
	}
}
class C{
	public static void main(String[] args) {
		Inter i = new  InterImplA();
	}
}

// һ���ӿ�
interface Inter{
	
}
// �ӿڵ�ʵ����A
class InterImplA implements Inter{
	
}

//�ӿڵ�ʵ����B
class InterImplB implements Inter{
	
}