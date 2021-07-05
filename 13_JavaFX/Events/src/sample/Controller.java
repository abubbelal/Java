package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML //we must annotate this field to be part of the fxml
    private TextField nameField; //this variable name must match the textfield fx id name we provided
    @FXML
    private Button helloBtn;
    @FXML
    private Button byeBtn;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        helloBtn.setDisable(true);
        byeBtn.setDisable(true);
    }

    @FXML //this annotation isn't required but it's helpful to differentiate the event handlers
    public void onButtonClicked(ActionEvent e) {
//        System.out.println(e);
//        System.out.println("Hello, " + nameField.getText());
//        System.out.println("The following button was pressed: " + e.getSource());

        if(e.getSource().equals(helloBtn)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (e.getSource().equals(byeBtn)) {
            System.out.println("Bye, " + nameField.getText());
        }

        /**
         * scene graphs are not thread-safe. It assumes that nodes in the scene graph will only ever be updated
         * by the same thread, mainly the UI thread (JavaFX application thread) so if more than one thread could
         * update the node it would be bad for the personal integrity of the node.
         *
         * If you want to work with nodes on the scene graph, you actually must do so it on the JavaFX application
         * thread. If you don't use this thread on a scene graph it will result in an exception error.
         *
         * To go around this, when there are a lot of tasks running in the background thread. You update a part of
         * the UI when the tasks finish, so force code to run on the UI thread and JavaFX will allow this.
         *
         * The run later method will accept a runnable (an interface that classes implement when their instances will
         * be executed on a thread) parameter that will pass onto the UI threads queue forcing the runnable object
         * to run on the UI thread.
         *
         * The is FX application thread method is useful and returns true when the code is running on the JavaFX
         * application thread, false otherwise. Very useful when trying to debug the code.
         */

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: " + s);

                    Thread.sleep(10000);

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm updating the label on the: " + s);
                            ourLabel.setText("We did something");
                        }
                    });
                }catch(InterruptedException event) {
                    //we dont care about this
                }
            }
        };

        new Thread(task).start();

        if(ourCheckBox.isSelected()) {
            nameField.clear();
            helloBtn.setDisable(true);
            byeBtn.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disabledBtn = text.isEmpty() | text.trim().isEmpty();
        helloBtn.setDisable(disabledBtn);
        byeBtn.setDisable(disabledBtn);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }

}
