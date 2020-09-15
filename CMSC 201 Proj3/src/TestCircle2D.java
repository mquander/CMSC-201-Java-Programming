
public class TestCircle2D {
	
	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(4, 4, 11);
		System.out.printf("c1 area: %.2f\n", c1.getArea());
		System.out.printf("c1 perimeter: %.2f\n", c1.getPerimeter());
		System.out.println("Point (3, 3) inside c1: " + c1.contains(1.5, 1.5));
		System.out.println("Circle(4, 5, 10.5) contains c1: " + c1.contains(new Circle2D(2, 2.5, 5.25)));
		System.out.println("Circle(3, 5, 2.3) overlaps c1: " + c1.overlaps(new Circle2D(1.5, 2.5, 1.15))); 

	}

}
