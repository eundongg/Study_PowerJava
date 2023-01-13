
public class CalTwoInteger {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x+y = "+ (x+y));
		System.out.println("x-y = "+ (x-y));
		System.out.println("x*y = "+(x*y));
		System.out.println("average = "+ (double)(x+y)/2);
		int max = (x>y) ? x:y;
		int min = (x>y) ? y:x;
		System.out.println("max = " + max);
		System.out.println("min = "+min);
	}

}
