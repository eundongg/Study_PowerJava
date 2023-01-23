class Pizza{
	int size;
	String type;
	
	public Pizza() {	//파라미터가 없는 생성자
		size =12;
		type = "슈퍼슈프림";
	}
	public Pizza(int s, String t) {	//파라미터가 있는 생성자
		size = s;
		type = t;
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+" , "+obj1.size+")");
		
		Pizza obj2 = new Pizza(24, "포테이토");
		System.out.println("("+obj2.type+" , "+obj2.size+")");

	}

}
