package week4.Calculator_textinput_gui;

import week2.Calculator;


import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;


public class Calculator_textinput_gui extends GridPane
{
    public Label input1Label, input2Label;
    private Label AdditionLabel, SubtractionLabel, DivisionLabel, MultiplicationLabel, RemainderLabel;
    private TextField input1Text, input2Text;
    


    public Calculator_textinput_gui()
    {
        Font font = new Font(15);    
        AdditionLabel = new Label ("");
        SubtractionLabel = new Label ("");
        DivisionLabel = new Label ("");
        MultiplicationLabel = new Label ("");
        RemainderLabel = new Label ("");
        
        Label input1Label = new Label("Input1:");
        input1Label.setFont(font);
        GridPane.setHalignment(input1Label, HPos.RIGHT);
        
        Label input2Label = new Label("input2:");
        input2Label.setFont(font);
        GridPane.setHalignment(input2Label, HPos.RIGHT);             
        
        input1Text = new TextField();
        input1Text.setFont(font);
        input1Text.setPrefWidth(40);
        input1Text.setAlignment(Pos.CENTER);
        
        input2Text = new TextField();
        input2Text.setFont(font);
        input2Text.setPrefWidth(60);
        input2Text.setAlignment(Pos.CENTER);
        
        Button push = new Button("Calculate!");
        push.setOnAction((event) -> {        
        	new Calculator(Integer.parseInt(input1Text.getText()), Integer.parseInt(input2Text.getText())); 
        	AdditionLabel.setText("Addition: "+Calculator.Addition());
        	SubtractionLabel.setText("Subtraction: "+ Calculator.Subtraction());
        	DivisionLabel.setText("Division: "+ String.format("%.2f",Calculator.Division()));
        	MultiplicationLabel.setText("Multiplication: "+ Calculator.Multiplication());
        	RemainderLabel.setText("Remainder: "+ Calculator.Remainder());
        });
        
       
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: pink");
        
        add(input1Label, 0, 0);
        add(input1Text, 1, 0);
        add(input2Label, 0, 1);
        add(input2Text, 1, 1);
        add(push, 0, 2);
        add(AdditionLabel,1,3);
        add(SubtractionLabel,1,4);
        add(DivisionLabel,1,5);
        add(MultiplicationLabel,1,6);
        add(RemainderLabel,1,7);
        
    }    
  
}