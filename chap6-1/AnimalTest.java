class Animal3 {
	void walk() {
		System.out.println("걸을 수 있음");
	}
}
class Bird extends Animal3{
	void fly() {
		System.out.println("날 수 있음");
	}
	void sing()	{
		System.out.println("노래부를 수 있음");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Bird bird = new Bird();
		
		bird.walk();
		bird.fly();
		bird.sing();

	}

}
