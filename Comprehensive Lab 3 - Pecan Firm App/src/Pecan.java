/* CS1101 â€“ Intro to Computer Science 
Instructor: Aguirre

Comprehensive Lab 3

By including my name below I confirm that:
-	I am submitting my original work.
-	If I include code obtained from another source or I received help I am giving attribution to those sources as comments.
-	This submission does not incur in any academic dishonesty practice as described in the course syllabus.


Modified and submitted by: Oswaldo Escobedo 
*/ 
import java.io.File;
import java.util.Scanner;
import java.util.*;////////////////
import java.util.ArrayList;

public class Escobedo_PecanFirm {
	
	private double sizeOfTheFirm;

		
		
	public Escobedo_PecanFirm(){
	}
	
	public Escobedo_PecanFirm(double sizeOfTheFirm){
		
		this.sizeOfTheFirm = sizeOfTheFirm;
	}
	
	public double getSize(){
		return this.sizeOfTheFirm;
	}
	
	public void setSize(double sizeOfTheFirm){
		
		this.sizeOfTheFirm = sizeOfTheFirm;
	}
	
	private static Escobedo_Pecan[] readInFile(File information) throws Exception{
		
		Scanner fileScnr = new Scanner(information);
		
		Escobedo_PecanFirm size = new Escobedo_PecanFirm();
		double sizeOfAcres = fileScnr.nextDouble();		
		size.setSize(sizeOfAcres);
		
		fileScnr.nextLine();		
		//WAY TO INCREMENT THE SIZE OF THE ARRAY?
		Escobedo_Pecan[] article = new Escobedo_Pecan[10];
		
		while(fileScnr.hasNextLine()){
			
			for(int i = 0; i < article.length; i++){
				
				String pecan = fileScnr.nextLine();
				String[] tmp = pecan.split(", ");
				article[i] = new Escobedo_Pecan(tmp[0], Integer.parseInt(tmp[1]), (tmp[2].equals("Yes") ? true: false), Integer.parseInt(tmp[3]), Double.parseDouble(tmp[4]));
			}
		}
			
		return article;
	}
	
	public static void main(String[] args) throws Exception{
		
		File inFile = new File("Information.txt");
		
		Escobedo_Pecan[] list = readInFile(inFile);
		
		//double yieldAvg = yieldPerAcre(list);
	}
	
	public static double yieldPerAcre(Escobedo_Pecan[] yield) throws Exception{
		
		int sum = 0; 
		int count = 0;
		
		System.out.println(yield[0]);
		
		for(int i = 0; i < yield.length; i++){
			
			//sum += yield.getYield();
			
			count++;
		}
		
		return sum/count;
	
	}
}