package NewAssignment3;

public class Salary implements HumanResource{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private int salary;
	
	// Consturctor	
	public Salary(String firstName, String lastName, String socialSecurityNumber, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}
	
	// return first name
	public String getFirstName() {
		return firstName;
	}

	// set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// return last name
	public String getLastName() {
		return lastName;
	}

	// set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// return ssn
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// set ssn
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// return salary
	public int getSalary() {
		return salary;
	}

	// set salary
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// show salary information
	@Override
	public void showInfo() {
		System.out.printf("Name: %s %s%nSocial security number: %s%nSalary: %d%n", getFirstName(), getLastName(), 
				getSocialSecurityNumber(), getSalary());
	}
}
