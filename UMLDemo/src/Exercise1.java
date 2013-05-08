public class Exercise1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Goat myGoat = new Goat();
		@SuppressWarnings("unused")
		Human myHuman = new Human();
		@SuppressWarnings("unused")
		Animal myAnimal = new Human();
		Human bg = new BabyGirl();
		@SuppressWarnings("unused")
		BabyGirl babyG = (BabyGirl) bg;

	}

}

interface Shaveable {
}

class Animal {
	void metAni() {
	}
}

class Cow extends Animal {
	void metCow() {
	}
}

class Human extends Animal implements Shaveable {
}

class Goat extends Animal implements Shaveable {
	void metGoat() {
	}
}

class Man extends Human {
	void metMan() {
	}
}

class Woman extends Human {
	void metWom() {
	}
}

class Adult extends Man {
	void metAdu() {
	}
}

class Boy extends Man {
	void metBoy() {
	}
}

class AdultWoman extends Woman {
	void metAdu() {
	}
}

class Girl extends Woman {
	void metAdu() {
	}
}

class BabyGirl extends Woman {
	void metBab() {
	}
}
