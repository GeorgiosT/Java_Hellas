public class Circle extends Shape {

	public int area() {
		int radius = width / 2;
		return (int) (Math.PI * radius * radius);
	}

	public int perimeter() {
		int radius = width / 2;
		return (int) (2 * Math.PI * radius);
	}

}
