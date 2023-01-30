class Human{
	String name;

	public Human() {	}

	public Human(String theName) {
		this.name = theName;
	}
	
}
class Em_Human extends Human{
	String id;

	public Em_Human() {
		super();
	}

	public Em_Human(String name) {
		super(name);
	}

	public Em_Human(String name, String id) {
		super(name);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Em_Human [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Employee {

	public static void main(String[] args) {
		Em_Human e = new Em_Human("Kim", "1234");
		System.out.println(e);
		
	}

}
