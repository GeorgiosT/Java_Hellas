package com.Farm1;

public class FeedStation2 {

	public static void main(String[] args) {
		Cow2 daisy = new Cow2();
		Sheep2 dolly = new Sheep2();
		FeedStation2 fs = new FeedStation2();

		

		fs.feed(daisy);
		fs.feed(dolly);
	}

	public void feed(Animal a) {
		a.eat();

		if (a instanceof Sheep2) {
			Sheep2 s = (Sheep2) a;
			s.butcher();
		}
	}
}