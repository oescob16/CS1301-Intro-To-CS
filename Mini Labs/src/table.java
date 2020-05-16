import java.util.Scanner;

public class table{
	public static void main(String[] args) {
    
	Scanner scnr = new Scanner(System.in);
	
	int numRows = scnr.nextInt();
	int numCols = scnr.nextInt();
	
    int[][] nums = new int[numRows][numCols];

    for (int r = 0; r < nums.length; r++) {
        for (int c = 0;c < nums[r].length; c++) {
            nums[r][c] = (r*nums[r].length) + c;
            System.out.print(nums[r][c] + "  ");
        }
        System.out.println();
    }

}
}