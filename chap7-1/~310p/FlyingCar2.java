interface Flyable2 {void fly();}

class Car {
	int speed;

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
public class FlyingCar2 extends Car implements Flyable2 {
	public void fly() {System.out.println("I'm Flying.");}

	public static void main(String[] args) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(60);
		obj.fly();
	}

}
