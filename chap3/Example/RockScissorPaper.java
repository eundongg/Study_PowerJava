import java.util.Scanner;

public class RockScissorPaper {
	
	final int SCISSOR =0;
	final int ROCK =1;
	final int PAPER =2;
	//0은 1한테 지고, 1은 2한테 지고, 2는 0한테 진다
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose One of three choices");
		System.out.print("ROCK(1), SCISSOR(0), PAPER(2) : ");
		int user =sc.nextInt();
		
		int computer = (int)(Math.random()*3);
		if(user == computer) System.out.println("it's a tie");
		else if(user == (computer+1)%3) {
			System.out.println("user : "+user +" computer : "+computer +" ==> user win");
		}
		else {
			System.out.println("user : "+user +" computer : "+computer+" ==> computer win");
		}
		

	}

}
