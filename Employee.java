package Assigment3;

// Employee class implements HumanResource
public class Employee implements HumanResource{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private String phoneNumber;
	private String title;
	
	// constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, String phoneNumber, String title) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.phoneNumber = phoneNumber;
		this.title = title;
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

	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// set social security number
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// return phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// set last phone number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// return title
	public String getTitle() {
		return title;
	}
	
	// set title
	public void setTitle(String title) {
		this.title = title;
	}

	// show employee information
	@Override
	public void showInfo() {
		System.out.printf("Name: %s %s%nTitle: %s%nSocial security number: %s%nPhone Number: %s%n", getFirstName(), getLastName(), 
				getTitle(), getSocialSecurityNumber(), getPhoneNumber());
	}
}
