import java.util.Scanner;

public class utepMiners{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Type the lowest range: ");
	int lowerBound = scnr.nextInt();
	System.out.println("Type the upper range: ");
	int upperBound = scnr.nextInt();
	
	for(int i = lowerBound; i < upperBound; i++){
		if(i % 3 == 0){
			System.out.println("UTEP");
		}
		else if(i % 5 == 0){
			System.out.println("Miners");
		}
		else{
			System.out.println("" + i);
		}
	}
	}

  }
  
  