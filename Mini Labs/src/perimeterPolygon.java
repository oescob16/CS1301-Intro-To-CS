import java.util.Scanner;

public class perimeterPolygon{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double numberEdges = scnr.nextDouble();
	double edgesLentgth = scnr.nextDouble();
	double perimeter;
	
	perimeter = numberEdges * edgesLentgth;
	
	System.out.print("The perimeter your polygon is " + perimeter);
	}
}