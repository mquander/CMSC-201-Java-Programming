/*
 * Instructor: 
 * Description: Program to calculate mean and standard deviation
 * Due: 6/16/2019
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MQuander
*/

import java.util.Scanner;

public class MeanSumSD {
	// Declare static variables to use as arguments when calling methods from main
	static double sum;
	static double num[] = new double[10];
	static double mean;
	static double sd;

	public static void main(String[] args) {
		// Display the title
		System.out.println("Calculating Mean and Standard Deviation");
		System.out.println("---------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");	
		
		// get user input for 10 numbers into an array
		for(int i = 0; i < 10; i++) {
			
			num[i] = input.nextDouble();
		
		}
		input.close(); //Close scanner
		
		// Call the methods to calculate sum, mean and standard deviation
		sum = calcSum(num);
		mean = calcMean(sum);
		sd = calcSD(num, mean);
		
		System.out.printf("The sum is %.2f\n", sum);	
		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.2f\n", sd);
		System.out.println("Programmer: MQuander\nDate: 06/16/2019");
		
	
		}
	public static double calcSum(double num1[]) {
		// Calculate the sum		
		for(int i = 0; i < 10; i++) {
			sum += num[i];
		}
		return sum;
		
	}
	public static double calcMean(double sum1) {
		// Calculate the mean					
		return sum1/10;
	}
	public static double calcSD(double num[], double mean) {
		// Calculate the standard deviation
			
		for (int i = 0; i < 10; i++) {
			sd += ((num[i] - mean)*(num[i] - mean)/10);
		}			
		return Math.sqrt(sd);
	}
		
}
	
