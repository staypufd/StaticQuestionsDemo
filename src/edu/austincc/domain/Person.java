/**
 * 
 */
package edu.austincc.domain;

import java.util.ArrayList;

/**
 * @author javauser
 *
 */
public class Person {

	// Class variable
	static ArrayList<Person> allPeople = new ArrayList<Person>();
	
	// Instance variables
	String name;
	int age;
	
	
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		allPeople.add(this);
	}

	public static int numPeople()
	{
		return allPeople.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person sally = new Person("Sally", 23);
		Person bob = new Person("Bob", 32);
		Person omar = new Person("Omar", 45);
		Person random = new Person(args[0], new Integer(args[1]).intValue());
		
		System.out.println(Person.numPeople());
		System.out.println(sally.age);
		System.out.println(allPeople);
		// allPeople.remove(bob);
		allPeople.remove(1);
		System.out.println(allPeople);
		System.out.println(Person.numPeople());
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=")
				.append(age).append("]");
		return builder.toString();
	}

	
	
}
