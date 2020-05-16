public class BMI{
	public static void main(String []args){
	Scanner scnr = new Scanner(System.in);

	Double weightInPounds = scnr.nextDouble();
	Double heightInInches = scnr.nextDouble();
	Double BMI = 0;
	
	BMI = (weight * 703) / (height * height);
	
	System.out.print("Your BMI is: " + BMI);
	}
}