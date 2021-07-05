package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * JavaFX was designed with MVC in mind, keeping the application's data separate from the UI.
     * Because of this, we wouldn't mix the UI code with the application data in the same class.
     * The controller is sort of the middleman between the UI and the data.
     *
     * The model --> the application's data model
     * The view --> is the FXML
     * The controller --> is the code that determines what happens when a user interacts with the UI.
     *                  essentially handles events.
     *
     * JavaFX doesn't enforce the MVC pattern, but it's a good practice to implement.
     *
     * Application class comes from JavaFX, and any JavaFX project must extend this class, and this
     * will be the entry point of the project. The Application class manages the lifecycle of a JavaFX
     * application.
     *
     * The three most important methods in this Application class are the init, start, and stop method.
     * When we run the application, Application.launch will be run from the main method. This method
     * launches the JavaFX application and doesn't return until the application has exited.
     *
     * At the start of a JavaFX application the init method runs first (it is empty, and we must override
     * it to do something). Then the start method runs; we must override this class because start method
     * is abstract, and we create the UI in the start method. And when the application is finished, the
     * stop method runs.
     *
     */

    /**
     * this start method takes in a Stage parameter: Stage is a top-level JavaFX contianer that extends
     * the window class, essentially its a main window. JavaFX runtime constructs the initial stage and
     * passes it into the start method. We can create other stages but too many windows wll lead to bad
     * UX.
     *
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        /**
         * load the UI.
         * ------------
         * FXML is a flavor of XML. When we load the FXML we assign it to variable type Parent names
         * root. This parent class descends directly from the node class which is base class for
         * scene graph nodes.
         *
         * Nodes that descend from parent can have children in the scene graph.
         */
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //without using the FXML file -- creating the nodes with code
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 55));
//        root.getChildren().add(greeting);


        primaryStage.setTitle("Hello World - This is Java");
        /**
         * Each Stage requires a scene and backing each scene is a scene graph. A tree with each
         * node corresponds to a UI control or an area of the scene.
         *
         * The top level node is the GridPane - so this will be the root node of the scene graph.
         *
         * When we are constructing the scene we have to pass in the root fo the scene graph that will
         * back the scene. We also set the size of the scene - which becomes the window.
         */
        primaryStage.setScene(new Scene(root, 700, 275)); //passing that parent variable (root) to the scene
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
