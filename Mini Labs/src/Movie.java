/**
 * 
 * Authors: Oswaldo Escobedo
 * Instructor: Dr. Villanueva-Rosales
 * Course: CS 1301
 * Last Modified: 04/11/2019
 *
 */
public class Movie {
	
	private String name;
	private String genre;
	private int length;
	private boolean isRatedPG;
		
	public Movie (){
	}
	
	public Movie(String name, String genre, int length, boolean isRatedPG){
		
		this.name = name;
		this.genre = genre;
		this.length = length;
		this.isRatedPG = isRatedPG;
	}
	
	public void setName(String name){
		this.name = name;	
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public int getLength(){
		return this.length;
	}

	public void printMovie(){
		
		System.out.println("\nMOVIE: " + name + " has genre " + genre + " and lasts " + length + " minutes.");
		
		if(isRatedPG){
			System.out.println("It is rated PG.");
		}
		
	}
	
	
	
}