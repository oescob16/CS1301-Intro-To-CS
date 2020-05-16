import java.util.Scanner;

public class tableMax{
	public static void main(String[] args) {
    
	Scanner scnr = new Scanner(System.in);
	
    int[][] nums = {{0,1,2,4},{0,1,3,9},{0,1,5,15}};	
	double max = 0;
	
    for (int r = 0; r < nums.length; r++) {
        for (int c = 0;c < nums[r].length; c++) {
            if(nums[r][c] > max){
				max = nums[r][c];
        }
    }
	}
	System.out.println(max);

}
}