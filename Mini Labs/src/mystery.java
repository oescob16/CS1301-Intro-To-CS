public class mystery{
	public static void mystery(int[] A) {
		
		for (int i=1; i < A.length - 1; i++){
			
			A[i] = A[i] / A[i-1] + 2;
			System.out.println(A[i]);
		}
	}

	public static void main(String[] args) { 
		int[] B = {2, 4, 8, 16, 32};
		
		mystery(B);
	}
}