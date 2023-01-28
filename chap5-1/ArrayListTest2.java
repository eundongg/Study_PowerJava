import java.util.ArrayList;

class Person{
	String name;
	String tel;
	public Person(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
}

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", "0101233"));
		list.add(new Person("김유신", "0101234"));
		list.add(new Person("최자영", "0101235"));
		list.add(new Person("김영희", "0101236"));
		
		for(Person obj : list) {
			System.out.println("("+obj.name+","+obj.tel+")");
		}

	}

}
