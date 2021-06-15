package week4.dice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Rundice extends Application {


    public void start(Stage primaryStage) {
        Scene scene = new Scene(new DicePane(), 500, 500);

        primaryStage.setTitle("Dice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}