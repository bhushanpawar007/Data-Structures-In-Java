package genericsExample;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		Person p1=new Person("Bhushan", 1);
		Person p2=new Person("Bhushan Pawar", 2);
		persons.add(p1);
		persons.add(p2);

		for (Person p : persons) {
			System.out.println(p);
		}

	}

}
