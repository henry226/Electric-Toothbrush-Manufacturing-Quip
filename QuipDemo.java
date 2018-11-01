package Assigment3;

import java.util.Scanner;

public class QuipDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to Quip!");
		Scanner scan = new Scanner(System.in); // create scanner object
		int option = 9; // initiate option with value 
		
		while (option != 0) {
			// show options to user, input 0 then exit
			System.out.println("\nPlease Enter your option:\n1 -> HR System\n2 -> Account System\n0 -> Exit");
			option = scan.nextInt(); // sacn the input
			if(option == 1) {
				HumanResourceFactory hrFactory = new HumanResourceFactory();
				// String type, String firstName, String lastName, String socialSecurityNumber, int phoneNumber, 
				// String title, int salary, String department
				HumanResource employee1 = hrFactory.getInfo("EMPLOYEE", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
						100000, "Computer Science");	// create employee object
				employee1.showInfo();
				
				// create department objec
				HumanResource employee1Dept = hrFactory.getInfo("DEPARTMENT", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
						100000, "Computer Science"); 
				employee1Dept.showInfo();
				
				// create salary object
				HumanResource employee1Salary = hrFactory.getInfo("SALARY", "MengTse", "Li", "111-11-1111", "617-617-6617", "Software Manager",
						100000, "Computer Science"); 
				employee1Salary.showInfo();
				
			}
		}
	}

}
