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
    double X, Y;
    @FXML
    public Pane and,nand,or,nor,not,xor,xnor;

    @FXML
    AnchorPane Anchorpane;




    public void HandleDrag(){

        and.setOnMousePressed(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        and.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double ANDX = event.getSceneX() - X ;
            double ANDY = event.getSceneY() - Y ;
            and.relocate(event.getSceneX() + ANDX, event.getSceneY() + ANDY);
        });

        nand.setOnMousePressed(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        nand.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NANDX = event.getSceneX() - X ;
            double NANDY = event.getSceneY() - Y ;
            nand.relocate(event.getSceneX() + NANDX, event.getSceneY() + NANDY);
        });

        or.setOnMousePressed(event ->{
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        or.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double ORX = event.getSceneX() - X ;
            double ORY = event.getSceneY() - Y ;
            or.relocate(event.getSceneX() + ORX, event.getSceneY() + ORY);
        });

        nor.setOnMousePressed(event ->{
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        nor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NORX = event.getSceneX() - X ;
            double NORY = event.getSceneY() - Y ;
            nor.relocate(event.getSceneX() + NORX, event.getSceneY() + NORY);
        });

        not.setOnMousePressed(event ->{
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        not.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double NOTX = event.getSceneX() - X ;
            double NOTY = event.getSceneY() - Y ;
            not.relocate(event.getSceneX() + NOTX, event.getSceneY() + NOTY);
        });

        xor.setOnMousePressed(event ->{
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        xor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double XORX = event.getSceneX() - X ;
            double XORY = event.getSceneY() - Y ;
            xor.relocate(event.getSceneX() + XORX, event.getSceneY() + XORY);
        });

        xnor.setOnMousePressed(event ->{
            X = event.getSceneX();
            Y = event.getSceneY();
            System.out.println("X =" + X);
            System.out.println("Y =" + Y);
        });
        xnor.setOnMouseDragged(event -> {
            X = event.getSceneX();
            Y = event.getSceneY();
            double XNORX = event.getSceneX() - X ;
            double XNORY = event.getSceneY() - Y ;
            xnor.relocate(event.getSceneX() + XNORX, event.getSceneY() + XNORY);
        });
    }


    }

