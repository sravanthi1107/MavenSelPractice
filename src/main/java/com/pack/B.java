package com.pack;

class A
{
	void TestA(){
		
		System.out.println("A class Test");
	}
}

public class B extends A {
	
	void TestA() {
		System.out.println("B Class Test");
	}

	public static void main(String[] args) {
		
		B b1=new B();
		b1.TestA();
		A a1=new A();
		a1.TestA();
		a1=new B();
		a1.TestA();
		b1=(B) new A();
		b1.TestA();
	}

}
