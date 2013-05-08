package com.Farm1;

public class Goat implements Describable {
	private String description;

	public Goat(String name) {
		description = "A goat named " + name;
	}

	public String getDescription() { // The (Describable) interfaces common method
		return description;
	}
	/*
	 * Implement other methods for a goat
	 */
}
