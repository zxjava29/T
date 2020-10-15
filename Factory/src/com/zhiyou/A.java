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

// 一个接口
interface Inter{
	
}
// 接口的实现类A
class InterImplA implements Inter{
	
}

//接口的实现类B
class InterImplB implements Inter{
	
}