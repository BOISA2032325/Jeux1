package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;

public class FenetreJeux extends MenuPrincipal{

    Stage fenetrejeux = new Stage();

    public ImageView getImageViewSol() throws MalformedURLException {

        File file = new File("C:/ImagePourMonJeux/Terre.jpg");
        String localUrl = file.toURI().toURL().toString();
        Image imageTerre = new Image(localUrl);
        return new ImageView(imageTerre);
    }

    @Override
    public Button getJouer() {
        jouer.setOnAction(actionEvent -> {
            Group jeuxPrincipal = new Group();
            try {
                jeuxPrincipal.getChildren().addAll(getImageViewSol(),getQuitterDansLeJeux());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            fenetrejeux.setScene(new Scene(jeuxPrincipal));
            fenetrejeux.setTitle("jeux ouvert");
            fenetrejeux.setMaximized(true);
            fenetrejeux.show();
        });
        return super.getJouer();
    }


    public Button getQuitterDansLeJeux() {
        Button quitterDansLeJeux = new Button("Quitter");
        quitterDansLeJeux.setTextFill(Color.BLACK);
        quitterDansLeJeux.setTranslateX(0);
        quitterDansLeJeux.setTranslateY(0);
        quitterDansLeJeux.setOnAction(actionEvent -> fenetrejeux.close());
        return quitterDansLeJeux;
    }

}
