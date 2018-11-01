package NewAssignment3;

import java.util.Scanner;

public class QuipDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to Quip!");
		Scanner scan = new Scanner(System.in); // create scanner object
		
		// Ask for username and password
		System.out.println("Enter Username:");
		String username = scan.nextLine();
		System.out.println("Enter Password:");
		String password = scan.nextLine();
		
		String userType;
		boolean validates;
		
		/*
		 * In this test case, there are 2 users in the system.
		 * Super user -> username: admin & password: 1234
		 * Normal user -> username: user & password: 4321
		 */
		if(username.equals("admin") && password.equals("1234")) {
			System.out.println("Welcome admin. You can view all datas.");
			userType = "admin";
			validates = true;
		}
		else if(username.equals("user") && password.equals("4321")) {
			System.out.println("Welcome user. You can only view your data.");
			userType = "user";
			validates = true;
		}
		else {
			System.out.println("Sorry, error username or password! Please try again."); 
			userType = null;
			validates = false;
		}
		
		// initiate option with value 
		int option = 9; 
		while (option != 0 && validates == true) {
			// show options to user, input 0 then exit
			System.out.println("\nPlease Enter your option:\n1 -> HR System\n2 -> Account System\n0 -> Exit");
			option = scan.nextInt(); // sacn the input
			
			if(option == 1) {
				// user to choose options
				System.out.println("Please enter your option:\na. View Employee Information\nb. View Department Information\nc. View Salary Intormation");
				
				Scanner scan2 = new Scanner(System.in);
				String hrOption = scan2.nextLine();
				
				System.out.println("===============================");
				HumanResourceFactory hrFactory = new HumanResourceFactory();
				if(hrOption.equals("a")) {
					System.out.println("Employee Information\n");
					Employee(hrFactory, userType);
				}
				else if(hrOption.equals("b")) {
					System.out.println("Department Information\n");
					Department(hrFactory, userType);
				}
				else if(hrOption.equals("c")){
					System.out.println("Salary Information\n");
					Salary(hrFactory, userType);
				}
				else 
					System.out.println("Invalid input.");
				
				System.out.println("===============================");
			}
			else if(option == 0) {
				System.out.println("Bye!");
			}
		}
	}
	
	
	// The employee method
	public static void Employee(HumanResourceFactory hrFactory, String userType) {
		// create employee object
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("EMPLOYEE", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
					100000, "Computer Science");	
			employee1.showInfo();
			
			System.out.println();
			
			HumanResource employee2 = hrFactory.getInfo("EMPLOYEE", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("EMPLOYEE", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
	}
	
	// The employee method
	public static void Department(HumanResourceFactory hrFactory, String userType) {
		// create department objec
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("DEPARTMENT", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
					100000, "Computer Science");	
			employee1.showInfo();
			
			System.out.println();
			
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
	}
	
	// The employee method
	public static void Salary(HumanResourceFactory hrFactory, String userType) {
		// create salary object
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("DEPARTMENT", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
					100000, "Computer Science");	
			employee1.showInfo();
			
			System.out.println();
			
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT", "Yeng", "Sun", "222-22-2222", "618-618-618", "Software Developer",
					80000, "Computer Information System");	
			employee2.showInfo();
		}
	}
}
