import java.util.Scanner; 

/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 *Lab 6 assignment -- love

 *Last modified: 02/14/2019 and submitted by Oswaldo

*/
public class love{ 
  public static void main(String[] args) throws Exception 
  { 
    Scanner scnr = new Scanner(System.in);
	
	String finalChoice;
	String placeToGo;
	
	System.out.println("\n\nDo you want to be my valentine?");
	String valentine = scnr.nextLine();
	
		if (valentine.equals("yes")){
			System.out.println("\nGreat! Do you want to hang out in the evening?");
	
			String evening = scnr.nextLine();

			if (evening.equals("yes")){
				System.out.println("\nDo you want to go for dinner, dessert, or both?");
			
				placeToGo = scnr.nextLine();
			
				if (placeToGo.equals("dinner")){
					System.out.println("\nWhere do you want to go? We can go to Las Alitas, La Diana or comer tacos de la esquina.");
				
					finalChoice = scnr.nextLine();
				}
				else if (placeToGo.equals("dessert")){
					System.out.println("\nDo you want to go to Lucys Milshake or Falconi?");
					
					finalChoice = scnr.nextLine();
				
				}
				else{
					System.out.println("\nLets go to both then, Alitas and Lucys?");					
					finalChoice = scnr.nextLine();
				}
				System.out.println("\nWe're going to " + finalChoice + " at 6 pm for " + placeToGo + " on Valentines Day.");
				System.out.print("\n\t\tHAPPY VALENTINES!!\n\n");
				
				
			}
	
		}
		else {
			System.out.print("\nThat is okay, Happy Valentines Day!\n");
		}
		}
	}   