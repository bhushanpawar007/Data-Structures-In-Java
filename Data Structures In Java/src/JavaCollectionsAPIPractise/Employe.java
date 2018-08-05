package JavaCollectionsAPIPractise;

public class Employe {

	private String Name;
	private int grade;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getGrade() {
		return grade;
	}

	public Employe(String name, int grade) {
		super();
		Name = name;
		this.grade = grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employe [Name=" + Name + ", grade=" + grade + "]";
	}
}
