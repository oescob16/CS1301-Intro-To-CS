import java.util.Scanner;

public class changeVowels{
	public static void main(String[] args){
		
		Scanner scnr = new Scanner(System.in).useDelimiter("\\n");
		
		String sentence = scnr.nextLine();
	
		sentence = sentence.replaceAll("[AaEeOoUu]", "i");
		
		System.out.println(sentence);
	}
}