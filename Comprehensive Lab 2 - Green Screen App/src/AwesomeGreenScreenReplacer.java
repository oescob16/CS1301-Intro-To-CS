/* CS1101 – Intro to Computer Science 
Instructor: Aguirre
Comprehensive Lab 2
By including my name below, I confirm that:
-	I am submitting my original work.
-	If I include code obtained from another source or I received help I am giving attribution to those sources as comments.
-	This submission does not incur in any academic dishonesty practice as described in the course syllabus.
Modified and submitted by: Oswaldo Escobedo 
*/ 
import java.util.Scanner;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AwesomeGreenScreenReplacer {
	public static void main(String[] args) throws Exception
	{
		Scanner scnr = new Scanner(System.in);
		
		Scanner scnrStr = new Scanner(System.in).useDelimiter("\\n");
		
		System.out.print("\n\t\tPlease type your first name: ");
		String userName = scnrStr.nextLine();
		
		System.out.println("\n\t\tWelcome to the best Green Screen Replacer, " + userName + "!");
		
		System.out.print("\n\t\tDo you want to use greenScreenPic.jpg as the file name of the green\n\t\tscreen picture? [Y/N]: ");
		
		System.out.print("\n\n\t\tInput: ");
		
		char screenOption = scnr.next().charAt(0); 
		
		//getFileGreen method is called to return either the string/name of the default green image or the user input
		String greenPic = getFileGreen(screenOption);

		//readImage method is called to convert the string into a file and then read every pixel from the file, and finally return a 2D array
		Color[][] image = readImage(greenPic);
		
		System.out.println("\n\t\tSelect which option do you want for the background image: ");
		
		System.out.println("\n\t\tA. Default image");
		System.out.println("\t\tB. Type the background Image");
		System.out.println("\t\tC. Open a folder");
		
		System.out.print("\n\t\tInput: ");
		
		char backgroundOption = scnr.next().charAt(0);	
		
		//getFileBackground method is called to return either the string/name of the default background image or the user input
		String backgroundPic = getFileBackground(backgroundOption, image, userName);
		
		//readImage method is called to convert the string into a file and then read every pixel from the file, and finally return a 2D array
		Color[][] background = readImage(backgroundPic);
		
		//replaceGreenPixels is callled to start merging the two 2D arrays, in order to create a new 2D array "a new image"
		Color[][] newImage = replaceGreenPixels(image, background);
		
		//displayImage method is called to show the merged image "the output image or final result"
		displayImage(newImage);
		
		System.out.println("\n\t\tDo you want to save the image? [Y/N]: ");
		System.out.print("\n\t\tInput: ");
		
		char saveOption = scnr.next().charAt(0);
		
		//saveNewImage method is called to let the user save the new image or not
		saveNewImage(newImage, saveOption, userName);	
	}
	
	public static String getFileGreen(char x){
		
		//useDelimiter is used to read a whole word/sentence
		Scanner scnr = new Scanner(System.in).useDelimiter("\\n");
		
		String greenImage = null;
		
		switch(x){
			case 'Y':
			case 'y':
			greenImage = "greenScreenPic.jpg";
			break;
			
			case 'N':
			case 'n':
			System.out.println("\n\t\tWrite the corresponding file name: ");			
			System.out.print("\n\t\tInput: ");
			
			greenImage = scnr.nextLine() + ".jpg"; 		
			break;		
			
			default:
			System.out.println("\n\t\tThat option is invalid. Please try again: ");			
			System.out.print("\n\t\tInput: ");
			
			char invalidOption = scnr.next().charAt(0);
			
			//getFileGreen is called recursively until the user either choses yes or no
			return getFileGreen(invalidOption);
		}
		return greenImage;
	}
	
	public static String getFileBackground(char x, Color[][] greenImg, String userName) throws Exception{
		
		//useDelimiter is used to read a whole word/sentence
		Scanner scnr = new Scanner(System.in).useDelimiter("\\n");
		
		String backgroundImage = null;
		
		switch(x){
			case 'A':
			case 'a':
			backgroundImage = "backgroundPic.jpg";
			break;
			
			case 'B':
			case 'b':
			System.out.println("\n\t\tWrite the corresponding file name: ");			
			System.out.print("\n\t\tInput: ");
			
			backgroundImage = scnr.nextLine() + ".jpg";		
			break;
			
			case 'C':
			case 'c':
			System.out.println("\n\t\tType the name of the folder: ");
			System.out.print("\n\t\tInput: ");
			
			String folderOption = scnr.nextLine();
			
			//getFilesInFolder is called to read every file in the input folder
			String[] filesInFolder = getFilesInFolder(folderOption);
			
			int index = 0;
			
			replaceGreenPixelsRecursive(greenImg, filesInFolder, index, userName);
			break;
			
			default:
			System.out.println("\n\t\tThat option is invalid. Please try again: ");			
			System.out.print("\n\t\tInput: ");
			
			char invalidOption = scnr.next().charAt(0);
			
			//getFileGreen is called recursively until the user either choses yes or no
			return getFileBackground(invalidOption, greenImg, userName);
		}
		return backgroundImage;
	}
	
	public static void saveNewImage(Color[][] newImage, char saveImgOption, String firstName){
		
		Scanner scnr = new Scanner(System.in);
		
		switch(saveImgOption){
			case 'Y':
			case 'y':
			System.out.println("\n\t\tHow would you like to name it?");
			System.out.print("\n\t\tInput: ");
			
			String nameOfImage = scnr.nextLine() + ".jpg";
			
			saveImage(newImage, nameOfImage);
			
			System.out.println("\n\t\tThanks for using AwesomeGreenScreenReplacer.java. Hope to see you soon, " + firstName + "!");
			break;
			
			case 'N':
			case 'n':
			System.out.println("\n\t\tThanks for using AwesomeGreenScreenReplacer.java. Hope to see you soon, " + firstName + "!");
			break;
		}			
	}
	/**
	 * This method receives the color values associated with a pixel.
	 * It returns true if and only if the given pixel is green
	 * 
	 * @param red	Red value of the pixel
	 * @param green	Green value of the pixel
	 * @param blue	Blue value of the pixel
	 * @return true if green; false, otherwise.
	 */
	public static boolean isGreenPixel(int red, int green, int blue){
		
		//Range to determine if a given pixel from the green Image is green, if it is then it is true
		if((green >= 200)&&(green <=255)&&(red <= 200)&&(blue <= 190)){
			return true;
		}
		
		//else if the pixel is not green then return false
		return false;
	}
	
	/**
	 * This method creates a new image where the the green pixels in greenScreenImg 
	 * are replaced with the corresponding background pixels from backgroundImg 
	 * 
	 * @param greenScreenImg 2D array that contains the pixels of a green screen image
	 * @param backgroundImg	 2D array that contains the pixels of a background image
	 * 
	 * @return Image where the green pixels from greenScreenImg were replace with the 
	 * corresponding background pixels from backgroundImg
	 */
	public static Color[][] replaceGreenPixels(Color[][] greenScreenImg , Color[][] backgroundImg){	
		
		//Declared and initialized a new 2d array in which we will store the pixels from greenScreenImg and backgroundImg, depending of the isGreenPixel method
		Color[][] newImg = new Color[868][526];
		
		for(int pixelRow = 0; pixelRow < newImg.length; pixelRow++){
			for(int pixelCol = 0; pixelCol < newImg[pixelRow].length; pixelCol++){
				
				int redValue = greenScreenImg[pixelRow][pixelCol].getRed();
				int greenValue = greenScreenImg[pixelRow][pixelCol].getGreen(); 				
				int blueValue = greenScreenImg[pixelRow][pixelCol].getBlue();
		
				//isGreenPixel method is called, it will return true only if the pixel is green.
				boolean greenPixel = isGreenPixel(redValue, greenValue, blueValue);
			
				//After checking that it is green we will store the backgroundImg pixels into the 2d array newImg
				if(greenPixel){
					newImg[pixelRow][pixelCol] = backgroundImg[pixelRow][pixelCol];
				}
				
				//Else store the greenScreenImg pixels into the 2d array newImg
				else{
					newImg[pixelRow][pixelCol] = greenScreenImg[pixelRow][pixelCol];
				}
			}
		}
				
		return newImg;
	}
    
	/**
	 * Recursive method to process multiple background images 
	 * 
	 * @param greenScreenImage
	 * @param backgroundImagesPaths
	 * @param currentIndex
	 */
	public static void replaceGreenPixelsRecursive(Color[][] greenScreenImage, String[] backgroundImagesPaths, int currentIndex, String userName) throws Exception{
		
		Scanner scnr = new Scanner(System.in);
		
		//base case to make the recursive call to stop
		if(currentIndex < 0 || currentIndex >= backgroundImagesPaths.length){
			System.exit(0);
		}
		
		Color[][] background = null;
		
		//readImage method is called to start reading every pixel in the file and then return a 2d array. Note: it will read a certain file depending in which index it is
		background = readImage(backgroundImagesPaths[currentIndex]);
		
		Color[][] newImg = replaceGreenPixels(greenScreenImage, background); 
		
		displayImage(newImg);
		
		System.out.println("\n\t\tDo you want to save the image? [Y/N]: ");
		System.out.print("\n\t\tInput: ");
		
		char saveOption = scnr.next().charAt(0);
		
		saveNewImage(newImg, saveOption, userName);
		
		replaceGreenPixelsRecursive(greenScreenImage, backgroundImagesPaths, currentIndex + 1, userName);
		
		
	}

	/**
	 * This method saves a given image to disk
	 * 
	 * @param imagePixels Image to be saved
	 * @param fileName	  Name of the file
	 */
	public static void saveImage(Color[][] imagePixels, String fileName){
		try {
		    // Convert to BufferedImage
		    BufferedImage bi = createImageFromPixelArray(imagePixels);
		    
		    //Save file
		    File outputfile = new File(fileName);
		    ImageIO.write(bi, "jpg", outputfile);
		} catch (IOException e) {
		    System.out.println("Error: " + e.toString());
		}
	}
	
	/**
	 * This method displays the imaged passed as input
	 * 
	 * @param colors Image to be displayed
	 * 
	 */
    public static void displayImage(Color[][] imagePixels){
        BufferedImage image = createImageFromPixelArray(imagePixels);
        
        ImageIcon icon=new ImageIcon(image);
        
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1280,720);
        
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    /**
     * This method reads an image given its path
     * 
     * @param filePath	The path of the image to be read
     * @return			A 2D array of pixels representing the image
     * @throws Exception Exception is thrown when the file does not exist
     */
    public static Color[][] readImage(String filePath) throws Exception {
    	File imageFile = new File(filePath);
        BufferedImage image = ImageIO.read(imageFile);
        Color[][] colors = new Color[image.getWidth()][image.getHeight()];

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                colors[x][y] = new Color(image.getRGB(x, y));
            }
        }
        return colors;
    }
    
    
    /**
     * Reads all the files in a given folder
     * 
     * @param folderPath The path to the folder
     * 
     * @return List of all files inside of the input folder
     */
    public static String[] getFilesInFolder(String folderPath){

    	ArrayList<String> fileArrayList = new ArrayList<String>();
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        fileArrayList.add(file.getAbsolutePath());
		    }
		}
		
		return fileArrayList.toArray(new String[fileArrayList.size()]);
    }
    
    /**
     * This method receives a 2D array of pixel colors and returns
     * its equivalent BufferedImage representation
     * 
     * @param imagePixels Pixel values of the image to be converted
     * 
     * @return BufferedImage representation of the input
     */
    public static BufferedImage createImageFromPixelArray(Color[][] imagePixels) {
        BufferedImage image = new BufferedImage(imagePixels.length, imagePixels[0].length, BufferedImage.TYPE_INT_RGB);
        
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                image.setRGB(x, y, imagePixels[x][y].getRGB());
            }
        }
        
        return image;
    }
    
    
}