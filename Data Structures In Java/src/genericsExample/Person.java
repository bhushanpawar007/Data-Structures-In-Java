package genericsExample;

public class Person {

	private String Name;
	private int Employeeid;
	
	
	public Person(String name, int employeeid) {
		super();
		Name = name;
		Employeeid = employeeid;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getEmployeeid() {
		return Employeeid;
	}


	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}


	@Override
	public String toString() {
		return "Person with name " + Name + " has Employee Id " +Employeeid;
	}
}
