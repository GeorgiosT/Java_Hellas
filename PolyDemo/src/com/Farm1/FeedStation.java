package com.Farm1;

public class FeedStation {

	public static void main(String[] args) {
		Cow daisy = new Cow();
		Sheep dolly = new Sheep();

		FeedStation feedStation = new FeedStation();

		feedStation.feed(daisy);
		feedStation.feed(dolly);
	
	}

	public void feed(Cow c) {
		c.eat();
	}

	public void feed(Sheep s) {
		s.eat();
	}

}
