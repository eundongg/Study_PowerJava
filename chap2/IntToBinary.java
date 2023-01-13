import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert num : ");
		int num = sc.nextInt();
		
		//Integer.toBinaryString() 함수를 통해서 쉽게 변환 가능
		String binaryString = Integer.toBinaryString(num);
		System.out.println(num+" : "+binaryString );

	}

}
