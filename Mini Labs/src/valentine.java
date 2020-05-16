/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 * Switch + loop assignment

 *Last modified: 02/18/2018 and submitted by Oswaldo

*/

import java.util.Scanner;

public class valentine{
public static void main(String[] args ){
	
	Scanner scnr = new Scanner(System.in);			// We initialized and assign Scanner
	
	System.out.println("\n\n\n\t\tHappy Valentine's Day!!!");
	
	int numKisses = 3;				//								//
	int numReeses = 3;				//HERE WE SET THE CANDY COUNTER	//
	int numRebanaditasMango = 3;	//								//
	
	boolean keepGoing = true;
																									// We use the while statement to create a Loop
	while (keepGoing && (numRebanaditasMango > -1) && (numKisses > -1) && (numReeses > -1)){		// We assign a condition for keepGoing to be false at some point
	
	System.out.println("\n\tEnter 0 if you want a kiss (Hershey's)");			//													//
	System.out.println("\tEnter 1 if you wat a reese's chcolate heart");		// 	DESCRIPTION THAT IS GOING TO BE IN THE OUTPUT	//
	System.out.println("\tEnter 2 if you want a rebanadita de mango");			//													//
	System.out.println("\tEnter 3 if you want to exit");
	
	System.out.println("\n\t\tnumKisses = " + numKisses);
	System.out.println("\n\t\tnumReeses = " + numReeses);
	System.out.println("\n\t\tnumRebanaditasMango = " + numRebanaditasMango);
	
	int choice = scnr.nextInt();
	
		switch (choice){
		
			case 0: 
			numKisses -= 1;
			if (numKisses == 0){
				System.out.println("\n\t---------------Ran out of Kisses!!------------");		
			}
			break;
		
			case 1:
			numReeses -= 1;
			if (numReeses == 0){																			// We make use of the Switch 
				System.out.println("\n\t---------------Ran out of Reeses!!------------");					// statements to make thinks 
			}																								// easier and understandable
			break;																							
		
			case 2:
			numRebanaditasMango -= 1;
			if (numRebanaditasMango == 0){
				System.out.println("\n\t---------------Ran out of Rebanaditas de Mango!!------------");
			}
			break;
		
			default:
			keepGoing = false;
			break;
			
		
		}
		
	}
	
	}
}