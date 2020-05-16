public class arrayProblem8{
	public static void main(String[] args){          

		double[] simpleArray = {7.0, 3.0, 5.0, 1.0, 9.0, 10.0, 8.0, 4.0, 9.0, 6.0};

		for (int i = simpleArray.length - 1; i >= 0; i--){
			simpleArray[i] = (simpleArray[i] + 3.0) * 2.0;
		
			System.out.println(simpleArray[i]);
		}
	
	}
}