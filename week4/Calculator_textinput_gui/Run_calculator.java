package week4.Calculator_textinput_gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Run_calculator extends Application
{
    //--------------------------------------------------------------------
    //  Launches the temperature converter application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new Calculator_textinput_gui(), 400, 400);

        primaryStage.setTitle("Calculator ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}