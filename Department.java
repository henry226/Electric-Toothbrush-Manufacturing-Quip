package Assigment3;

public class Department implements HumanResource{
	private String firstName;
	private String lastName;
	private String title;
	private String department;
	
	// Consturctor
	public Department(String firstName, String lastName, String title, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.department = department;
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
	
	// return title
	public String getTitle() {
		return title;
	}
	
	// set title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// return department
	public String getDepartment() {
		return department;
	}
	
	// set department
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// show department information
	@Override
	public void showInfo() {
		System.out.println("Inside department class");
	}
}
