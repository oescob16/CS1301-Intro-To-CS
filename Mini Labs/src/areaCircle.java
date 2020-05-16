import java.util.Scanner;

public class areaCircle{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double radius = scnr.nextDouble();
	double pi = 3.1416;
	double areaCircle;
	
	areaCircle = (pi) * (radius * radius);
	System.out.print("The area of your circle is " + areaCircle);
	}
}