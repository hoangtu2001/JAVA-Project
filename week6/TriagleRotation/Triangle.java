package week6.TriagleRotation;
import java.util.Scanner;

import javax.imageio.ImageIO;

import java.awt.Rectangle;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Triangle
{
	final static int CONSOLE_OUTPUT_X = 460;
	final static int CONSOLE_OUTPUT_y = 865;
	private static int height = 0;
	public static void main(String[] args) throws IOException, AWTException
	{
		String image_filePath = "C:\\Users\\Hoang Tu Huynh\\eclipse-workspace\\CSCI145\\src\\week6\\TriagleRotation\\ImageOutput.jpg";
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Please enter your height: ");
	    height = scan.nextInt();
	    scan.close();
	    triangleSnapshot(image_filePath, height);
	}
	public static void triangleSnapshot(String image_output, int triangle_Height) throws IOException, AWTException {
		draw_triangle(triangle_Height);
		File image_file = new File (image_output);
		
		Rectangle rect = new Rectangle(CONSOLE_OUTPUT_X,CONSOLE_OUTPUT_y,35*triangle_Height,35*triangle_Height);
		BufferedImage capture = new Robot().createScreenCapture(rect);
		ImageIO.write(capture, "jpg", image_file);
	}
	public static void draw_triangle(int triangle_Height) {
		 for (int row = 1; row <= triangle_Height; row++)
		    {
		        for (int star = 1; star <= row; star++)
		            System.out.print("* ");
		        System.out.println();
		    }
	}
}