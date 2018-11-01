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
				// create employee object
				HumanResource employee = hrFactory.getInfo("EMPLOYEE");
				employee.showInfo();
				// create department object
				HumanResource department = hrFactory.getInfo("DEPARTMENT");
				employee.showInfo();
				// create salary object
				HumanResource salary = hrFactory.getInfo("SALARY");
				employee.showInfo();
			}
		}
	}

}
