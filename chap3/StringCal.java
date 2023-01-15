import java.util.Scanner;

public class StringCal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String operator;
		int num1=0, num2=0;
		
		System.out.print("insert operator : ");
		operator = sc.next();
		
		System.out.printf("insert two number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();		
		
		if(operator.equals("+")) {
			System.out.printf("%.1f + %.1f = %.1f", (double)num1, (double)num2, (double)(num1+num2));
		}
		else if(operator.equals("-")) {
			System.out.printf("%.1f - %.1f = %.1f", (double)num1, (double)num2, (double)(num1-num2));
		}
		else if(operator.equals("*")) {
			System.out.printf("%.1f * %.1f = %.1f", (double)num1, (double)num2, (double)(num1*num2));
		}
		else if(operator.equals("/")) {
			if(num2 != 0) {
				System.out.printf("%.1f + %.1f = %.1f", (double)num1, (double)num2, (double)(num1/num2));
			}
			else System.out.println("Unable to calculate.");
		}
		
				
				

	}

}
