package com.Farm1;

public class Poly {

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		a.method2();

		B b = new B();
		b.method1();
		b.method2();
		b.method3();
		b.method4();

		A c = new B();
		c.method1();
		c.method2();
		// c.method3(); <------ Can't see it (compiler error),cause it's of class A reference

	}
}

class A {
	void method1() {
	}

	void method2() {
	}
}

class B extends A {
	void method3() {
	}

	void method4() {
	}

}
