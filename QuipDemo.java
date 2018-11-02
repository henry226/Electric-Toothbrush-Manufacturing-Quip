package NewAssignment3;

import java.util.Scanner;

public class QuipDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to Quip!");
		
		// initiate option with value 
		String option = ""; 
		String password = "";
		String username ="";
		boolean validates = false;
		while (!option.equals("0")) {
			Scanner scan = new Scanner(System.in); // create scanner object
			
			if(validates == false) {
				// Ask for username and password
				System.out.println("Enter Username:");
				username = scan.nextLine();
				System.out.println("Enter Password:");
				password = scan.nextLine();
			}
			
			String userType;
			
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
				userType = null;
				validates = false;
			}

			HumanResourceFactory hrFactory = new HumanResourceFactory();
			// user to choose options
			System.out.println("Please enter your option:\n1 -> Employee Information\n2 -> Department Information\n3 -> Salary Intormation\n4 -> "
					+ "User Account\n5 -> Log out\n0 -> Exit");
			
			Scanner scan2 = new Scanner(System.in);
			option = scan2.nextLine();
			
			if(validates == true) {
				System.out.println("===============================");
				if(option.equals("1")) {
					System.out.println("Employee Information\n");
					Employee(hrFactory, userType);
				}
				else if(option.equals("2")) {
					System.out.println("Department Information\n");
					Department(hrFactory, userType);
				}
				else if(option.equals("3")){
					System.out.println("Salary Information\n");
					Salary(hrFactory, userType);
				}
				else if(option.equals("4")) {
					System.out.println("Account Status\n");
					
					AccountSingleton originalAccount = AccountSingleton.getInstance();
					System.out.println("The initial account status:\nPayable? " 
							+ originalAccount.payable + "\nReceivable? " + originalAccount.receivable);
					Account(userType);
				}
				else if(option.equals("5")) {
					username = "";
					password = "";
					validates = false;
					System.out.println("Log out successfully");
				}
				// Exit program
				else if(option.equals("0")) {
					System.out.println("Bye!");
				}
				else 
					System.out.println("Invalid input.");
			}
			System.out.println("===============================\n");
			
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
	
	// The department method
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
	
	// The Salary method
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
	
	// The account method
	public static void Account(String userType) {
		Scanner scan3 = new Scanner(System.in); // create scanner object
		
		if(userType.equals("admin")) {
			System.out.println("\nChange Status? (Y/N)");
			String choice = scan3.nextLine();
			AccountSingleton adminAccount = AccountSingleton.getInstance();
			
			// if admin want to change status, admin has the authority to change everything
			if(choice.equalsIgnoreCase("Y")) {
				// Change everything to Yes
				adminAccount.payable = "YES";
				adminAccount.receivable = "YES";
				
				System.out.println("\nModified account status:\nPayable? " + adminAccount.payable + "\nReceivable? " + adminAccount.receivable);
			}
			else 
				System.out.println("\nAccount status:\nPayable? " + adminAccount.payable + "\nReceivable? " + adminAccount.receivable);
		}
		else if(userType.equals("user")) {
			System.out.println("\nChange Status? (Y/N)");
			String choice = scan3.nextLine();
			AccountSingleton userAccount = AccountSingleton.getInstance();
			
			// if admin want to change status, admin has the authority to change everything
			if(choice.equalsIgnoreCase("Y")) {
				// Can only change Receivable
				userAccount.receivable = "YES";
				
				System.out.println("\nModified account status:\nPayable? " + userAccount.payable + "\nReceivable? " + userAccount.receivable);
			}
			else 
				System.out.println("\nAccount status:\nPayable? " + userAccount.payable + "\nReceivable? " + userAccount.receivable);
		}
	}
}
