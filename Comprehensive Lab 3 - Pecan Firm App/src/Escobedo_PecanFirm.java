/* CS1101 â€“ Intro to Computer Science 
Instructor: Aguirre OR Akbar OR Villanueva [LEAVE ONLY ONE]

Comprehensive Lab 3

By including my name below I confirm that:
-	I am submitting my original work.
-	If I include code obtained from another source or I received help I am giving attribution to those sources as comments.
-	This submission does not incur in any academic dishonesty practice as described in the course syllabus.


Modified and submitted by: [Oswaldo Escobedo] 
*/ 
import java.util.*;
import java.io.*;

public class Escobedo_PecanFirm {
	private double sizeOfTheFirm;		
		
	public Escobedo_PecanFirm(){
	}
	
	public Escobedo_PecanFirm(double sizeOfTheFirm){
		
		this.sizeOfTheFirm = sizeOfTheFirm;
	}
	
	public double getSize(){
		return this.sizeOfTheFirm;
	}
	
	public void setSize(double sizeOfTheFirm){
		
		this.sizeOfTheFirm = sizeOfTheFirm;
	}
	
	private static Escobedo_Pecan[] readInFile(File information) throws Exception{
		
		Scanner fileScnr = new Scanner(System.in);
		
		//Try-catch statements, if the user types a .txt file that does not exist is going to throw an exception.
		try{
			fileScnr = new Scanner(information);
		}
		
		catch(FileNotFoundException e){
			throw new Exception("Input file does not exist.");
		}
		
		//The statement below reads and stores sizeOfAcres in the private attribute: sizeOfTheFirm
		Escobedo_PecanFirm size = new Escobedo_PecanFirm();
		double sizeOfAcres = fileScnr.nextDouble();		
		size.setSize(sizeOfAcres);
		
		//Scanner to finish reading the first line
		fileScnr.nextLine();		
		
		///while loop to determine the lines that are in the .txt file so we can know the size of the String array 
		int count = 0; 		
		
		while(fileScnr.hasNextLine()){
			
			count++;
			fileScnr.nextLine();
		}		
		
		//We reset the scanner so we can start from the beginning and thus, start reading the trees information
		fileScnr = new Scanner(information);		
		fileScnr.nextLine();
		
		//We initialize an object array
		Escobedo_Pecan[] article = new Escobedo_Pecan[count];
		
		//while loop to read and store the information in the object array
		while(fileScnr.hasNextLine()){
			
			for(int i = 0; i < article.length; i++){
				
				//Scanner to read a whole line
				String pecan = fileScnr.nextLine();
				
				//split to get rid of the commas
				String[] tmp = pecan.split(", ");
				
				//we convert every single value to its corresponding data type, after this we store it in the object array
				article[i] = new Escobedo_Pecan(tmp[0], Integer.parseInt(tmp[1]), (tmp[2].equals("Yes") ? true: false), Integer.parseInt(tmp[3]), Double.parseDouble(tmp[4]));
			}
		}
			
		return article;
	}
	
	public static void main(String[] args) throws Exception{
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("\n\t    Type the name of the file you want to use: ");
		
		String fileOption = scnr.next() + ".txt";
		
		File inFile = new File(fileOption);
		
		//We call a method that reads, stores and returns an array of objects 
		Escobedo_Pecan[] list = readInFile(inFile);
		
		System.out.print("__________________________________________________________________________");
		
		System.out.println("\n\n\t\tWelcome to the great Escobedo_PecanFirm.java!!");
		
		boolean exit = true;
		
		///Menu, while-loop until the person decides to exit
		while(exit){
	
			System.out.println("\n\t\t\tWhere do you want to go?");
			
			System.out.println("\n\t\t 1. Check the yield per acre");
			System.out.println("\t\t 2. Check which trees needs to be prunned");
			System.out.println("\t\t 3. Update tree's information");
			System.out.println("\t\t 4. Check certain types of trees");
			System.out.println("\t\t 5. Check the information of all the trees");
			System.out.println("\t\t 6. Exit");		

			System.out.print("\n\t\t Input: ");
				
			int userOption;
			
			//If the user inputs a letter and not an integer then throw an InpitMismatchException
			try{
				userOption	= scnr.nextInt();
			}
			catch(InputMismatchException e){
				throw new InputMismatchException("You can only use numbers as an option.");
			}
		
			switch(userOption){		
			
				case 1:					
				
				double avg = yieldPerAcre(list);		
				System.out.printf("\n\t\t Yield per acre: %.2f", avg);
				System.out.println("\n__________________________________________________________________________");
				break;
				
				case 2:
				
				pecansPruning(list);
				break;
				
				case 3:
				
				update(list);
				break;

				case 4:
				
				System.out.println("\n\t\t\t What types of trees do you want to check?");
				
				System.out.println("\n\t\t A. Find trees that are equal or greater than my given yield");
				System.out.println("\t\t B. Find trees that are equal or greater than my given spread");
				System.out.println("\t\t C. Find healthy trees");
				System.out.println("\t\t D. Find non-healthy trees");
				
				System.out.print("\n\t\t Input: ");
			
				char checkOption = scnr.next().charAt(0);
					
					switch(checkOption){
						
						case 'a':
						case 'A':
						
						System.out.print("\n\t\t Type the desired yield: ");
						double inYield = scnr.nextDouble();
						PrintYield(inYield, list);
						break;
						
						case 'b':
						case 'B':
						
						System.out.print("\n\t\t Type the desired spread: ");
						int inSpread = scnr.nextInt();
						PrintSpread(inSpread, list);
						break;
						
						case 'c':
						case 'C':
						
						healthyTrees(list);
						break;
						
						case 'd':
						case 'D':
						
						boolean nonHealthy = false; 
						nonHealthyTrees(list);
						break;
						
					}
				break;
				
				case 5:
					
					System.out.println("\n\t\t\t Tree's information: \n");
					
					for(int i = 0; i < list.length; i++){
						
						System.out.println("\t " + list[i].toString());
					}
					
					System.out.println("__________________________________________________________________________");
				break;
				
				case 6: 
				
				System.out.println("\n\tThank you for using and trusting Escobedo_PecanFirm.java!");
				System.out.println("__________________________________________________________________________");
				exit = false;
				break;
				
				default: 
				
				System.out.println("\n // Incorrect input, please select an option that appears in the menu. //");
				System.out.println("__________________________________________________________________________");
				break;
			}
		}		
	}
	
	public static double yieldPerAcre(Escobedo_Pecan[] yield) throws Exception{
		
		double sum = 0; 
		
		//for loop to sum every yield in the object array
		for(int i = 0; i < yield.length; i++){
			
			sum += yield[i].getYield();
		}
		
		return sum / yield.length;
	
	}
	
	public static void pecansPruning(Escobedo_Pecan[] pruning) throws Exception{
		
		System.out.println();
		
		//for loop to read and print which trees needs to be prunned
		for(int i = 0; i < pruning.length; i++){
			
			if(pruning[i].needsPruning()){
				System.out.println("\t\t ID: " + pruning[i].getID());
			}
		}
		
		System.out.print("__________________________________________________________________________\n");
	}
	
	public static void update(Escobedo_Pecan[] info){
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("\n\t\t Type the tree ID that you want to update: ");
		
		String treeID = scnr.next();		
		
		String accurateID = treeID.substring(0,3);
		
		//for loop to verify which tree matches with accurateID
		for(int i = 0; i < info.length; i++){
			
			String treesID = info[i].getID();
			
			//If the tree matches then proceed to open the menu, and give the option to set (using the setters) to update the value
			if(accurateID.equals(treesID)){
				
				System.out.println("\n\t\t\t What do you want to update?");
				
				System.out.println("\n\t\t A. The age of the tree");
				System.out.println("\t\t B. The condition of the tree");
				System.out.println("\t\t C. The spread of the tree");
				System.out.println("\t\t D. The yield information");				
				
				System.out.print("\n\t\t Input: ");
				char updateOption = scnr.next().charAt(0);
				
				switch(updateOption){
					
					case 'a':
					case 'A':
					
					System.out.println("\n\t\t\t How old is the tree " + treesID + "?");
					System.out.print("\n\t\t Input: ");

					int newAge = scnr.nextInt();
					info[i].setYear(newAge);
					break;
					
					case 'b':
					case 'B':
					
					System.out.println("\n\t\t\t Is the tree " + treesID + " healthy?");
					System.out.print("\n\t\t Input: ");
					
					String healthy = scnr.next();
					boolean newCondition = healthy.equals("Yes") ? true: false;
					info[i].setCondition(newCondition);
					break;
					
					case 'c':
					case 'C':
					
					System.out.println("\n\t\t\t What is the spread of the tree " + treesID + "?");
					System.out.print("\n\t\t Input: ");
					
					int newSpread = scnr.nextInt();
					info[i].setSpread(newSpread);
					break;
					
					case 'd':
					case 'D':
					
					System.out.println("\n\t\t\t What is the yield of the tree " + treesID + "?");
					System.out.print("\n\t\t Input: ");

					double newYield = scnr.nextDouble();
					info[i].setYield(newYield);
					break;
				}
			}
		}
		System.out.println("__________________________________________________________________________");
	}
	
	public static void PrintYield(double inputYield, Escobedo_Pecan[] yieldsInfo){
		
		System.out.println();
		
		for(int i = 0; i < yieldsInfo.length; i++){
			
			double yield = yieldsInfo[i].getYield();
			String ID = yieldsInfo[i].getID();
			
			if(yield >= inputYield){
				System.out.println("\t\t " + ID);
			}
		}
		System.out.println("__________________________________________________________________________");
	}
	
	public static void PrintSpread(int inputSpread, Escobedo_Pecan[] spreadInfo){
		
		System.out.println();
		
		for(int i = 0; i < spreadInfo.length; i++){
			
			int spread = spreadInfo[i].getSpread();
			String ID = spreadInfo[i].getID();
			
			if(spread >= inputSpread){
				System.out.println("\t\t " + ID);
			}
		}
		System.out.println("__________________________________________________________________________");

	}
	
	public static void healthyTrees(Escobedo_Pecan[] healthyInfo){
		
		System.out.println(); 
		
		for(int i = 0; i < healthyInfo.length; i++){
			
			boolean condition = healthyInfo[i].getCondition();
			String ID = healthyInfo[i].getID();
			
			if(condition){
				System.out.println("\t\t " + ID);
			}
		}
		System.out.println("__________________________________________________________________________");

	}
	
	public static void nonHealthyTrees(Escobedo_Pecan[] nonHealthyInfo){
		
		System.out.println();
		
		for(int i = 0; i < nonHealthyInfo.length; i++){
			
			boolean condition = nonHealthyInfo[i].getCondition();
			String ID = nonHealthyInfo[i].getID();
			
			if(!condition){
				System.out.println("\t\t " + ID);
			}
		}
		System.out.println("__________________________________________________________________________");

	}
}