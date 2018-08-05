package JavaCollectionsAPIPractise;

import java.util.ArrayList;

public class ExampleArralyList {

	public static void main(String[] args) {
		ArrayList<Employe> employees = new ArrayList<>();

		Employe e = new Employe("Bhushan", 4);
		Employe e1 = new Employe("Divyesh", 4);
		Employe e2 = new Employe("Tanay", 4);

		employees.add(e);
		employees.add(e1);
		employees.add(e2);

		for (Employe employee : employees) {
			System.out.println(employee);
		}
	}
}