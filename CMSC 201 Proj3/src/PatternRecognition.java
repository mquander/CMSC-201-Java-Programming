/*
 * Class: CMSC201 
 * Instructor:
 * Description: Program to test for 4 consecutive numbers
 * Due: 06/30/2019
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MQuander
*/

import java.util.Scanner;

public class PatternRecognition {
	static int[][] list;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int r = input.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int c = input.nextInt();
		
		list = new int[r][c];
		
		System.out.println("Now enter integer numbers for the list: ");
		
		// Fill the 2D array with user input
		for(int x = 0; x < list.length; x++) {
			for(int y = 0; y < list[0].length; y++) {
				list[x][y] = input.nextInt();
			}
		}
		input.close();
		// Display the 2D array
		for(int row = 0; row < list.length; row++) {
			for(int col = 0; col < list[row].length; col++) {
				System.out.print(list[row][col] + " ");
			}
			System.out.println();
		}
		isConsecutiveFour(list);
		
	}
	
	public static boolean isConsecutiveFour(int array[][]) {
		boolean match;
		
		if(columnMatch(list) || (rowMatch(list)) || (crossMatch(list))) {
			System.out.println("true");
			match = true;
		}
		else {
			System.out.println("false");
			match = false;
		}
		return match;
	}
			
	// Method to test if there are 4 vertical consecutive numbers
	public static boolean columnMatch(int array[][]) {
		boolean match = false;
		
		for(int a = 0; a < array[0].length; a++) {
			int first = array[0][a];
			int number = 1;
			
			for(int b = 1; b < array.length; b++) {
				if(first == array[b][a]) {
					number++;
				}
				else {
					first = array[b][a];
					number = 1;
				}
				if(number == 4) {
					match = true;
				}
			}
		}
		return match;
		
	}
	// Method to test if there are 4 horizontal consecutive numbers
	public static boolean rowMatch(int array[][]) {
		boolean match = false;
		
		for(int a = 0; a < array.length; a++) {
			int first = array[a][0];
			int number = 1;
			
			for(int b = 1; b < array[a].length; b++) {
				if(first == array[a][b]) {
					number++;
				}
				else {
					first = array[a][b];
					number = 1;
				}
				if(number == 4) {
					match = true;
				}
				
			}
		}
		return match;
	}
	// Method to test for diagonal consecutive numbers 
	public static boolean crossMatch(int[][] array) {
		boolean match1 = false, match2 = false, match3 = false;
		int first;
		int number;
		
		// For loop compares values diagonally starting with the 1st element of each row
		for(int a = 0; a < array.length; a++) {
			first = array[a][0];
			number = 1;
			
			for(int b = a + 1, c = 1; b < array.length && c < array[0].length; b++, c++) {
				if(first == array[b][c]) {
					number++;
				}
				else {
					first = array[b][c];
					number = 1;
				}
				if(number == 4) {
					match1 = true;
				}
			} 
		}
		// For loop compares values diagonally starting with each element in each row
		for (int a = 0; a < array[0].length; a++) {
			   first = array[0][a];
			   number = 1;
			   
			   for (int b = a + 1, c = 1; b < array[0].length && c < array.length; b++, c++) {
				   if (first == array[c][b]) {
			    	number++;
				   }
				   else {
					   first = array[c][b];
					   number = 1;
				   }
			 
				   if (number == 4) {
			    	match2 = true;
				   }
			   }
		}
		// For loop compares values diagonally starting with the top right corner		
		for (int a = 0; a < array.length; a++) {
			first = array[a][array[a].length-1];
			number = 1;
			
			for (int b = a + 1, c = array[0].length-2; b < array.length && c >= 0; b++, c--) {
				if (first == array[b][c]) {
					number++;
				}
				else {
					first = array[b][c];
					number = 1;
				}
				if(number == 4) {
					match3 = true;
				}
			}
		}
		return (match1 || match2 || match3);		
	}
}
