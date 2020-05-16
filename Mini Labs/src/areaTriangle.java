import java.util.Scanner;

public class areaTriangle{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double baseLength = scnr.nextDouble();
	double heigth = scnr.nextDouble();
	double areaTriangle;
	
	areaTriangle = (baseLength * heigth) / 2;
	System.out.print("The area of your triangle is " + areaTriangle);
	}
}