package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		Person person1 = new Person(1, "Julio Amorim", "julio.l.amorim@icloud.com");
		Person person2 = new Person(2, "Name two", "Email two");
		Person person3 = new Person(3, "Name three", "Email three");

		System.out.println(person1 + "\n" + person2 + "\n" + person3);
	}

}
