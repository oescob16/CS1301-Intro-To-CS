import java.util.Scanner;

public class CelsiusToF{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double celsius = scnr.nextDouble();
	double fahrenheit;
	
	fahrenheit = (celsius * (9.0 / 5.0)) + 32 ;
	
	System.out.print("The conversion of " + celsius + " Celsius to Fahrenheit is: " + fahrenheit);
	}
}