import java.util.*;
public class areaandperimeterofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        scanner.close();
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
	}

}
