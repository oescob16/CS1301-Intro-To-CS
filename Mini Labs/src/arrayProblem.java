
public class arrayProblem{
	public static void main(String [] args) throws Exception{
	
		double[] arr= {7.0, 3.0, 5.0, 1.0, 9.0, 10.0, 8.0, 4.0, 9.0, 6.0};
		int sum = 0; // initialize sum 
        int i; 
        
         // Iterate through all elements and add them to sum 
         for (i = 0; i < arr.length; i++) 
            sum +=  arr[i]; 
        
		System.out.println("Result is: " + sum);
		}
	}