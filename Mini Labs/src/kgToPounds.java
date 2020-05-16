import java.util.Scanner;

public class kgToPounds{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double kg = scnr.nextDouble();
	double kgToPounds;
	
	kgToPounds = kg * 2.2046;
	
	System.out.print("Your weight in pounds is " + kgToPounds);
	}
}