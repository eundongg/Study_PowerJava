import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("출력할 항의 개수: ");
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		
		int[] arr = new int[num];
		arr[0]= 0; 
		arr[1]= 1;
		
		for(int i = 2;i<num;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
