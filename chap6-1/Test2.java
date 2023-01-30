class Employee2{
	public int baseSalary = 3000000;
	int getSalary() {
		return baseSalary;
	}
}
class Manager extends Employee2{

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return baseSalary+2000000;
	}
	
}
class Programmer extends Employee2{

	@Override
	int getSalary() {
		// TODO Auto-generated method stub
		return baseSalary+3000000;
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : "+ manager.getSalary());
		
		Programmer pro = new Programmer();
		System.out.println("프로그래머의 월급 : "+ pro.getSalary());

	}

}
