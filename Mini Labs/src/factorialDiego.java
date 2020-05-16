import java.util.Scanner;

public class factorialDiego{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	int fact = 1;
	
	System.out.println("\nType a number: ");
	int n = scnr.nextInt();
	
	for(int i = 1; i <= n; i++){
		fact = fact * i;
		System.out.println(fact);
	}
  }
}