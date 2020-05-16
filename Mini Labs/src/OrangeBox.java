import java.util.Scanner;

public class OrangeBox{
	public static void main(String [] args){
	
		Scanner scnr = new Scanner(System.in);
	
			String[][] movies = {
								{"1.", "Avengers: Infinity War", "$60", "1"},
								{"2.", "Captain Marvel", "$40", "1"},
								{"3.", "Shazam", "$50", "2"},
								{"4.", "Detective pikachu", "$40", "2"},
								{"5.", "Feliz Dia de tu Muerte 2", "$30", "2"}
								};
	
			boolean keepGoing = true;

			//Statements to change the respective strings to integers
			String numberToString1 = movies[0][3];
			int movie1 = Integer.parseInt(numberToString1);

			String numberToString2 = movies[1][3];
			int movie2 = Integer.parseInt(numberToString2);
			
			String numberToString3 = movies[2][3];
			int movie3 = Integer.parseInt(numberToString3);
			
			String numberToString4 = movies[3][3];
			int movie4 = Integer.parseInt(numberToString4);
			
			String numberToString5 = movies[4][3];
			int movie5 = Integer.parseInt(numberToString5);
			///////////////////////////////////////////////////
			
			System.out.println("\n\tMovies available: \n");
			
			for(int i = 0; i < movies.length; i++){
				for(int j = 0; j < movies[i].length; j++){
					System.out.print(movies[i][j] + " ");
				}
				System.out.println("\n");
			}
			System.out.println("6. Exit");
			
			//While loop to let the user rent multiple movies
			while(keepGoing){
				
				System.out.print("\n\tWhich movie do you want to rent? ");
				
				int option = scnr.nextInt();
				
				switch(option){
					 
					case 1:
						if(movie1 == 0){
							System.out.println("\n\tSorry, this movie is out of stock\n");
						}
						else if(movie1 > 0){
							System.out.println("\n\tHere is your movie," + movies [0][1] + " the total is " + movies[0][2] + ", thank you\n");
							movie1 -= 1;
						}
					break;
				
					case 2:
						if(movie2 == 0){
							System.out.println("\n\tSorry, this movie is out of stock\n");
						}
						else if(movie2 > 0){
							System.out.println("\n\tHere is your movie, the total is " + movies[1][2] + ", thank you\n");
							movie2 -= 1;
						}
					break;
				
					case 3:
						if(movie3 == 0){
							System.out.println("\n\tSorry, this movie is out of stock\n");
						}
						else if(movie3 > 0){
							System.out.println("\n\tHere is your movie, the total is " + movies[2][2] + ", thank you\n");
							movie3 -= 1;
						}
					break;
				
					case 4:
						if(movie4 == 0){
							System.out.println("\n\tSorry, this movie is out of stock\n");
						}
						else if(movie4 > 0){
							System.out.println("\n\tHere is your movie, the total is " + movies[3][2] + ", thank you\n");
							movie4 -= 1;
						}
					break;
				
					case 5:
						if(movie5 == 0){
							System.out.println("\n\tSorry, this movie is out of stock\n");
						}
						else if(movie5 > 0){
							System.out.println("\n\tHere is your movie, the total is " + movies[4][2] + ", thank you\n");
							movie5 -= 1;
						}
					break;
				
					case 6:
						System.out.println("\n\tThank you for using orangeBox. Have a good day!\n\t");
						keepGoing = false;
					break;
					
					default:
						System.out.println("\n\tSorry, we don't have it\n");
					break;
			}
			}
			
			}
					
		
		
			
		
	}