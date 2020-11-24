package sample;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(10);
        circle.setStroke(Color.BLACK); // Set circle stroke color
        circle.setStrokeWidth(5);
        circle.setFill(Color.RED);

        Circle circle2 = new Circle();
        circle2.setCenterX(30);
        circle2.setCenterY(30);
        circle2.setRadius(10);
        circle2.setStroke(Color.BLACK); // Set circle stroke color
        circle2.setStrokeWidth(5);
        circle2.setFill(Color.CORNFLOWERBLUE);


        // Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(circle2);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}