package com.Farm1;

public class FeedStation3 {

	public static void main(String[] args) {
		Cow3 daisy = new Cow3();
		Sheep3 dolly = new Sheep3();
		Metal beam = new Metal();
		FeedStation3 fs = new FeedStation3();

		// No inheritance relationship between Metal and Animals(Cow3 & Sheep3)
		// Relationship between interfaces.
		fs.feed(daisy);
		fs.feed(dolly);
		fs.feed(beam);

	}

	// Pass an object that implements the Interface Eatable
	public void feed(Eatable e) {
		e.eat();
	}

}
