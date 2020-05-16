public class arrayProblem2{
	public static void main(String [] args) throws Exception{
	
		double[] simpleArray= {7.0, 3.0, 5.0, 1.0, 9.0, 10.0, 8.0, 4.0, 9.0, 6.0};
		int sum = 0;
        int i; 
        
		for(i = 0; i < simpleArray.length; i++){
            sum +=  simpleArray[i];
			System.out.println("Result is: " + sum);
		}
        
	}
}