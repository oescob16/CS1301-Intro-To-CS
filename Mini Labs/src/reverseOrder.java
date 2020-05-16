import java.util.Scanner;

public class reverseOrder{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Type any number with more than 3 digits");
	int n = scnr.nextInt();
	
	int reverse = 0;
	
	while(n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        System.out.println("The reverse order is: " + reverse);
    }  
  }