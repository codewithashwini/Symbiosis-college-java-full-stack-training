import java.util.*;
public class area_circum_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        double area = calculateArea(radius);
	        double circumference = calculateCircumference(radius);

	        System.out.println("Area of the circle: " + area);
	        System.out.println("Circumference of the circle: " + circumference);

	        scanner.close();
	    }

	    public static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public static double calculateCircumference(double radius) {
	        return 2 * Math.PI * radius;
	}

}
