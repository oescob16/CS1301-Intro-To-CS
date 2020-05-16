/* CS1101 Intro to Computer Science
 * Instructor: Diego Aguirre
 * Program for combination, permutation and factorial methods
 * Last modified on 15/03/2019
 * Modified and submitted by: Oswaldo Escobedo
*/
import java.util.Scanner;

public class bunnies{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many bunnies do you have?");
		String bunnies = scnr.nextLine();
		
		String totalEars = changeXY(bunnies);
		System.out.print("The total of ears is: " + totalEars);
		
	}
 
	public static String changeXY(String str) {

  // when to stop
	if (str.length() == 0){
		return str;
	}

	// handle the "special case" using an assumption we can solve str.substring(1)
	if (str.charAt(0) == 'x'){
		return 'y' + changeXY(str.substring(1));
	}
	
	// handle the "simple" case using an assumption we can solve str.substring(1)
	return  changeXY(str.substring(1));
	}
	
	
}