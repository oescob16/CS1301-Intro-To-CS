/* CS1101 Intro to Computer Science
 * Instructor: Diego Aguirre
 * Program for combination, permutation and factorial methods
 * Last modified on 15/03/2019
 * Modified and submitted by: Oswaldo Escobedo
*/
import java.util.Scanner;

public class SetCalculator{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("\n\t# Put a number and we will tell you its factorial: ");
		int numFact = scnr.nextInt();
		
		long factResult = factorial(numFact);
		System.out.println("\n\t# The factorial of " + numFact + " is: " + factResult);
		
		System.out.print("\n\t# Type the setSize: ");
		int setSize = scnr.nextInt();
		
		System.out.print("\n\t# Type the subSetSize: ");
		int subSetSize = scnr.nextInt();
		
		if(subSetSize >= setSize){
			System.out.println("\n\t# Sorry, the subSetSize must not be bigger than setSize. Exiting");
			System.exit(0);
		}
		else{		
			long combinationResult = combination(setSize, subSetSize);
			System.out.println("\n\t# The combination of setSize and subSetSize is: " + combinationResult);
			
			long permutationResult = permutation(setSize, subSetSize);
			System.out.println("\n\t# The permutation of setSize and subSetSize is: " + permutationResult);
		} 
	}
 
	public static long combination(int n, int r){
		
		long factN = factorial(n);
		long factR = factorial(r);
		long factNR = factorial(n - r);
		
		long combination = (factN) / (factR * factNR);
		
		return combination;
	}

	public static long permutation(int n, int r){
		
		long factN = factorial(n);
		long factNR = factorial(n - r); 
		
		long permutation = factN / factNR;
		
		return permutation;
	}

	public static long factorial(int a){
		if(a < 2){
			return 1;
		}
		
		return a * factorial(a - 1);
 
	}
}