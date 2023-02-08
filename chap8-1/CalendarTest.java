import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+1+"월");
		System.out.println(c.get(Calendar.DATE)+"일");
		
		c.set(Calendar.HOUR, 12);
		c.set(Calendar.MINUTE, 34);
		c.set(Calendar.SECOND, 0);
		System.out.println(c);
		
	}

}
