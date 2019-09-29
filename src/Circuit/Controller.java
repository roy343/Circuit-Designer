package Circuit;

import Circuit.Puertas.*;
import javafx.fxml.FXML;

import javafx.scene.layout.*;
//
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//
import javafx.scene.shape.Rectangle;


public class Controller {

    //Variables de la clase
    private double X, Y;
    @FXML
    private Pane and,nand,or,nor,not,xor,xnor;
    @FXML
    private AnchorPane Anchorpane;



    //Funcion que se encarga del moviemiento de los elementos de la ventana
    public void HandleDrag(){

        //Moviemiento de la compuerta AND
        and.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double ANDX = event.getSceneX() - X ;
            double ANDY = event.getSceneY() - Y ;
            and.relocate(event.getSceneX() + ANDX, event.getSceneY() + ANDY);

        });

        //Moviemiento de la compuerta NAND
        nand.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NANDX = event.getSceneX() - X ;
            double NANDY = event.getSceneY() - Y ;
            nand.relocate(event.getSceneX() + NANDX, event.getSceneY() + NANDY);
        });

        //Moviemiento de la compuerta OR
        or.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double ORX = event.getSceneX() - X ;
            double ORY = event.getSceneY() - Y ;
            or.relocate(event.getSceneX() + ORX, event.getSceneY() + ORY);
        });

        //Moviemiento de la compuerta NOR
        nor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NORX = event.getSceneX() - X ;
            double NORY = event.getSceneY() - Y ;
            nor.relocate(event.getSceneX() + NORX, event.getSceneY() + NORY);
        });

        //Moviemiento de la compuerta NOT
        not.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NOTX = event.getSceneX() - X ;
            double NOTY = event.getSceneY() - Y ;
            not.relocate(event.getSceneX() + NOTX, event.getSceneY() + NOTY);
        });

        //Moviemiento de la compuerta XOR
        xor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double XORX = event.getSceneX() - X ;
            double XORY = event.getSceneY() - Y ;
            xor.relocate(event.getSceneX() + XORX, event.getSceneY() + XORY);
        });

        //Moviemiento de la compuerta XNOR
        xnor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double XNORX = event.getSceneX() - X ;
            double XNORY = event.getSceneY() - Y ;
            xnor.relocate(event.getSceneX() + XNORX, event.getSceneY() + XNORY);
        });
    }


    }

