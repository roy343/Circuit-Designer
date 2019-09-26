package Circuit;

import Circuit.Puertas.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Controller {

    //Variables de la clase
    double X, Y;
    @FXML
    private Rectangle and;
    @FXML
    AnchorPane right_pane;


    public void initialize(){
        and.setOnMousePressed(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        and.setOnMouseDragged(event -> {
            System.out.println("Draging");
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println(X);
            System.out.println(Y);



        });
    }


    }

