class Rect {
	int width, height;

	public Rect(int w, int h) {
		super();
		this.width = w;
		this.height = h;
	}
	double getArea() {return (double)width*height;}
	
}
public class RectArrayTest {

	public static void main(String[] args) {
		
		Rect[] list = new Rect[5];	// 배열 객체 생성
		
		for(int i=0;i<list.length;i++) {
			list[i] = new Rect(i,i);
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(i+"번째 사각형의 면적 = "+list[i].getArea());
		}		

	}

}
