import java.util.Scanner;

public class tableNumsRepetition{
	public static void main(String[] args) {
    
	Scanner scnr = new Scanner(System.in);
	
    int[] nums = {0,1,2,1,1,2,2};	
	
	for (int i = 0; i < nums.length; i++) {
		for (int j = i + 1 ; j < nums.length; j++) {
			if (nums[i]==nums[j]) {
				System.out.println("number " + nums[i] + " repeats " + i);
			}
 }
}

}
}