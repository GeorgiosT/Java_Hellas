package com.Farm1;

public class Poly2 {

	public static void main(String[] args) {

		Animal[] animalArray = new Animal[2];
		Cow2 daisy = new Cow2();
		Sheep2 dolly = new Sheep2();

		animalArray[0] = daisy;
		animalArray[1] = dolly;

		for (Animal a : animalArray)
			a.eat();

		// Same as above
		Animal[] aA = { new Cow2(), new Sheep2() };
		for (Animal a : aA)
			a.eat();

	}

}
