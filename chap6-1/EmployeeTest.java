class Date {
	private int year, month, date;

	public Date(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
	
}
class Employee3{
	private String name;
	private Date birthDate;
	
	public Employee3(String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", birthDate=" + birthDate + "]";
	}	
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Date birth = new Date(1990, 1, 1);
		Employee3 employee = new Employee3("아무개", birth);
		System.out.println(employee);
	}

}
