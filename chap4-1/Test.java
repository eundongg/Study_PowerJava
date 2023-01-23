class A{
	private int a;
	int b;
	public int c;
}
public class Test {

	public static void main(String[] args) {
		A obj = new A();
		
		obj.a = 10;	// 전용 멤버는 다른 클래스에서 접근 불가
		obj.b = 20;	// 디폴트 멤버는 접근 가능
		obj.c = 40;	// 공용 멤버는 접근 가능

	}

}
