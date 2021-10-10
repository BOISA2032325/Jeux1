package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Box;
import javafx.scene.shape.CullFace;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class FenetreJeux extends MenuPrincipal{

    Stage fenetrejeux = new Stage();
    Box sols = new Box();

    public Box getSols() {
        sols.setHeight(50);
        sols.setWidth(50);
        sols.setDepth(50);
        sols.setTranslateX(100);
        sols.setTranslateY(100);
        return sols;
    }



    @Override
    public Button getJouer() {
        jouer.setOnAction(actionEvent -> {
            Group jeuxPrincipal = new Group();
            jeuxPrincipal.getChildren().addAll(getQuitterDansLeJeux(),getSols());
            fenetrejeux.setHeight(300);
            fenetrejeux.setWidth(300);
            fenetrejeux.setScene(new Scene(jeuxPrincipal));
            fenetrejeux.setTitle("jeux ouvert");
            fenetrejeux.setMaximized(true);
            fenetrejeux.show();
        });
        return super.getJouer();
    }


    public Button getQuitterDansLeJeux() {
        Button quitterDansLeJeux = new Button("Quitter");
        quitterDansLeJeux.setTranslateX(0);
        quitterDansLeJeux.setTranslateY(0);
        quitterDansLeJeux.setOnAction(actionEvent -> fenetrejeux.close());
        return quitterDansLeJeux;
    }

}
