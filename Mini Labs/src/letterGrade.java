import java.util.Scanner;

public class letterGrade{
	public static void main(String[] args){

	Scanner scnr = new Scanner(System.in);
	
	int numericGrade = scnr.nextInt();
	char letterGrade;
	
	if((numericGrade >= 0) && (numericGrade <= 60)){
		letterGrade = 'F';
		System.out.println(letterGrade);
	}
	if((numericGrade >= 60) && (numericGrade < 70)){
		letterGrade = 'D';
		System.out.println(letterGrade);
	}
	if((numericGrade >= 70) && (numericGrade < 80)){
		letterGrade = 'C';
		System.out.println(letterGrade);
	}
	if((numericGrade >= 80) && (numericGrade < 90)){
		letterGrade = 'B';
		System.out.println(letterGrade);
	}
	if((numericGrade >= 90) && (numericGrade <= 100)){
		letterGrade = 'A';
		System.out.println(letterGrade);
	}

}
}