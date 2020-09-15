/*
 * Class: CMSC201 
 * Instructor: 
 * Description: Program to gather and display Student or Employee data
 * Due: 07/21/2019
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MQuander
*/

import java.util.Scanner;
import java.io.IOException;
import java.text.NumberFormat;

// create super class Person
 class Person {
	// attributes for Person
	private String name, address, phoneNumber, emailAddress;
	
	// constructor for Person class
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;	
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	// getter and setter methods
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
}
// create subclass Student
class Student extends Person{
	// Student attribute
	final String status; 
	
	// constructor for Student attributes
	public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
		super (name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	// toString method to display attributes and methods	
	public String toString() {
		
		return "\nName: " + getName() + "\nStatus: " + status + "\nAddress: " + getAddress() + "\nPhone Number: " + 
				getPhoneNumber() + "\nEmail Address: " + getEmailAddress();
	}
}
// create class MyDate
class MyDate {
		// MyDate attribute
	   private String date; 
	   
	   // MyDate constructor
	   public MyDate(String date){
	       this.date = date;
	   }
	   // getter method
	    public String getDate() {
	       return date;
	   }
}
// create Employee class
class Employee extends Person{
	// Employee attributes
	int officeNumber, salary;
	MyDate dateHired;
	
	// Employee constructor
	public  Employee(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired) {
		super(name, address, phoneNumber, emailAddress);
			this.officeNumber = officeNumber;
			this.salary = salary;
			this.dateHired = dateHired;	
	}
	
}
// create Faculty class
class Faculty extends Employee{
	// Faculty attributes
	private String officeHours, rank;
	
	// Faculty constructor
	public Faculty(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired, String officeHours, String rank) {
		super(name,address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	// toString method to display attributes
	public String toString() {
		
		return "\nName: " + getName() + "\nRank: " + rank + "\nSalary: $" + NumberFormat.getIntegerInstance().format(salary) + "\nDate Hired: " + dateHired.getDate() + 
				"\nOffice hours: " + officeHours + "\nOffice number: " + officeNumber + "\nAddress: " + 
				getAddress() + "\nPhone Number: " + getPhoneNumber() + "\nEmail Address: " + getEmailAddress(); 
	}
}
// create Staff class
class Staff extends Employee{
	// Staff attribute
	private String title;
	
	// Staff constructor
	public Staff(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.title = title;
	}
	// Staff toString method to display attributes
	public String toString() {
		
		return "\nName: " + getName() + "\nTitle: " + title + "\nSalary: $" + NumberFormat.getIntegerInstance().format(salary) + "\nDate Hired :" + dateHired.getDate() +
				"\nOffice number: " + officeNumber  + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() +
				"\nEmail Address: " + getEmailAddress(); 
	}
}
// create Driver class to test program
public class PersonDriver{
	
	// main method to run program, throw Exception
	public static void main(String[] args) throws IOException{
		//prompt user for choice
		System.out.print("Enter 1 for Student, Enter 2 for Employee: "); 
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		while(x != 1 && x != 2) {
			System.out.print("ERROR Only enter 1 or 2: ");
		}
		// switch statement for users choice
		switch(x) {
		
			case 1: createStudent();
				break;
			case 2: createEmployee();
				break;
		}
		input.close();
		
	}
	// method to create a Student object
	public static void createStudent() {
		Scanner studentInput = new Scanner(System.in);
		// prompt user for input to pass to Student constructor to create object		
		System.out.print("\nEnter Student's name: ");
		String name = studentInput.nextLine();
		System.out.print("Enter "+ name + "'s address: ");
		String address = studentInput.nextLine();
		System.out.print("Enter "+ name + "'s phone number: ");
		String phoneNumber = studentInput.nextLine();
		System.out.print("Enter "+ name + "'s email address: ");
		String emailAddress = studentInput.nextLine();
		System.out.print("Enter "+ name + "'s class Status: ");
		String status = studentInput.nextLine();
		Student stu = new Student(name, address, phoneNumber, emailAddress, status);
		System.out.print(stu.toString()); // call toString to display user input
		
		studentInput.close();
	}
	// method to create Employee object
	public static void createEmployee() throws IOException{
		Scanner employeeInput = new Scanner(System.in);
		// prompt user for input to pass to Employee constructor to create object
		System.out.print("\nEnter 1 for Staff, Enter 2 for Faculty: ");
		// validate user input
		int y = employeeInput.nextInt();
		employeeInput.nextLine();
		while(y != 1 && y != 2) {
			System.out.print("ERROR enter 1 or 2: ");
			y = employeeInput.nextInt();
		}
		// switch statement for users choice
		switch(y) {
		case 1: // option if user chooses Staff
			System.out.print("\nEnter Staff member's name: ");
			String name = employeeInput.nextLine();
			System.out.print("Enter " + name + "'s address: ");
			String address = employeeInput.nextLine();
			System.out.print("Enter " + name + "'s phone number: ");
			String phoneNumber = employeeInput.nextLine();
			System.out.print("Enter " + name + "'s email address: ");
			String emailAddress = employeeInput.nextLine();
			System.out.print("Enter " + name + "'s office number: ");
			int officeNumber = employeeInput.nextInt();
			employeeInput.nextLine();
			System.out.print("Enter " + name + "'s salary: ");
			int salary = employeeInput.nextInt(); 
			employeeInput.nextLine();
			System.out.print("Enter " + name + "'s hire date: ");
			String dateHired2 = employeeInput.nextLine();
			MyDate dh = new MyDate(dateHired2);
			System.out.print("Enter " + name + "'s title: ");
			String title = employeeInput.nextLine();
			// create Staff object
			Staff s1 = new Staff(name, address, phoneNumber, emailAddress, officeNumber, salary, dh, title);
			System.out.println(s1.toString()); // display user input
			break;
		case 2: // option if user chooses Faculty
			System.out.print("\nEnter Faculty member's name: ");
			String nameF = employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s address: ");
			String addressF = employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s phone number: ");
			String phoneNumberF = employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s email address: ");
			String emailAddressF = employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s office number: ");
			int officeNumberF = employeeInput.nextInt(); 
			employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s salary: ");
			int salaryF = employeeInput.nextInt(); 
			employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s hire date: ");
			String dateHired2F = employeeInput.nextLine(); 
			MyDate dh2 = new MyDate(dateHired2F);
			System.out.print("Enter " + nameF + "'s office hours: ");
			String officeHoursF = employeeInput.nextLine();
			System.out.print("Enter " + nameF + "'s rank: ");
			String rankF = employeeInput.nextLine();
			// create Faculty object
			Faculty f1 = new Faculty(nameF, addressF, phoneNumberF, emailAddressF, officeNumberF, salaryF, dh2, officeHoursF, rankF);
			System.out.println(f1.toString()); // display user input
			break;
		}
		employeeInput.close();
		
	}
	
}