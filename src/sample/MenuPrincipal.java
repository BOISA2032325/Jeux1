package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MenuPrincipal {


    Stage premierStage = new Stage();
    Button quitter = new Button("Quitter");
    Button jouer = new Button("Jouer");
    Label titre = new Label("Tower Defend");

    public Button getJouer() {
        jouer.setTranslateY(200);
        jouer.setTranslateX(200);
        jouer.setScaleY(2);
        jouer.setScaleX(2);
        return jouer;
    }


    public Button getQuitter() {
        quitter.setTranslateY(275);
        quitter.setTranslateX(200);
        quitter.setScaleX(2);
        quitter.setScaleY(2);
        quitter.setOnAction(actionEvent -> {
            premierStage.close();
        });
        return quitter;
    }

    public Stage getPremierStage() {
        return premierStage;
    }

    public Label getTitre() {
        titre.setScaleY(4);
        titre.setScaleX(4);
        titre.setTranslateY(100);
        titre.setTranslateX(200);
        return titre;
    }
}
