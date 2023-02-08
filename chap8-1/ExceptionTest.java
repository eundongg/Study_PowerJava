
public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt("ABC");	// 문자열 int형으로 변환 -> NumberFormatException 발생
			System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println("NumberFormat 예외 발생");
		}
	}

}
