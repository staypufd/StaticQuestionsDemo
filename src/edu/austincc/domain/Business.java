/**
 * 
 */
package edu.austincc.domain;

/**
 * @author javauser
 *
 */
public class Business extends Person {

	
	public static void main(String[] args) {
		
		System.out.println(Person.allPeople);
		
		Business b1 = new Business();
		Business b2 = new Business();
		
		Person p1 = new Person("Sam", 47);
		
		System.out.println(numPeople());
		System.out.println(Person.allPeople);
		
		Car myCar = new Car();
		
	}
}
