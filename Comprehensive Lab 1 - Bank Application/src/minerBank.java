/* CS1101 – Intro to Computer Science 
Instructor: Aguirre
Comprehensive Lab 1 
By including my name below, I confirm that:
-	I am submitting my original work.
-	If I include code obtained from another source or I received help I am giving attribution to those sources as comments.
-	This submission does not incur in any academic dishonesty practice as described in the course syllabus.
Modified and submitted by: Oswaldo Escobedo
Contribution with Alberto Miranda and Angel Ledezma (extra credit part)
*/ 

import java.util.Scanner;
import java.io.File;

public class minerBank{
	public static void main(String [] args) throws Exception{
	
	//Initializing and declaring Scanner
	Scanner scnr = new Scanner(System.in);
	
	//Opening userInfo.txt
	File myFile = new File("users.txt");
	
	//Initializing and declaring the File Scanner
	Scanner fileScnr = new Scanner(myFile);
	
	//Scan the users username from userInfo.txt
	String user1Name = fileScnr.next();	
	
	//Scan the users password from userInfo.txt
	int user1Password = fileScnr.nextInt();	
	
	//Scan the users Checking account from userInfo.txt	
	int user1CheckingAccount = fileScnr.nextInt();	
	
	//Scan the users Saving account from userInfo.txt
	int user1SavingAccount = fileScnr.nextInt();
	
	String user2Name = fileScnr.next(); 
	int user2Password = fileScnr.nextInt();
	int user2CheckingAccount = fileScnr.nextInt();
	int user2SavingAccount = fileScnr.nextInt();
	
	String user3Name = fileScnr.next(); 
	int user3Password = fileScnr.nextInt();
	int user3CheckingAccount = fileScnr.nextInt();
	int user3SavingAccount = fileScnr.nextInt();
														//Each paragraph reads the information of the users from userInfo.txt 
	String user4Name = fileScnr.next(); 
	int user4Password = fileScnr.nextInt();
	int user4CheckingAccount = fileScnr.nextInt();
	int user4SavingAccount = fileScnr.nextInt();
	
	String user5Name = fileScnr.next(); 
	int user5Password = fileScnr.nextInt();
	int user5CheckingAccount = fileScnr.nextInt();
	int user5SavingAccount = fileScnr.nextInt();
	
	String user6Name = fileScnr.next(); 
	int user6Password = fileScnr.nextInt();
	int user6CheckingAccount = fileScnr.nextInt();
	int user6SavingAccount = fileScnr.nextInt();
	
	String userName;
	
	int password;
	
	int withdrawMoney;
	
	int finalBalance = 0;
	
	int depositMoney;
	
	int transferMoney;
	
	int finalBalanceSavingsAccount = 0;
	int finalBalanceCheckingAccount = 0;
	
	int rateOption;
	
	//Printing a big line to make sections on output more readable
	System.out.println("_______________________________________________________________________");
	
	//Assigning userName and password with scanner, to read the users input
	System.out.print("\n ~ Enter Username: ");
	userName = scnr.nextLine();
	System.out.print(" ~ Enter Password: ");
	password = scnr.nextInt();
	
	//This statement makes the program never stops until we press 5.
	boolean keepGoing = true;
	
	//Initializing and declaring attempts by 1
	int attempts = 1;
	
	//Using a for-loop  to count the users attempts. 
	while(attempts <= 3){
		
		//If the password is not correct then start counting the attempts and give the user the chance to put the correct password and/or username
		if(	(!((userName.equals(user1Name)) && (password == user1Password))) && 
			(!((userName.equals(user2Name)) && (password == user2Password))) &&	 
			(!((userName.equals(user3Name)) && (password == user3Password))) &&	
			(!((userName.equals(user4Name)) && (password == user4Password))) &&	
			(!((userName.equals(user5Name)) && (password == user5Password))) &&	
			(!((userName.equals(user6Name)) && (password == user6Password)))   ){
			
			System.out.println("\n\t    //// Wrong password or username. Try again. ////");
			
			System.out.println("\n~ Enter Username: ");
			userName = scnr.next();
		
			System.out.println("\n~ Enter Password: ");
			password = scnr.nextInt();
	
			//If the user didn't type the correct password and/or username then increase by 1
			attempts++;		
		
		}
		
		//If the user type the correct password then exit the while loop
		else{
			System.out.println("\n  You are now logged in.");
			break;
		}
	}

//If the user typed the correct password and/or username and his attempts are less than or equal to 4, then give access to minerBank.java
if(attempts <= 4 && 
 (((userName.equals(user1Name)) && (password == user1Password)) || 
  ((userName.equals(user2Name)) && (password == user2Password)) ||	 
  ((userName.equals(user3Name)) && (password == user3Password)) ||	
  ((userName.equals(user4Name)) && (password == user4Password)) ||	
  ((userName.equals(user5Name)) && (password == user5Password)) ||	
  ((userName.equals(user6Name)) && (password == user6Password))	  )){
	
	//While keepGoing is true then keep running the program.
	while(keepGoing){
		
		System.out.println("_______________________________________________________________________");
		
		System.out.println("\n\t\t\t1. Check Balance");
		System.out.println("\t\t\t2. Withdraw Money");
		System.out.println("\t\t\t3. Deposit Money");
		System.out.println("\t\t\t4. Transfer Money");
		System.out.println("\t\t\t5. Exit\n");
		
		System.out.println("    Welcome to minerBank! Enter the menu option you want (1 to 5): \n");
		
		System.out.println("   Did you love minerBank.java? Please press 6 to rate our service!\n");
	
		int userOption = scnr.nextInt();
		
		System.out.println("_______________________________________________________________________");
		
		switch(userOption){
			
			//If the user typed 1 then enter the Check Balance section
			case 1:
			System.out.println("_______________________________________________________________________");
			System.out.println("\n\t\tSelect one of the following options: ");
			System.out.println("\n\t\t\t1. Checking Account");
			System.out.println("\t\t\t2. Saving Account\n");
			
			int checkBalanceOption = scnr.nextInt();
				
			switch(checkBalanceOption){
				
				//If the user typed 1 then enter the Checking Account section
				case 1:
					
					//if-else statement to confirm which user is using minerBank so we can output the correct information
					if(userName.equals(user1Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user1CheckingAccount);	
					}	
					else if(userName.equals(user2Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user2CheckingAccount);	
					}
					else if(userName.equals(user3Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user3CheckingAccount);	
					}
					else if(userName.equals(user4Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user4CheckingAccount);	
					}
					else if(userName.equals(user5Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user5CheckingAccount);	
					}
					else if(userName.equals(user6Name)){
						System.out.println("\n\t\t   Checking account Balance is: $" + user6CheckingAccount);	
					}
					System.out.println("_______________________________________________________________________");
					break;
				
				//If the user typed 2 then enter the Savings Account section
				case 2:
					
					//if-else statement to confirm which user is using minerBank so we can output the correct information
					if(userName.equals(user1Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user1SavingAccount);	
					}
					else if(userName.equals(user2Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user2SavingAccount);	
					}
					else if(userName.equals(user3Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user3SavingAccount);	
					}
					else if(userName.equals(user4Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user4SavingAccount);	
					}
					else if(userName.equals(user5Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user5SavingAccount);	
					}
					else if(userName.equals(user6Name)){
						System.out.println("\n\t\t    Saving account balance is: $" + user6SavingAccount);	
					}
					System.out.println("_______________________________________________________________________");
					break;
				}				
				break;
			
			//If the user typed 2 then enter the Withdraw Money section
			case 2:
			System.out.println("_______________________________________________________________________");
			System.out.println("\n\t\t     Choose where to withdraw: \n");
			System.out.println("\t\t\t1. Checking Account.");
			System.out.println("\t\t\t2. Savings Account.");
			
			int withdrawOption = scnr.nextInt();
			
			switch(withdrawOption){
				
				//If the user typed 1 then enter the Checking Account section
				case 1:
					System.out.println("\t\tHow much would you like to withdraw?");
					withdrawMoney = scnr.nextInt();
					
					//Enter while loop if the user withdraw more than $200. Otherwise, exit the loop.
					while(withdrawMoney > 200){
						System.out.println("\t\tYou cannot withdraw more than $200.");
						withdrawMoney = scnr.nextInt();							
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){				
						finalBalance = user1CheckingAccount - withdrawMoney;	
					}
				
					else if(userName.equals(user2Name)){
						finalBalance = user2CheckingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user3Name)){
						finalBalance = user3CheckingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user4Name)){
						finalBalance = user4CheckingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user5Name)){
						finalBalance = user5CheckingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user6Name)){
						finalBalance = user6CheckingAccount - withdrawMoney;
					}
					
					System.out.println("\t\t     Your final balance is: $" + finalBalance);
					System.out.println("_______________________________________________________________________");
					break;
				
				//If the user typed 2 then enter the Savings Account section
				case 2:
					System.out.println("\t\tHow much would you like to withdraw?");
					withdrawMoney = scnr.nextInt();
					
					//Enter while loop if the user withdraw more than $200. Otherwise, exit the loop.
					while(withdrawMoney > 200){
						System.out.println("\t\tYou cannot withdraw more than $200.");
						withdrawMoney = scnr.nextInt();
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){				
						finalBalance = user1SavingAccount - withdrawMoney;	
					}
				
					else if(userName.equals(user2Name)){				
						finalBalance = user2SavingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user3Name)){
						finalBalance = user3SavingAccount - withdrawMoney;
					}														
				
					else if(userName.equals(user4Name)){
						finalBalance = user4SavingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user5Name)){
						finalBalance = user5SavingAccount - withdrawMoney;
					}
				
					else if(userName.equals(user6Name)){
						finalBalance = user6SavingAccount - withdrawMoney;
					}
					
					System.out.println("\t\t    Your final balance is: $" + finalBalance);
					System.out.println("_______________________________________________________________________");
					break;
				}
				break;
			
			//If the user typed 3 then enter the Deposit Money section
			case 3:
			System.out.println("\n\t\t  Choose which account to deposit: \n");
			System.out.println("\t\t\t1. Checking Account.");
			System.out.println("\t\t\t2. Savings Account.");
			
			int depositOption = scnr.nextInt();
			
			switch(depositOption){
				
				//If the user typed 1 then enter the Checking Account section
				case 1:				
					System.out.println("\t\tHow much would you like to deposit?");
					depositMoney = scnr.nextInt();
					
					//Enter while loop if the user deposits more than $1200. Otherwise, exit the loop.
					while(depositMoney > 1200){
						System.out.println("\t\tYou cannot deposit more than $1200.");
						depositMoney = scnr.nextInt();							
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){
						finalBalance = user1CheckingAccount + depositMoney;
					}
				
					else if(userName.equals(user2Name)){
						finalBalance = user2CheckingAccount + depositMoney;
					}
					
					else if(userName.equals(user3Name)){
						finalBalance = user3CheckingAccount + depositMoney;
					}
					
					else if(userName.equals(user4Name)){
						finalBalance = user4CheckingAccount + depositMoney;
					}
					
					else if(userName.equals(user5Name)){
						finalBalance = user5CheckingAccount + depositMoney;
					}
					
					else if(userName.equals(user6Name)){
						finalBalance = user6CheckingAccount + depositMoney;
					}
					
					System.out.println("\t\t    Your final balance is: $" + finalBalance);
					System.out.println("_______________________________________________________________________");
					break;
				
				//If the user typed 2 then enter the Savings Account section
				case 2:
					System.out.println("\t\tHow much would you like to deposit?");
					depositMoney = scnr.nextInt();
					
					//Enter while loop if the user deposits more than $1200. Otherwise, exit the loop.
					while(depositMoney > 1200){
						System.out.println("\t\tYou cannot deposit more than $1200.");
						depositMoney = scnr.nextInt();							
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){
						finalBalance = user1SavingAccount + depositMoney;
					}
				
					else if(userName.equals(user2Name)){
						finalBalance = user2SavingAccount + depositMoney;
					}
					
					else if(userName.equals(user3Name)){
						finalBalance = user3SavingAccount + depositMoney;
					}
					
					else if(userName.equals(user4Name)){
						finalBalance = user4SavingAccount + depositMoney;
					}
					
					else if(userName.equals(user5Name)){
						finalBalance = user5SavingAccount + depositMoney;
					}
					
					else if(userName.equals(user6Name)){
						finalBalance = user6SavingAccount + depositMoney;
					}
					
					System.out.println("\t\t    Your final balance is: $" + finalBalance);
					System.out.println("_______________________________________________________________________");
					break;
			}
			break;
			
			//If the user typed 4 then enter the Transfer Money section
			case 4:
			System.out.println("\n\t\t Choose which account to withdraw:\n");
			
			System.out.println("\t\t\t1. Checking Account");
			System.out.println("\t\t\t2. Savings Account");
			
			//Initializing and declaring with scanner to read the user input and to know which section the user want to go
			int transferOption = scnr.nextInt();
			
			switch(transferOption){
				
				//If the user typed 1 then enter the Checking Account section
				case 1:
					System.out.println("\t\tHow much would you like to withdraw?");
					transferMoney = scnr.nextInt();
					
					//Enter while loop if the user withdraws more than 200. Otherwise, exit the loop.
					while(transferMoney > 200){						
						System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
						transferMoney = scnr.nextInt();	
						
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){			
						finalBalanceCheckingAccount = user1CheckingAccount - transferMoney;
						finalBalanceSavingsAccount = user1SavingAccount + transferMoney;
					}
					
					else if(userName.equals(user2Name)){			
						finalBalanceCheckingAccount = user2CheckingAccount - transferMoney;
						finalBalanceSavingsAccount = user2SavingAccount + transferMoney;
					}
					
					else if(userName.equals(user3Name)){			
						finalBalanceCheckingAccount = user3CheckingAccount - transferMoney;
						finalBalanceSavingsAccount = user3SavingAccount + transferMoney;
					}
					
					else if(userName.equals(user4Name)){			
						finalBalanceCheckingAccount = user4CheckingAccount - transferMoney;
						
						//Enter while loop if the user withdraws more than his current balance. Otherwise, exit the loop.
						while(finalBalanceCheckingAccount < 0){											
							System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
							transferMoney = scnr.nextInt();
							finalBalanceCheckingAccount = user4CheckingAccount - transferMoney;
						}
						
						finalBalanceSavingsAccount = user4SavingAccount + transferMoney;
					}
					
					else if(userName.equals(user5Name)){			
						finalBalanceCheckingAccount = user5CheckingAccount - transferMoney;
						
						//Enter while loop if the user withdraws more than his current balance. Otherwise, exit the loop.
						while(finalBalanceCheckingAccount < 0){
							System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
							transferMoney = scnr.nextInt();
							finalBalanceCheckingAccount = user5CheckingAccount - transferMoney;
						}
						
						finalBalanceSavingsAccount = user5SavingAccount + transferMoney;
					}
					
					else if(userName.equals(user6Name)){			
						finalBalanceCheckingAccount = user6CheckingAccount - transferMoney;
						finalBalanceSavingsAccount = user6SavingAccount + transferMoney;						
					}
					
					//Displays message of how much did the user transfered from his Saving Account to his Checking Account.
					System.out.println(" You are transferring $" + transferMoney + " from your checking account to your Saving Account\n");
					System.out.println("\t\tYour checking account final balance is: $" + finalBalanceCheckingAccount);
					System.out.println("\t\t Your savings account final balance is: $" + finalBalanceSavingsAccount);
					System.out.println("_______________________________________________________________________");
					break;
				
				//If the user typed 2 then enter the Savings Account section
				case 2:
					System.out.println("\t\tHow much would you like to withdraw?");
					transferMoney = scnr.nextInt();
					
					//Enter while loop if the user withdraws more than 200. Otherwise, exit the loop.
					while(transferMoney > 200){
						System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
						transferMoney = scnr.nextInt();	
						
					}
					
					//if-else statement to confirm which user is using minerBank so we can output the correct finalBalance
					if(userName.equals(user1Name)){					
						finalBalanceSavingsAccount = user1SavingAccount - transferMoney;
						finalBalanceCheckingAccount = user1CheckingAccount + transferMoney;
					}
					
					else if(userName.equals(user2Name)){			
						finalBalanceSavingsAccount = user2SavingAccount - transferMoney;
						finalBalanceCheckingAccount = user2CheckingAccount + transferMoney;
					}
					
					else if(userName.equals(user3Name)){			
						finalBalanceSavingsAccount = user3SavingAccount - transferMoney;
						finalBalanceCheckingAccount = user3CheckingAccount + transferMoney;
					}
					
					else if(userName.equals(user4Name)){			
						finalBalanceSavingsAccount = user4SavingAccount - transferMoney;
						finalBalanceCheckingAccount = user4CheckingAccount + transferMoney;
					}
					
					else if(userName.equals(user5Name)){			
						finalBalanceSavingsAccount = user5SavingAccount - transferMoney;
						
						//Enter while loop if the user withdraws more than his current balance. Otherwise, exit the loop.
						while(finalBalanceSavingsAccount < 0){
							System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
							transferMoney = scnr.nextInt();
							finalBalanceSavingsAccount = user5SavingAccount - transferMoney;
						}
						finalBalanceCheckingAccount = user5CheckingAccount + transferMoney;
					}
					
					else if(userName.equals(user6Name)){
						finalBalanceSavingsAccount = user6SavingAccount - transferMoney;
						
						//Enter while loop if the user withdraws more than his current balance. Otherwise, exit the loop.
						while(finalBalanceSavingsAccount < 0){
							System.out.println(" You cannot withdraw more than $200 or more than your current balance is.");
							transferMoney = scnr.nextInt();
							finalBalanceSavingsAccount = user6SavingAccount - transferMoney;
						}
						
						finalBalanceCheckingAccount = user6CheckingAccount + transferMoney;
					}
					
					//Displays message of how much did the user transfered from his Saving Account to his Checking Account.
					System.out.println("\n You are transferring $" + transferMoney + " from your savings account to your checking Account\n");
					System.out.println("\t\tYour savings account final balance is: $" + finalBalanceSavingsAccount);
					System.out.println("\t\tYour checking account final balance is: $" + finalBalanceCheckingAccount);
					System.out.println("_______________________________________________________________________");
					break;
			}
			break;
			
			//If the user typed 5 then enter the Exit section
			case 5:
			System.out.println("\n\tThank you for using and trusting minerBank.java! Good bye!");
			System.out.println("_______________________________________________________________________");
			
			//Assigning keepGoing with false to make the program stop
			keepGoing = false;
			break;
			
			//If the user typed 6 then enter the rate section
			case 6:
			System.out.println("\n\t\tFrom 1 to 10 how would you rate us?");
			rateOption = scnr.nextInt();
			
			//Enter while loop if the user gives a rate of 0, 1, 2, 3, 4, or 5. Otherwise, exit the loop.
			while( (rateOption <= 5) && (rateOption >= 0) ){
					System.out.println("\n\t     We did better than that, don't you think?");
					
					//Scanner to give the user the option type a better rate (in other words, it gives the user the option to redeem himself) 
					rateOption = scnr.nextInt();
			}
			
			//If statement if the user gives a rate of 6, 7, or 8. 
			if( (rateOption >= 6) && (rateOption <= 8)){
				System.out.println("\n\t\t\tWhat can we improve?\n");
				
				//Initializing and declaring the feedback scanner
				Scanner feedback = new Scanner(System.in).useDelimiter("\\n");	//Delimiter is a character that identifies the beginning or the end of a character string.
				
				//Scanner to give the user the option to give us feedback
				String improve = feedback.nextLine();
				System.out.println("\n\tFeedback: " + improve);
			}
			
			//else if statement if the user gives a rate of 9 or 10 
			else if((rateOption > 8) && (rateOption <= 10)){
				System.out.println("\n\t   Excellent, thank you so much for your opinnion!");
			}
			break;
		}
	}
	}
	
	//If the user typed the wrong password and his attempts are equal to 4 then give a final message and exit the program.
	else if(attempts == 4){
		System.out.println("\n     //// Your username or password is not correct. Exiting. ////");
		System.out.println("_______________________________________________________________________");
	
		//This closes the program.
		System.exit(0);
	}
}
}