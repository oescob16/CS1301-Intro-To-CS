/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 *whatToWatch assignment

 *Last modified: 02/17/2018 and submitted by Oswaldo

*/

import java.util.Scanner;

public class whatToWatch{
public static void main(String[] args){ 
    Scanner scnr = new Scanner(System.in);
	
	String kids;
	String moviesSeries;
	int genre;
	
	System.out.println("\nAre you with kids?");
	
	kids = scnr.nextLine();
	
		if ((kids.equals("no"))||(kids.equals("No"))){
			System.out.println("\nAll right! Do you want to see a movie or a series?");
	
			moviesSeries = scnr.nextLine();

			if ((moviesSeries.equals("movie"))||(moviesSeries.equals("Movie"))){
				System.out.println("\nWhat genre? \n\nPress: 0 for Action, 1 for Sci-Fi, or 2 for Comedy");
				
				genre = scnr.nextInt();
				
				switch (genre){
					case 0:
					System.out.println("\nRecommendation: Avengers End Game");
					break;
					
					case 1:
					System.out.println("\nRecommendation: Interestelar");
					break;
					
					case 2: 
					System.out.println("\nRecommendation: Grown Ups");
					break;
					
					default:
					System.out.print("\nRecommendation: The purge");
					break;
				}
			}
			else if ((moviesSeries.equals("series"))||(moviesSeries.equals("Series"))){
				System.out.println("\nWhat genre? \n\nPress: 0 for Horror, 1 for Comedy, or 2 for Sci-Fi");

				genre = scnr.nextInt();
				
				switch (genre){
					case 0: 
					System.out.println("\nRecommendation: American Horror Story");
					break;
					
					case 1:
					System.out.println("\nRecommendation: Sexual Education");
					break;
					
					case 2:
					System.out.println("\nRecommendation: Dark Mirror");
					break;
					
					default:
					System.out.println("\nRecommendation: 13 Reasons Why");
					break;
				}
			}
		}
		else{
			System.out.println("\nWhat genre? \n\nPress: 0 for Comedy, or 1 for action");
			genre = scnr.nextInt();
				
			switch (genre){
				
			case 0:
			System.out.println("\nRecommendation: Minions or Despicable Me");
			break;
				
			case 1:
			System.out.println("\nRecommendation: Spiderman: into the spiderverse");
			break;
				
			default:
			System.out.println("\nRecommendation: Coco or El Libro de la Vida");
			break;
			}
		}
	}
}	