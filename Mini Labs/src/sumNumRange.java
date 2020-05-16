import java.util.Scanner;

public class sumNumRange{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	int sum = 0;
	
	System.out.println("Enter the first number from a range (The lower bound)");
	int lowerBound = scnr.nextInt();
	System.out.println("Enter the second number from a range (The upper bound)");
	int upperBound = scnr.nextInt();
	
	for(int i = lowerBound; i < upperBound; i++){
		sum += i;
		System.out.println("sum = " + sum);
	}
}
}