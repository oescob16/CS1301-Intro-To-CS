import java.util.Arrays;
import java.util.Scanner;

public class arrayRecursion{
	public static void main(String[] args){
	
		Scanner scnr = new Scanner(System.in);
	
		int[] a = new int[3];
	
		for(int i = 0; i < a.length ; i++){
			System.out.print("Array: ");
			a[i] = scnr.nextInt();
		}	
		System.out.print(Arrays.toString(a));
	}
	
	public static int array11(int[] a, int b){
	
		if(a.length() == 1){
			if(11 == a[0]){
				return 1;
			}
			return 0;
		}
	}
}