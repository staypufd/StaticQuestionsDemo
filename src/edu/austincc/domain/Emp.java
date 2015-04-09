package edu.austincc.domain;

public class Emp {
	// class variables
	static private int bankVault;
	
	// Instance variables
	String name;

	// Constructors
	
	//----------------------------------
	
	// Class Methods
	static int getBankVault() {
		return bankVault;
	}

	
	// Util Methods
	// toString, etc
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [name=").append(name).append("]");
		return builder.toString();
	}

	
	
	// Main method
	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		System.out.println(Emp.bankVault);
		
		emp1.bankVault = 10;
		System.out.println(emp1.bankVault);
		System.out.println(Emp.bankVault);
		
		emp2.bankVault = 20;
		
		System.out.println(emp1.bankVault);
		System.out.println(emp2.bankVault);
		System.out.println(Emp.bankVault);
		

	}


	
}
