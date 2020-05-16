import java.util.Scanner;

public class averageThreeNumbers{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	double firstNumber = scnr.nextDouble();
	double secondNumber = scnr.nextDouble();
	double thirdNumber = scnr.nextDouble();
	double sum;
	double average;
	
	sum = firstNumber+ secondNumber + thirdNumber;
	average = sum /3;
	
	System.out.print("The average of the three numbers is " + average);
	}
}