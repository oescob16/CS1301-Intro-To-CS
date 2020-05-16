public class arrayProblem7{
	public static void main(String[] args){          

		int[] simpleArray = {7, 3, 5, 1, 9, 10, 8, 4, 9, 6};

		for (int i = 0; i < simpleArray.length ; i++){
			if(simpleArray[i] % 2 == 0){
				System.out.println(simpleArray[i] + " ");
			}
		}
	
	}

}