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

		long startTime = System.currentTimeMillis();

		for (Employe employee : employees) {
			System.out.println(employee);
		}
		long stopTime = System.currentTimeMillis();

		long elapsedTime = stopTime - startTime;
		System.out.println("Time Taken by For each loop is : " + elapsedTime);

		startTime = System.currentTimeMillis();

		for (java.util.Iterator<Employe> it = employees.iterator(); it.hasNext();) {
			System.out.println("Employee  :" + it.next());
		}

		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Time Taken by Iterator is : " + elapsedTime);
	}

}