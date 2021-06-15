package week8.lab;
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import week5.Calculator_ArrayList.Calculator;

public class CalculatorDropBox extends Application
{
	private ChoiceBox<String> choice;
    private AudioClip[] tunes;
    private AudioClip current;
    private Calculator currentCalculator;
    private Label currentOutputLabel = new Label("");
    private Label currentOutputLabel2 = new Label("");
    private Label currentOutputLabel3 = new Label("");
    private Label currentOutputLabel4 = new Label("");
    private Label currentOutputLabel5 = new Label("");
    private Button playButton, stopButton;
    private Calculator[] calculatorList = {new Calculator(3,4), new Calculator(4,5), new Calculator(5,6), new Calculator(6,7), 
    		new Calculator(3,5), new Calculator(3,6), new Calculator(5,10), new Calculator(7,9)};
    

    public void start(Stage primaryStage)
    {

        String path = "C:\\Users\\Hoang Tu Huynh\\eclipse-workspace\\CSCI145\\src\\week8\\JukeBox\\";
        File[] audioFiles = {new File(path + "westernBeat.wav"),
           new File(path +"classical.wav"), new File(path +"jeopardy.mp3"),
           new File(path +"eightiesJam.wav"), new File(path +"newAgeRythm.wav"),
           new File(path +"lullaby.mp3"), new File(path +"hitchcock.wav")};
        
        tunes = new AudioClip[audioFiles.length];
        for (int i = 0; i < audioFiles.length; i++)
            tunes[i] = new AudioClip(audioFiles[i].toURI().toString());
        
        current = tunes[0];
    	currentCalculator = calculatorList[0];
        
        Label label = new Label("Select a calculator:");
        
        choice = new ChoiceBox<String>();
        for (int i = 0; i < calculatorList.length; i++)
        	choice.getItems().add("Calculator ("+ calculatorList[i].Get_Input1() +", "+ calculatorList[i].Get_Input2()+")" );
        
        choice.getSelectionModel().selectFirst();
        choice.setOnAction(this::processChoice);
        
        playButton = new Button("Run");
        stopButton = new Button("Stop");
        HBox buttons = new HBox(playButton);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(15, 0, 0, 0));
        buttons.setAlignment(Pos.CENTER);
        
        HBox buttons2 = new HBox(stopButton);
        buttons2.setSpacing(10);
        buttons2.setPadding(new Insets(15, 0, 0, 0));
        buttons2.setAlignment(Pos.CENTER);
        
        playButton.setOnAction(this::processButtonPush);
        stopButton.setOnAction(this::processButtonPush);
                    
        VBox root = new VBox(label, choice, buttons, buttons2, currentOutputLabel, 
        	currentOutputLabel2, currentOutputLabel3, currentOutputLabel4, currentOutputLabel5);
        root.setPadding(new Insets(15, 15, 15, 25));
        root.setSpacing(10);
        root.setStyle("-fx-background-color: pink");
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Calculator Dropdown List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void processChoice(ActionEvent event)
    {
        current.stop();
        current = tunes[choice.getSelectionModel().getSelectedIndex()];
        currentCalculator = calculatorList[choice.getSelectionModel().getSelectedIndex()];
    }

  
    public void processButtonPush(ActionEvent event)
    {
        current.stop();
        
        if (event.getSource() == playButton) 
            current.play();
        currentOutputLabel.setText("Addition: "+ currentCalculator.Addition());
        currentOutputLabel2.setText("Subtraction: "+ currentCalculator.Subtraction());
        currentOutputLabel3.setText("Multiplication: "+ currentCalculator.Multiplication());
        currentOutputLabel4.setText("Division: "+ currentCalculator.Division());
        currentOutputLabel5.setText("Remainder: "+ currentCalculator.Remainder());
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}