interface RemoteControl2{
	void turnOn();
	void turnOff();
}
public class AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl2 ac = new RemoteControl2() {
			public void turnOn(){
				System.out.println("tv turnOn()");
			}
			public void turnOff() {
				System.out.println("tv turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
