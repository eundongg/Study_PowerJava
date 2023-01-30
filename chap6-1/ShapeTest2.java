class Shape3 {
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}
class Rectangle2 extends Shape3{
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
class Triangle2 extends Shape3{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
class Circle2 extends Shape3{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class ShapeTest2 {

	public static void main(String[] args) {
		Shape3 s1, s2;
		
		s1 = new Shape3();
		s2 = new Rectangle2();
		
	}

}
