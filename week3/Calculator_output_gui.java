package week3;

import week2.Calculator;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator_output_gui extends Application
{
    //--------------------------------------------------------------------
    //  Creates and displays two Text objects in a JavaFX window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
    	Random generator = new Random();
    	int num1, num2;
    	num1 = generator.nextInt(11);
    	num2 = generator.nextInt(11);
    	
        Calculator.Set_Input1(num1);
        Calculator.Set_Input2(num2);

        Text hello = new Text(40, 40, "Your two random numbers are: " + Calculator.Get_Input1()+" and "
        + Calculator.Get_Input2());
        Text hello1 = new Text(40, 60, "Calculator is running...");
        Text question = new Text(55, 80, "Addition: "+ Calculator.Addition());
        Text question1 = new Text(55, 95, "Subtraction: "+ Calculator.Subtraction());
        Text question2 = new Text(55, 110, "Division: "+ Calculator.Division());
        Text question3 = new Text(55, 125, "Multiplication: "+ Calculator.Multiplication());
        Text question4 = new Text(55, 140, "Remainder: "+ Calculator.Remainder());

        Group root = new Group(hello,hello1, question, question1, question2, question3, question4);
        Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //--------------------------------------------------------------------
    //  Launches the JavaFX application. This method is not required
    //  in IDEs that launch JavaFX applications automatically.
    //--------------------------------------------------------------------
    public static void main(String[] args)
    {
        launch(args);
    }
}