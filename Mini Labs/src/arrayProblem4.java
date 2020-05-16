public class arrayProblem4{ 
	public static void main(String args[]){
		
		double[] grades = {89, 90, 75, 100, 57, 86, 95, 91, 92, 74};

		double minValue = grades[0];
		
		for(int i = 1;i < grades.length; i++){ 
			if(grades[i] < minValue){ 
				minValue = grades[i]; 
			} 
		} 
		System.out.println("Minimum Value is: " + minValue);
	}
}