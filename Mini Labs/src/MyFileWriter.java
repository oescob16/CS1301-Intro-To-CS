// Java Program to illustrate writing a file 

import java.io.*;

public class MyFileWriter{
	public static void main(String[] args) throws Exception
	{
		//will create and write in a file named myOutputFile inside same folder as my java class
		PrintWriter pw = new PrintWriter("myOutputFile.txt");
		pw.println("Hello"); 
		pw.println("World!"); 
		pw.close();
		
		//will try to find a file and APPEND to it still creates a file 
		FileWriter fw = new FileWriter("myOutputFile.txt", true);
		PrintWriter fpw = new PrintWriter(fw);
		fpw.println("The average height of both Oswaldo and your neighbor is: 64"); 
		fpw.close();
	}
}