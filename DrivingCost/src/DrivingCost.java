/*
 * Class: CMSC201 
 * Instructor: 
 * Description: calculating the cost of driving
 * Due: 06/02/2019 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MQuander
*/
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		// Display the program header
		System.out.println("\n\tCost of Driving Program");
		System.out.println("--------------------------------------");
		
		// Prompt user to enter the distance of their trip
		System.out.print("Enter the distance of your planned trip: ");
		Scanner userInput = new Scanner(System.in); // Create object from Scanner for user input
		double distance = userInput.nextDouble();
		
		// Test that distance is greater than 0, if not display error and prompt re-entry
		while(distance < 0) {
			System.out.println("Error: enter a positive distance: ");
			distance = userInput.nextDouble();
		}
		// Prompt user for fuel efficiency for the car
		System.out.print("\nEnter the fuel efficiency of your car in miles per gallon: ");
		double fuelEfficiency = userInput.nextDouble();
		
		// Test that fuel efficiency is positive, if not display error and prompt re-entry
		while (fuelEfficiency < 0) {
			System.out.println("Error: the fuel efficiency cannot be negative, re-enter: ");
			fuelEfficiency = userInput.nextDouble();
		}
		// Prompt user for the price of gas per gallon
		System.out.print("\nEnter the price per gallon: ");
		double pricePerGallon = userInput.nextDouble();
		
		// Test that price per gallon is positive, if not display error and prompt re-entry
		while(pricePerGallon < 0) {
			System.out.println("Error: price per gallon cannot be negative, re-enter: ");
			pricePerGallon = userInput.nextDouble();
		}
		
		// Calculate the cost of the trip
		double tripCost = (distance/fuelEfficiency) * pricePerGallon;
		
		// Display the cost of the trip
		System.out.printf("\nThe total cost of the trip will be: $%5.2f", tripCost);
		System.out.println("\nProgram Author: MQuander");
		
		// Close the Scanner
		userInput.close();
	}
	

}
