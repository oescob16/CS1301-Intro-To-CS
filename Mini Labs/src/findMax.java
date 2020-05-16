public class findMax{
	public static void main(String[] args){
	
		int[] nums = {1, 2, 3, 4, 5};
		int index = 0;
		
		int max = findMax1(nums, index);
		
		System.out.println(max);
	}
	
	public static int findMax1(int[] nums, int index){
		
		 if (index < 0 || index >= nums.length)
			return Integer.MIN_VALUE;
		
		int subArrayMax = findMax1(nums, index);
		
		if(nums[index] > subArrayMax)
			return nums[index];
		
		return nums[index];
	}
}