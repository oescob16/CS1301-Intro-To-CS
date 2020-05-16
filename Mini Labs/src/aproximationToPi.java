import java.util.Scanner;

public class aproximationToPi{
  public static void main(String [] args){
    
	Scanner scnr = new Scanner(System.in);
	
	double pi = 0.0;
	double s = 1;
	int n = 1000000;
	
	for(int i = 1; i < n; i = i + 2){
		pi += s / i;
		s = -s;
	}
	System.out.println("Pi = " + (4 * pi));
  }
}
// I didn't know how to solve this one, it was too difficult,
// I spent so much time.