class Shape4{
	public double getArea() {
		return 0;	
	}
	public Shape4()	{
		super();
	}
}
class Rectangle3 extends Shape4{
	private double width, height;

	public Rectangle3(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}	
}
class Circle3 extends Shape4{
	private double base, height;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

	public Circle3(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}	
}
public class ShapeAreaTest {

	public static void main(String[] args) {
		Shape4 obj1 = new Rectangle3(10, 20);
		Shape4 obj2 = new Circle3(10, 20);
		
		System.out.println("Rectangle : "+ obj1.getArea());
		System.out.println("Circle : "+ obj2.getArea());
	}

}
