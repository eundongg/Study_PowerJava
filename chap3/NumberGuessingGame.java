import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		int num = (int) (Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int g_num, cnt = 0;
		do {
			System.out.print("guess the answer : ");
			g_num = sc.nextInt(); 
			cnt++;
			if(g_num < num) {
				System.out.println("raise the answer.");
			}
			else if(g_num > num) System.out.println("lower the answer.");
		}while(g_num!=num);
		System.out.println("congratulation! your number of attempts is "+cnt);
		
		
	}

}
