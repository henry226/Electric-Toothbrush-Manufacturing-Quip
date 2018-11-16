package NewAssignment3;

public class HumanResourceFactory extends AbstractFactory{

	HumanResource getInfo(String Type) {
		
		if(Type.equalsIgnoreCase("EMPLOYEE1")) 
			return new Employee("MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager");
		
		if(Type.equalsIgnoreCase("EMPLOYEE2")) 
			return new Employee("Yeng", "Sun", "222-22-2222", "618-618-618", "Marketing Manager");
		
		if(Type.equalsIgnoreCase("DEPARTMENT1")) 
			return new Department("MengTse", "Li", "Software Manager", "Computer Science");
			
		if(Type.equalsIgnoreCase("DEPARTMENT2")) 
			return new Department("Yeng", "Sun", "Marketing Manager", "Marketing");
		
		if(Type.equalsIgnoreCase("SALARY1")) 
			return new Salary("MengTse", "Li", "111-11-1111", 100000);
		
		if(Type.equalsIgnoreCase("SALARY2")) 
			return new Salary("Yeng", "Sun", "222-22-2222", 90000);
			
		return null;
	}

	@Override
	Marketing getProduct(String Type) {
		return null;
	}

}
