package week4.Image;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//**
//  ImageDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates a the use of Image and ImageView objects.
//**

public class ImageDisplay extends Application
{
    //--------------------------------------------------------------------
    //  Displays an image centered in a window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image img = new Image("https://www.google.com/imgres?imgurl=https%3A%2F%2Fmiro.medium.com%2Fmax%2F8642%2F1*iIXOmGDzrtTJmdwbn7cGMw.png&imgrefurl=https%3A%2F%2Fmedium.com%2F%40chamikakasun%2Fhow-to-manage-multiple-java-version-in-macos-e5421345f6d0&tbnid=i-jzGelsA4KTHM&vet=12ahUKEwi-woqb7LjvAhUSqlsKHXSaB_QQMygBegUIARDXAQ..i&docid=SE7O-WypCW7icM&w=4000&h=2239&q=java&ved=2ahUKEwi-woqb7LjvAhUSqlsKHXSaB_QQMygBegUIARDXAQ");
        ImageView imgView = new ImageView(img);

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        imgView.setViewport(new Rectangle2D(200, 200, 100, 100));

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}