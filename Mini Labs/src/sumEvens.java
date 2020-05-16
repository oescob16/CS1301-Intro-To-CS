import java.util.Scanner;

public class sumEvens{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	int s = 0;
	
	System.out.println("\nType a number (lowerbound): ");
	int n = scnr.nextInt();
	System.out.println("\nType a number (upperbound): ");
	int m = scnr.nextInt();	
	
	for(int i = n; i <= m; i++){
		if(i % 2 == 0){
			s = s + i;
		}
		System.out.println(s);
	}
  }
}