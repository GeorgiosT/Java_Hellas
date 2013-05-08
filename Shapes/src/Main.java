public class Main {

	public static void main(String[] args) {
		Square mySquare = new Square();
		Circle myCircle = new Circle();
		Triangle myTriangle = new Triangle();
		Ellipse myEllipse = new Ellipse();

		mySquare.height = 7;
		mySquare.width = 7;

		myCircle.width = 10;

		myTriangle.width = 5;
		myTriangle.height = 8;
		myTriangle.sideA = 6;
		myTriangle.sideB = 8;

		myEllipse.height = 10;
		myEllipse.width = 15;

		displayStats(myCircle);
		displayStats(mySquare);
	}

	public static void displayStats(Shape myShape) {
		System.out.println("The area is " + myShape.area());
		System.out.println("The perimeter is " + myShape.perimeter());
	}
}
