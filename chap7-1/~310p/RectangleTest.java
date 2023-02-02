//interface Comparable{ 	-> 표준 자바 라이브러리에 정의되어 있음, 실제로는 제네릭을 사용해서 정의
//	int compareTo(Object other); 	-> -1,0,1 반환
//}

class Rectangle2 implements Comparable{
	public int width =0;
	public int height=0;
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea(){
		return width*height;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle2 otherRect = (Rectangle2) o;
		if(this.getArea()< otherRect.getArea()) return -1;
		else if(this.getArea() >otherRect.getArea()) return 1;
		else return 0;
	}

	
	
}
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(100, 30);
		Rectangle2 r2 = new Rectangle2(200,10);
		int result = r1.compareTo(r2);
		if(result == 1) System.out.println(r1+"가 더 큽니다.");
		else if(result ==-1)System.out.println(r2+"가 더 큽니다.");
		else System.out.println("같습니다");

	}

}
