package week6.TriagleRotation;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;
public class RoratedTriangle extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException, AWTException
    {
    	String image_filePath = "C:\\Users\\Hoang Tu Huynh\\eclipse-workspace\\CSCI145\\src\\week6\\TriagleRotation\\ImageOutput.jpg";
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Please enter your height: ");
	    int height = scan.nextInt();
        
	    Triangle.triangleSnapshot(image_filePath, height);
	    
        Image img = new Image("week6\\TriagleRotation\\ImageOutput.jpg");
        ImageView imgView1 = new ImageView(img);
        imgView1.setRotate(45);
        imgView1.setX(100);
        imgView1.setY(100);
        
        Group root = new Group(imgView1);
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Transformation Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}