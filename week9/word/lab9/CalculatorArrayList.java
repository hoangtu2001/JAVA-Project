package week9.word.lab9;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

import java.io.IOException;
import java.util.ArrayList;
 


public class CalculatorArrayList extends HBox
{
	private ArrayList<Calculator> CalculatorList =  new ArrayList<Calculator>();
	private ArrayList<RadioButton> Calculator_option = new ArrayList<RadioButton>();	
    private Text calc_output, calc_output2, calc_output3, calc_output4, calc_output5;
  

    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and radio buttons that
    //  determine which phrase is displayed.
    //--------------------------------------------------------------------
    public CalculatorArrayList() throws IOException
    {
    	CalculatorList = CalculatorRetriever.Get_Calculator();  	
      
        
    	calc_output = new Text("Addition: " + CalculatorList.get(0).Addition());
    	calc_output.setFont(new Font("Helvetica", 18));
    	calc_output2 = new Text("Subtraction: "+ CalculatorList.get(0).Subtraction());
    	calc_output2.setFont(new Font("Helvetica", 18));
    	calc_output3 = new Text("Multiplication: "+ CalculatorList.get(0).Multiplication());
    	calc_output3.setFont(new Font("Helvetica", 18));
    	calc_output4 = new Text("Division: "+ CalculatorList.get(0).Division());
    	calc_output4.setFont(new Font("Helvetica", 18));
    	calc_output5 = new Text("Remainder: "+ CalculatorList.get(0).Remainder());
    	calc_output5.setFont(new Font("Helvetica", 18));
    	
        VBox table = new VBox();
        
        table.getChildren().add(calc_output);
        table.getChildren().add(calc_output2);
        table.getChildren().add(calc_output3);
        table.getChildren().add(calc_output4);
        table.getChildren().add(calc_output5);
        table.setAlignment(Pos.CENTER_LEFT);
        table.setSpacing(10);
     
        
        
        ToggleGroup group = new ToggleGroup();
        
        
        for (int i=0; i < CalculatorList.size(); i++)
        {        	
        	if (CalculatorList.get(i) instanceof ScientificCalculator)
        		Calculator_option.add(new RadioButton("Scientific Calculator "+ i));
        	else
        		Calculator_option.add(new RadioButton("Calculator "+ i));
        	if (i==0)
        		Calculator_option.get(i).setSelected(true);
        	Calculator_option.get(i).setToggleGroup(group);
        	Calculator_option.get(i).setOnAction(this::processRadioButtonAction);
        }
               
        
        VBox options = new VBox();
        for (int i=0; i < CalculatorList.size(); i++)
        {
        	options.getChildren().add(Calculator_option.get(i));        	
        }
        
        
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);
        
        setSpacing(20);
        getChildren().addAll(options, table);  
    }
    public void processRadioButtonAction(ActionEvent event)
    {
    	for (int i=0; i < CalculatorList.size(); i++)
    	{
    		if (Calculator_option.get(i).isSelected())
    		{
    			if (CalculatorList.get(i) instanceof ScientificCalculator)
    			{
    				// child casting
    				ScientificCalculator casting_ScientificCalculator = (ScientificCalculator) CalculatorList.get(i);
    				calc_output.setText("Addition: " + casting_ScientificCalculator.Addition() + "\n" + "Pow: " + casting_ScientificCalculator.Pow());
    				calc_output2.setText("Subtraction: " + casting_ScientificCalculator.Subtraction() + "\n" + "Logarit: " + String.format("%.2f",casting_ScientificCalculator.input1_logarit()));
    				calc_output3.setText("Multiplication: " + casting_ScientificCalculator.Multiplication() + "\n" + "SQRT: " + String.format("%.2f",casting_ScientificCalculator.input1_Sqrt()));
    				calc_output4.setText("Division: " + String.format("%.2f", casting_ScientificCalculator.Division()) + "\n" + "Absolute: " + String.format("%.2f",casting_ScientificCalculator.input1_Abs()));
    				calc_output5.setText("Remainder: " + casting_ScientificCalculator.Remainder());
    			}
            	else {
            		calc_output.setText("Addition: " + CalculatorList.get(i).Addition());
    				calc_output2.setText("Subtraction: " + CalculatorList.get(i).Subtraction());
    				calc_output3.setText("Multiplication: " + CalculatorList.get(i).Multiplication());
    				calc_output4.setText("Division: " + String.format("%.2f",CalculatorList.get(i).Division()));
    				calc_output5.setText("Remainder: " + CalculatorList.get(i).Remainder());
            	}
    		}
    	}        
    }
}