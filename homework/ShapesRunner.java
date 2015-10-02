// GetHIP - Fall 2015
// Assignment 2 - "Shapes"
// Instructors - Zach Merrill <zach_merrill@gallup.com>
//               James Getrost <james_getrost@gallup.com>

// use java.util package to access list collection
import java.util.*;

public class ShapesRunner{
	
	public static void main(String [] args){
		// create list of shapes
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(6));
		shapes.add(new Triangle(6, 4));
		shapes.add(new Rectangle(8, 3));
		shapes.add(new Rhombus(6, 5));
		shapes.add(new Trapezoid(4, 10, 5));

		// loop through each shape in shapes
		for(Shape s : shapes){
			System.out.println("Calculating " + s.getShapeName() + " area:");
			System.out.println("Area = " + s.getArea());
			System.out.println("Printing " + s.getShapeName() + " description:");
			s.printDescription();
		}
	}

}
