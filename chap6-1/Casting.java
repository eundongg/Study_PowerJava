class Parent{
	void print() {
		System.out.println("Parent 메소드 호출");
	}
}
class Child extends Parent {

	@Override
	void print() {
		System.out.println("Child 메소드 호출");
	}
	
}
public class Casting {

	public static void main(String[] args) {
		Parent person = new Child();
		person.print();
		
		Child down = (Child)person;	// 다운캐스팅 : 부모 객체를 자식 객체로 형변환
		down.print();
	}
}
