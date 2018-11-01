package NewAssignment3;

public class HumanResourceFactory {
	
	// use getInfo method to get object of type HumnanResource
	public HumanResource getInfo(String type, String firstName, String lastName, String socialSecurityNumber, String phoneNumber, String title,
			int salary, String department) {
		// return objects depends on type
		if(type.equalsIgnoreCase("EMPLOYEE")) {
			return new Employee(firstName, lastName, socialSecurityNumber, phoneNumber, title);
		}
		else if(type.equalsIgnoreCase("SALARY")) {
			return new Salary(firstName, lastName, socialSecurityNumber, salary);
		}
		else if(type.equalsIgnoreCase("DEPARTMENT")) {
			return new Department(firstName, lastName, title, department);
		}
		
		return null;
	}
}
