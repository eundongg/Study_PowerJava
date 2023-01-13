import java.util.Scanner;

public class Bool {

	public static void main(String[] args) {
		System.out.println("P\tQ\tAND\tOR\tXOR");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			boolean p = sc.nextBoolean();
			boolean q = sc.nextBoolean();
			System.out.print(p+"\t"+q+"\t");
			System.out.println((p&q)+"\t"+(p|q)+"\t"+(p^q));
		}		

	}

}
