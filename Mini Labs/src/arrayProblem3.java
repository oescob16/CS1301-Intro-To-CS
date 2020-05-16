public class arrayProblem3{ 
	public static void main(String args[]){
		
		double[] simpleArray = {7.0, 3.0, 5.0, 1.0, 9.0, 10.0, 8.0, 4.0, 9.0, 6.0};

		double maxValue = simpleArray[0];
		
		for(int i = 1;i < simpleArray.length; i++){ 
			if(simpleArray[i] > maxValue){ 
				maxValue = simpleArray[i]; 
			} 
		} 
		System.out.println("Maximum Value is: " + maxValue);
	}
}

