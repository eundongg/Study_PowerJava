/*전기 자동차를 클래스로 작성해보자. 자동차는 완전(100%) 배터리로 시작한다. 자동차를 운전할
때마다 1km를 주행하고 배터리의 10%를 소모한다. 전기 자동차에는 2가지 정보를 보여주는 디
스플레이가 있다. 주행한 총 거리는 "주행거리: ..km", 남은 배터리 충전량은 "배터리: ..%"와 같
이 표시된다.

배터리가 0%이면 더 이상 자동차를 운전할 수 없으며 "배터리 empty"와 같이 표시된다. 4개의 메
소드를 가진 ECar 클래스를 구현해보자.*/

class Ecar{
	private static Ecar instance;
	private Ecar() {}	// 전용 생성자
	
	int battery=100;
	int distance;
	int cnt=0;
	
	public int drive() {
		cnt++;
		battery -= 10;
		if(battery <0) battery = 0;
		return cnt;
	}
	
	public int disDistance() {
		distance = cnt;
		return distance;		
	}
	public int disBattery() {			
		return battery;		
	}
	
	public static Ecar getInstance() {
		if(instance == null) {
			instance = new Ecar(); 
			// singleton 객체가 garbage collector에 의해서 삭제되면 null값만 날라올 수 있기 때문에 
			// 미리 new로 객체를 생성하지 않고 getInstance()를 이용해서 생성할 수 있도록 변경했음
		}
		return instance;
	}	
	
}
public class CarTest {

	public static void main(String[] args) {
		Ecar car = Ecar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		car.drive();
		
		if(car.disBattery()==0) {
			System.out.println("주행거리" +car.disDistance()+"km");
			System.out.println("배터리 empty");
		}
		else {
			System.out.println("주행거리 " +car.disDistance()+"km");
			System.out.println("남은 배터리 " +car.disBattery());			
		}
		

	}

}
