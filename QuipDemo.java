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
				System.out.print("Enter Username: ");
				username = scan.nextLine();
				System.out.print("Enter Password: ");
				password = scan.nextLine();
				System.out.println("");
			}
			
			String userType;
			
			 /*
			 * In this test case, there are 2 users in the system.
			 * Super user -> username: admin & password: 1234
			 * Normal user -> username: user & password: 4321
			 */
			
			if(username.equals("admin") && password.equals("1234")) {
				userType = "admin";
				validates = true;
			}
			else if(username.equals("user") && password.equals("4321")) {
				userType = "user";
				validates = true;
			}
			else {
				System.out.println("Not correct user");
				userType = null;
				validates = false;
			}

			AbstractFactory hrFactory = FactoryProducer.getFactory("HUMANRESOURCE");
			AbstractFactory marketFactory = FactoryProducer.getFactory("MARKETING");
	
			if(validates == true) {
				
				System.out.println("Please enter your option: [" + userType + "]\n1 -> Employee Information\n2 -> Department Information\n3 -> Salary Intormation\n4 -> "
						+ "User Account\n5 -> Marketing\n6 -> Log out\n0 -> Exit");
				Scanner scan2 = new Scanner(System.in);
				option = scan2.nextLine();
				
				System.out.println("===============================");
				if(option.equals("1")) {
					System.out.println("Employee Information [" + userType + "]\n");
					Employee(hrFactory, userType);
				}
				else if(option.equals("2")) {
					System.out.println("Department Information [" + userType + "]\n");
					Department(hrFactory, userType);
				}
				else if(option.equals("3")){
					System.out.println("Salary Information [" + userType + "]\n");
					Salary(hrFactory, userType);
				}
				else if(option.equals("4")) {
					System.out.println("Account Status [" + userType + "]\n");
					
					AccountSingleton originalAccount = AccountSingleton.getInstance();
					System.out.println("The initial account status:\nPayable? " 
							+ originalAccount.payable + "\nReceivable? " + originalAccount.receivable);
					Account(userType);
				}
				else if(option.equals("5")) {
					System.out.println("Product Marketing [" + userType + "]\n");
					Marketing(marketFactory, userType);
				}
				else if(option.equals("6")) {
					//username = "";
					//password = "";
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
	public static void Employee(AbstractFactory hrFactory, String userType) {
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("EMPLOYEE1");
			employee1.showInfo();
			System.out.println();
			HumanResource employee2 = hrFactory.getInfo("EMPLOYEE2");
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("EMPLOYEE2");
			employee2.showInfo();
		}
	}
	
	// The department method
	public static void Department(AbstractFactory hrFactory, String userType) {
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("DEPARTMENT1");
			employee1.showInfo();
			System.out.println();
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT2");
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("DEPARTMENT2");
			employee2.showInfo();
		}
	}
	
	// The Salary method
	public static void Salary(AbstractFactory hrFactory, String userType) {
		if(userType.equals("admin")) {
			HumanResource employee1 = hrFactory.getInfo("SALARY1");
			employee1.showInfo();
			System.out.println();
			HumanResource employee2 = hrFactory.getInfo("SALARY2");
			employee2.showInfo();
		}
		else {
			HumanResource employee2 = hrFactory.getInfo("SALARY2");
			employee2.showInfo();
		}
	}
	
	// The marketing method
	public static void Marketing(AbstractFactory marketFactory, String userType) {
		if(userType.equals("admin")) {
			Scanner scan4 = new Scanner(System.in); // create scanner object
			System.out.println("Change Status? (Y/N)");
			String choice = scan4.next();
			if(choice.equalsIgnoreCase("Y")) {
				System.out.println("New toothbrush price: ");
				int toothbrush = scan4.nextInt();
				System.out.println("New accessories price: ");
				int accessories = scan4.nextInt();
				System.out.println("New other products price: ");
				int others = scan4.nextInt();
				Marketing market1 = marketFactory.changeProduct("TOOTHBRUSH", toothbrush);
				market1.makeProduct();
				Marketing market2 = marketFactory.changeProduct("ACCESSORIES", accessories);
				market2.makeProduct();
				Marketing market3 = marketFactory.changeProduct("OTHERS", others);
				market3.makeProduct();
			}
			else {
				printMarket(marketFactory);
			}
			
		}
		else {
			printMarket(marketFactory);
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
	
	// Output Marketing Vaules
	public static void printMarket(AbstractFactory marketFactory) {
		Marketing market1 = marketFactory.getProduct("TOOTHBRUSH");
		market1.makeProduct();
		System.out.println();
		Marketing market2 = marketFactory.getProduct("ACCESSORIES");
		market2.makeProduct();
		System.out.println();
		Marketing market3 = marketFactory.getProduct("OTHERS");
		market3.makeProduct();
	}
}
