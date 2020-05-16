import java.util.Scanner;

public class vowels{
public static void main(String [] args)
{  
  
   Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine(); 

        System.out.print("Number of  Vowels in the string: " + countVowels(str)+"\n");
}
  
  public static int countVowels(String str)
  {
  int vowelCount = 0;


   for (int i = 0; i < str.length(); i++)
   {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
          vowelCount++;
      }
   }


   return vowelCount;
}
}