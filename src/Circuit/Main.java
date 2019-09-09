package Circuit;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Circuit.fxml"));
        Platform.isImplicitExit();
        primaryStage.setTitle("Circuit Designer");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 1100, 630));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
