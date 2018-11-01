package Assigment3;

public class HumanResourceFactory {
	
	// use getInfo method to get object of type HumnanResource
	public HumanResource getInfo(String type) {
		// return objects depends on type
		if(type.equalsIgnoreCase("EMPLOYEE")) {
			return new Employee();
		}
		else if(type.equalsIgnoreCase("SALARY")) {
			return new Salary();
		}
		else if(type.equalsIgnoreCase("DEPARTMENT")) {
			return new Department();
		}
		
		return null;
	}
}
