import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		String[] str = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("insert integer : ");
		int num = sc.nextInt();
		System.out.print(str[num-1]);

	}

}
