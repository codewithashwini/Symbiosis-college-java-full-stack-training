package abstractclass;

abstract class GeometricShapes {
	String nameOfShape;
	//abstract methods
	abstract double calculateArea();
	public abstract String toString();
	//constructor
	public GeometricShapes(	String nameOfShape) {
		System.out.println("Inside the Constructor of GeometricShapes class ");
		this.nameOfShape=nameOfShape;
		
	}
	//non abstract methods
	public String getNameOfShape() {
		return nameOfShape;
	}
}

class Circle extends GeometricShapes{
	double radius;
	public Circle(String nameOfShape,double radius) {
		super(nameOfShape);
		System.out.println("Inside the constrcuctor of the cicle class");
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	//implementing the methods
	@Override
	double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the shape  is "+ super.nameOfShape + "and its area is:" + calculateArea();
	}
	
}

class Square extends GeometricShapes{
	double length;
	public Square(String nameOfShape,double length) {
		super(nameOfShape);
		// TODO Auto-generated constructor stub
		System.out.println("Inside the Constrcutor of square class");
		this.length=length;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length*length;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the Shape is " + super.nameOfShape + "and its area is:"+ calculateArea();
	}
	
	
}

public class abstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricShapes shapeObject1 = new Circle("Circle", 5);
		System.out.println(shapeObject1.toString());
		GeometricShapes shapeObject2 = new Square("Rectangle", 8);
		System.out.println(shapeObject2.toString());
	}

}
