import java.util.Scanner;

public class tableSum{
	public static void main(String[] args) {
    
	Scanner scnr = new Scanner(System.in);
	
    int[][] matrix = {{0,1,2,4},{0,1,3,9},{0,1,5,15}};	


	for (int row = 0; row < matrix.length; row++) {
        int rowSum = 0;
        for (int col = 0; col < matrix[row].length; col++) {
            rowSum += matrix[row][col];
        }
        System.out.println("Sum of the elements at row " + row + " is: " + rowSum);
    }
	
	for (int col = 0; col < matrix[0].length; col++) {
        int colSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            colSum += matrix[row][col];
        }
        System.out.println("Sum of the elements at col " + col + " is: " + colSum);
    }
    
	}
}