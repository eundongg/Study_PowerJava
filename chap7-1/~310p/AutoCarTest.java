//예를 들어 운전자가 없이 컴퓨터가 제어하는 자동차가 승
//객을 수송하는 미래 사회를 상상해보자. 자동차 제조사들
//은 자동차를 제어하는 소프트웨어를 자바로 작성한다. 자
//율 주행 시스템 업체에서는 GPS 신호와 교통 상황 정보
//를 받아서 자동차를 운전하는 소프트웨어를 만든다.
//다음과 같은 추상 메소드를 가지는 인터페이스와 이 인터
//페이스를 구현하는 클래스를 작성하여 테스트해보자.

interface OperateCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}

class AutoCar implements OperateCar{
	public void start() {
		System.out.println("자동차가 출발합니다");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을 "+degree+"도 만큼 바꿉니다.");
	}
}
public class AutoCarTest {

	public static void main(String[] args) {
		OperateCar car = new AutoCar();
		car.start();
		car.setSpeed(60);
		car.turn(15);
		car.stop();

	}

}
