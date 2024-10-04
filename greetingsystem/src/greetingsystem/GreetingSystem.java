package greetingsystem;

import java.util.Scanner;

public class GreetingSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		
	while(true) {
		System.out.print("Enter your name(or 'exit' to quit): ");
		String name = scanner.nextLine();
		
		if(name.equalsIgnoreCase("exist")) {
			System.out.println("Goodbye!");
			return;
		}
		System.out.println("Hello," + name + "!");
		System.out.println("Would you like to enter another name? (yes/no)");
		String response = scanner.nextLine();
		
		if (response.equalsIgnoreCase("no")) {
			System.out.println("Goodbye!");
			return;
		}
	}
	}

}
