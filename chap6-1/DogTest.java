class Animal {
	int age;
	void eat() {
		System.out.println("먹고 있다.");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("짖고 있다.");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}
