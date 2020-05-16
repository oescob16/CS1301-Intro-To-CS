import java.util.Scanner;

public class seriesOfDivision{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	double s = 0.0;
	
	System.out.println("\nType a number: ");
	int n = scnr.nextInt();
	
	for(double i = 1; i <= n; i++){
		s = s + 1 / i;
		System.out.println(s);
	}
  }
}