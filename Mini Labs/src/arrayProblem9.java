public class arrayProblem9{
	public static void main(String [] args) throws Exception{
	
		int[] arrayOne = {2, 4, 6, 8, 10};
		int sum = 0;
        int i; 
        
		for(i = 0; i < arrayOne.length; i++){
            sum +=  arrayOne[i];
			System.out.println("Result is: " + sum);
		}
        
	}
}