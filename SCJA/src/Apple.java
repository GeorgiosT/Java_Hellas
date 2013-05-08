public class Apple {

	private String color;

	public Apple(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Apple greenApple = new Apple("green");
		Apple redApple = greenApple;
		redApple.setColor("red");
		System.out.println(greenApple.getColor() + " " + redApple.getColor() );
		
		
	}

}
