import java.util.Scanner;

public class Kilometer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert mile : ");
		double mile = sc.nextDouble();
		System.out.print(mile +" mile is "+ mile*1.609+" kilometer");		
	}

}
