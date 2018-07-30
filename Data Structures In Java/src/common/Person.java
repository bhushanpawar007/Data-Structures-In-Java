package common;

public class Person {

	private int id;

	public Person(int id, String firstName, String lastName, boolean isAdult) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.isAdult = isAdult;
	}

	private String FirstName;
	private String LastName;
	private boolean isAdult;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public boolean isAdult() {
		return isAdult;
	}

	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

}
