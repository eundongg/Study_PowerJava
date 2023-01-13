import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, f;
		int num;		
		
		while(true) {
			
			System.out.println("========================");
			System.out.println("1. F -> C ");
			System.out.println("2. C -> F ");
			System.out.println("========================");
			
			num = sc.nextInt();
			if(num ==1) {
				System.out.print("insert F : ");
				f = sc.nextDouble(); //nextDouble()을 까먹고 nextInt()를 쓰고 있었네..
				c = (f-32) / 1.8;
				System.out.println("C = "+ c);
			}
			else if(num == 2) {
				System.out.print("insert C : ");
				c = sc.nextDouble();
				f= c * 1.8 + 32;
				System.out.println("F = "+f);
			} 
			else break;
		} 
	    
	    
	}

}
