package com.Farm1;

public class Tester2 {

	public static void main(String[] args) {
		new Tester2();// We create a Tester2 object
	}

	public Tester2() {
		Goat goat = new Goat("Bob");// Goat takes a string arg so we pass it
		Box box = new Box(3, 5, 3);// Box takes 3 ints as args so we pass them
		Person person = new Person("Jack");

		System.out.println(description(goat));// goat is Describable
		System.out.println(description(box));// box is Describable
		System.out.println(description(person));
	}

	private String description(Describable d) {
		return d.getDescription();// Thats the interfaces(Describable) common
									// method..
									// ..and takes a Describable
									// object(Goat,Box)...
									// ...that implement that interface
	}
}
