
public class PizzaTopping {

	public static void main(String[] args) {
		
		String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		// for-each 문을 이용
		for(String s: toppings) {
			System.out.print(s+" ");
		}

		// for 문을 이용
		for(int i=0;i<toppings.length;i++) {
			System.out.print(toppings[i]+ " ");
		}
		
	}

}
