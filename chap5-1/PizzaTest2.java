class Pizza2{
	private String toppings;
	private int radius;
	static final double PI = 3.141592;
	static int count = 0;
	
	public Pizza2(String toppings) {
		super();
		this.toppings = toppings;
		count++;
	}
	
	
}
public class PizzaTest2 {

	public static void main(String[] args) {
		Pizza2 p1 = new Pizza2("Super Supreme");
		Pizza2 p2 = new Pizza2("Potato");
		Pizza2 p3 = new Pizza2("Pepperoni");
		
		int n = Pizza2.count; //
		System.out.println("현재까지 판매된 피자 개수 : "+n);

	}

}
