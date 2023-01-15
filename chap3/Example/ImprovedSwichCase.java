import java.util.Scanner;

public class ImprovedSwichCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("what day? : ");
		String day = sc.next();
		String today = "";
		
		switch(day) {
		case "SAT", "SUN" -> today = "WEEKEND";
		case "MON", "TUE", "WED", "THU", "FRI" -> today = "WEEKDAYS";
		default -> System.out.println("Error");
		}
		System.out.println(today);
	}

}
