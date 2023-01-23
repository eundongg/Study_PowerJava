
public class CircleTest {

	public static void main(String[] args) {
		Circle obj1, obj2;		//참조 변수 선언
		
		obj1 = new Circle();
		obj2 = new Circle();
		
		obj1.radius = 100;
		obj1.color = "red";
		obj2.radius = 200;
		obj2.color = "blue";
		
		double area1 = obj1.getArea();		//객체 메소드 접근
		double area2 = obj2.getArea();
		System.out.println("area of circle : "+ area1);
		System.out.println("area of circle : "+ area2);
	}

}
