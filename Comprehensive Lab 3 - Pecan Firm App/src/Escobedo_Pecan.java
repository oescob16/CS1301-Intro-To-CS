/* CS1101 â€“ Intro to Computer Science 
Instructor: Aguirre OR Akbar OR Villanueva [LEAVE ONLY ONE]

Comprehensive Lab 3

By including my name below I confirm that:
-	I am submitting my original work.
-	If I include code obtained from another source or I received help I am giving attribution to those sources as comments.
-	This submission does not incur in any academic dishonesty practice as described in the course syllabus.


Modified and submitted by: [Oswaldo Escobedo] 
*/ 

public class Escobedo_Pecan {
	//TODO: Follow the PDF
	//Change the name of the file and class accordingly
	
	private String ID;
	private int year;
	private boolean condition;
	private int spread;
	private double yield;
		
	public Escobedo_Pecan(){
	}
	
	public Escobedo_Pecan(String ID, int year, boolean condition, int spread, double yield){
		
		this.ID = ID;
		this.year = year;
		this.condition = condition;
		this.spread = spread;
		this.yield = yield;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public boolean getCondition(){
		return this.condition;
	}
	
	public int getSpread(){
		return this.spread;
	}
	
	public double getYield(){
		return this.yield;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setCondition(boolean condition){
		this.condition = condition;
	}
	
	public void setSpread(int spread){
		this.spread = spread;
	}
	
	public void setYield(double yield){
		this.yield = yield;
	}
	
	public boolean needsPruning(){
		
		//if this condition is true then the tree needs to be prunned
		return this.spread > 80;
	}
	
	public String toString(){
		
		String IDStr = "ID: " + ID + " ";
		String ageStr = "Age: " + year + " ";
		String conditionStr = "Healthy? " + condition + " ";
		String spreadStr = "Spread: " + spread + " ";
		String yieldStr = "Yield: "+ yield + " ";
		String newLine = "\n";
		
		return IDStr + ageStr + conditionStr + spreadStr + yieldStr + newLine;
	}	
}