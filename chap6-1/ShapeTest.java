class Shape2{
	public void draw()	{
		System.out.println("Shape");
	}
}
class Rectangle extends Shape2{ 
	public void draw() {
		super.draw();
		System.out.println("Rectangle");
	}
}
class Triangle extends Shape2{
	public void draw() {
		System.out.println("Triangle");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.draw();
	}

}
