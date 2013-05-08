package com.Farm1;

public class Box implements Describable {
	private String description;
	@SuppressWarnings("unused")
	private int height; // Declared outside the method cz Box...
	@SuppressWarnings("unused")
	private int width; // ....
	@SuppressWarnings("unused")
	private int length; // ..must have a height,width and length when created

	public Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
		description = "A box that is " + height + " high, " + length
				+ " long and " + width + " wide ";
	}

	public String getDescription() {// The (Describable) interfaces common..
												// ..method
		return description;
	}
	/*
	 * Implement other methods for a box
	 */
}
