package Assigment3;

import java.util.Scanner;

public class QuipDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to Quip!");
		Scanner scan = new Scanner(System.in); // create scanner object
		
		int option = 9; 
		while (option != 0) {
			System.out.println("\nPlease Enter your option:\n1 -> HR System\n2 -> Account System\n0 -> Exit");
			option = scan.nextInt();
		}
	}

}
