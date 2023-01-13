import java.util.Scanner;

public class Orange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many oranges? : ");
		int orange = sc.nextInt();
		System.out.println("we need "+ orange/10 + " boxes and" 
		+" there are "+orange%10+" oranges left" );
	}

}
