/*
 * Class: CMSC201 
 * Instructor: 
 * Description: Program that creates circle and tests certain characteristics of it
 * Due: 06/30/2019
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: MQuander
*/

import java.lang.Math;
public class Circle2D {
	// Data fields x and y of type double
    private double x, y, a, b, radius, radius2;
    
    // Get method for radius
    public double getRadius() {
    	return radius;
    }
    // No argument constructor that creates a circle 
    public Circle2D() {
    	x = 0;
    	y = 0;
    	radius = 1;
    }
    // Constructor to create circle with x, y, radius
    public Circle2D(double x, double y, double radius) {
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    }
    // Get method to return area
    public double getArea() {
    	return Math.PI * radius * radius;
    }
    // Get method to return perimeter
    public double getPerimeter() {
    	return 2 * Math.PI * radius;
    }
    // Method to test if a point is in the circle, use distance formula
    public boolean contains(double a, double b) {
    	
    	boolean pointInCircle;
    	
    	if ((x - a)*(x - a)+(y - b)*(y - b) < radius * radius)
    		pointInCircle = true;
    	
    	else
    		pointInCircle = false;
    	
    	return pointInCircle;
    }
    // Method to test if circle is within this circle, calculate distance between center points
    // and check if it's less than the difference in radii
    public boolean contains(Circle2D circle) {
    	
    	boolean circleInCircle;
    	
    	if (Math.sqrt(Math.pow((x-a), 2) + Math.pow((y-b), 2)) < (radius2 - radius))
    		circleInCircle = true;
    	
    	else
    		circleInCircle = false;
    	
    	return circleInCircle;
    }
    // Method to test if circle overlaps circle, calculate distance between center points
    // and check whether it's greater or lesser than sum of the radii
    public boolean overlaps(Circle2D circle) {
    	
    	boolean circleOverlaps;
    	
    	if(Math.sqrt(Math.pow((x-a), 2) + Math.pow((y-b), 2)) < radius + radius2)
    		circleOverlaps = true;
    	
    	else
    		circleOverlaps = false;
    	
    	return circleOverlaps;
    }

	}



