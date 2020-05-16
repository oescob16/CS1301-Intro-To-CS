import java.util.Scanner;

/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 *AverageHeight assignment

 *Last modified: 02/07/2018 and submitted by Oswaldo

*/

public class AverageHeight{
public static void main(String[]args){

Scanner scnr = new Scanner(System.in);

//Type your name
System.out.println("Whats your name?");
String usersName = scnr.nextLine();

//Type your height in feet, Ex. 5 feet
System.out.println("How tall are you in feet?");
double heightInFeet = scnr.nextDouble();

//Type your remaining inches, Ex. 2
System.out.println("How many inches remaining?");
int inches = scnr.nextInt();

//Here we are declaring feetToInches and declaring and assigning heightInInches
double feetToInches;
double heightInInches = 0.0;

//We multiply the input height to convert it in inches
feetToInches = (heightInFeet * 12);

//Here is the sum of the inputed height and the remaining inches, in order to obtain the complete height of a person
double newcompleteheight = feetToInches + inches;

//Displays the message with the output values
System.out.println("Hi " + usersName + " you are in total " + newcompleteheight + " inches tall");

//Declaring averageHeight
double averageHeight;

//Type your neighbors height in inches
System.out.println("What is your neighbors height in inches?");
double user2 = scnr.nextDouble();

//We sum your total height and your neighbors, then we divide it by 2, to obtain the averageHeight
averageHeight = (newcompleteheight + user2) / 2;

//Display the message with its value
System.out.print("The average height of both you and your neighbor is ");

//We put printf and %.2f, in order to obtain the final value with two decimals.
System.out.printf("%.2f", averageHeight);
	
	}
}
