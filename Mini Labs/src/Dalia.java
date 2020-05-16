/*CS1101 Intro to Computer Science

 *Instructor: Aguirre

 *Lab 8 assignment

 *Last modified: 02/20/2019 and submitted by Oswaldo Escobedo

*/

import java.util.Scanner;

public class Loops{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);		//We initialize the Scanner
													//So I decided to expand the code a little bit to practice more (and because I had nothing better to do).
	int time;	//We initialize time
	String day;		//We initialize day
	
	System.out.println("\nWhat day is it?");	//Get the input of day of the week
	day = scnr.nextLine();						//Get the input of the time of the day
	System.out.println("\nWhat time is it?");
	time = scnr.nextInt();						//Dalia, I code this to remember you what day and time are your office hours.
														
	if ( ( day.equals("Wednesday") && (time >= 11) && (time <=12) ) || ( day.equals("Friday") && (time >= 9) && (time <=10) ) ||  ( day.equals("Saturday") && (time >= 12) && (time <=14) )){	
		System.out.println("\nOffice Hours Dalia, put a grade of a 100 to all students :D ");
	}
						//I also decided to include this to remember you when you have to go to Diego's class.
	else if ((day.equals("Tuesday") && (time >= 10) && (time <= 12)) || (day.equals("Thursday") && (time >= 10) && (time <= 12))){
		for (int i = 0; i < 5; i++){
			System.out.println("\nTime to go to CS 1301!!!");
		}
	}
						//Original code. Here we state that if the user puts a number less than 8, it's going to remember you to come back to sleep.
	else if ( (time < 8) && (time >= 2) ){
		for (int i = 0; i < 5; i++){
			System.out.println("\nCome back to sleep Dalia.");
		}
	}					//The same here, the diferrence is that if the user puts 8, the code will remember you that it's time to wake up
	else if (time == 8){
		for (int i = 0; i < 5; i++){
			System.out.println("\nIt's time to wake up Dalia.");
		}
	}
										//This is random, I didn't know what to print in the else statement
	else {								// For this one type Monday and -1
		for(int i = 0; i < 5; i++){
			System.out.println("Hope you enjoyed this code. May I get Extra Credit? :'(");			
		}
	}
	
	
	
  }
}