package week4.dice;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class DicePane extends GridPane {

	public  Label input1Label, BigSmallLabel;
	private RadioButton BigButton, SmallButton;
	private ArrayList<die> dieNum = new ArrayList<die>();
	private TextField input1text;
	die Die = new die();
	private boolean isBig = false;
	
	
	int numDice = 0;
	int countBig = 0;
	int total = 0;
	public DicePane() {
		Font font = new Font(12);
		Font font2 = new Font(16);

		Label input1Label = new Label("Number Of Dice:");
		input1Label.setFont(font2);
		GridPane.setHalignment(input1Label, HPos.CENTER);
		
		Label BigSmallLabel = new Label("Big or Small:");
		BigSmallLabel.setFont(font);
		GridPane.setHalignment(BigSmallLabel, HPos.CENTER);

		input1text = new TextField();
		input1text.setFont(font2);
		input1text.setPrefWidth(100);
		input1text.setAlignment(Pos.BASELINE_CENTER);

		ToggleGroup group = new ToggleGroup();

		BigButton = new RadioButton("Big");
		BigButton.setSelected(true);
		BigButton.setToggleGroup(group);
		BigButton.setOnAction(this::processRadioButtonAction);

		SmallButton = new RadioButton("Small");
		SmallButton.setSelected(true);
		SmallButton.setToggleGroup(group);
		SmallButton.setOnAction(this::processRadioButtonAction);

		Button push = new Button("Start!");
		push.setOnAction((event) -> {
			
			String result = "";
			String result2 = "";
			numDice = Integer.parseInt(input1text.getText());
			
			for (int i = 0; i <= numDice; i++) {
				int value  = Die.roll();
				if (value>=4) {
					countBig++;
				}
				total += value;
				Label diceLabel = new Label("Die "+i+": "+value);
				add(diceLabel,0,3+i);	
			} 
			boolean bigResult = false, tie = false;
        	if (countBig == (float)(numDice+1)/2) {
        		tie = true;
        		result = "Tie!!!";
        	}
        	else  if (countBig < (numDice+1)/2){
        		bigResult = false;
        		result = "Small!!!";
        	}
        	else if (countBig > (numDice+1)/2){
        		bigResult = true;
        		result = "Big!!!";
        	}
        	
        	Label totalLabel = new Label(total + " - " + result);
        	add (totalLabel, 0, 3+numDice+1);
        	if (tie == true) {
        		result2 = "It's a tie.";
        	}
        	else if (bigResult == true && isBig == false || bigResult == false && isBig == true){
        		result2 = "You Lost :(";
        	}
        	else {
        		result2 = "You Winnnnn!!!!";
        	}
        	Label resLabel = new Label(result2);
        	add (resLabel, 0, 3+numDice+2);
		});

		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: lightgreen");
		add(input1Label, 0, 0);
		add(BigSmallLabel,0, 1);
		add(SmallButton, 2, 1);
		add(BigButton, 1, 1);
		add(input1text, 1, 0);
		add(push, 0, 2);

	}

	public void processRadioButtonAction(ActionEvent event) {
		if (BigButton.isSelected()) {
				isBig = true;
		} 
		else if (SmallButton.isSelected()) {
				isBig = false;
		}
	}
}
