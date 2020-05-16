import java.util.Scanner;

public class factorialNumber{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	long result = 1; 
	
	System.out.println("\nType a number: ");
	long nFactorial = scnr.nextInt();
	
	for(long i = 0; i < nFactorial; i++){
		result = result * (nFactorial - i);
		System.out.println("The result of " + nFactorial + "! is " + result);
	}
  }
}