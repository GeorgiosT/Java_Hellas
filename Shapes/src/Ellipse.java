public class Ellipse extends Shape {

	public int area() {
		return (int) (Math.PI * 0.5 * height * 0.5 * width);
	}

	public int perimeter() {
		int a = (int) (height * 0.5);
		int b = (int) (width * 0.5);

		int p = (int) (2 * Math.PI * (Math.sqrt((a * a + b) / 2)));

		return p;
	}
}
