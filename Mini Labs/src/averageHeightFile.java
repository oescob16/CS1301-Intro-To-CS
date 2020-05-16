/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 *AverageHeightFile assignment

 *Last modified: 02/09/2018 and submitted by Oswaldo

*/

import java.io.*;
import java.io.File;
import java.util.Scanner; 

public class averageHeightFile{ 
  public static void main(String[] args) throws Exception 
  {  
    
	//initialize the file
	File myFile = new File("height.txt");

	//initialize the scanner to read the file
	Scanner scnr = new Scanner(myFile);
   
	//initalize the string from the first line and read it. 
	String userName = scnr.nextLine();
	
	//we print to output the first line
	System.out.println("Name: " + userName);
  
	//Initialize and declare userFeet to read the second line from height.txt, and print it to output
	int userFeet = scnr.nextInt();
	System.out.println("Height in feet: " + userFeet);
	
	//Initialize and declare userInches to read the third line from height.txt, and print it to output
	int userInches = scnr.nextInt();
	System.out.println("Height in inches: " + userInches);  
	
	//Initialize and declare totalHeight to get the complete height, and print it to output
	int totalHeight = ((userFeet * 12) + userInches);
	System.out.println("Total height (in inches): " + totalHeight);
	
	//Initialize and declare neighborsHeight to read the fourth line from height.txt, and print it to output
	int neighborsHeight = scnr.nextInt();
	System.out.println("Neighbors height (in inches): " + neighborsHeight);
	
	//Initialize and declare averageHeight to get the average between totalHeight and neighborsHeight
	double averageHeight = ((totalHeight + neighborsHeight) / 2);
	
	//We print and get the result in the output
	System.out.printf("The total average of both you " + userName + " and your neighbor is %.2f", averageHeight);
  }   
}