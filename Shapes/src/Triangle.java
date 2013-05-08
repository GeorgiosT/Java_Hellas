public class Triangle extends Shape {

	int sideA;
	int sideB;

	public int area() {
		return (int) (0.5 * height * width);
	}

	public int perimeter() {
		return width + sideA + sideB;
	}
}
