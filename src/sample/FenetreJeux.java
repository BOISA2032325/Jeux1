package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;

public class FenetreJeux extends MenuPrincipal{

    Stage fenetrejeux = new Stage();

    public ImageView getImageViewSol() throws MalformedURLException {

        File file = new File("C:/ImagePourMonJeux/Gravier.jpg");
        String localUrl = file.toURI().toURL().toString();
        Image imageTerre = new Image(localUrl);
        return new ImageView(imageTerre);
    }

    public ImageView getImageGrass() throws  MalformedURLException{

        File fileGrass = new File("C:/ImagePourMonJeux/Grass2.jpg");
        String localUrlGrass = fileGrass.toURI().toURL().toString();
        Image imageGrass = new Image(localUrlGrass);
        return new ImageView(imageGrass);
    }

    public Group getBordureDesChemin() throws MalformedURLException {

        Group bordureDesChemin = new Group();

        //Bordure du bas1
        Rectangle bordureDuBas1 = new Rectangle();
        bordureDuBas1.setWidth(300);
        bordureDuBas1.setHeight(300);
        bordureDuBas1.setTranslateX(0);
        bordureDuBas1.setTranslateY(200);
        bordureDuBas1.setFill(new ImagePattern(getImageGrass().getImage()));

        //Bordure Du haut1
        Rectangle bordureDuHaut1 = new Rectangle();
        bordureDuHaut1.setHeight(100);
        bordureDuHaut1.setWidth(300);
        bordureDuHaut1.setTranslateX(0);
        bordureDuHaut1.setTranslateY(0);
        bordureDuHaut1.setFill(new ImagePattern(getImageGrass().getImage()));

        //Bordure du bas2
        Rectangle bordureDuBas2 = new Rectangle();
        bordureDuBas2.setWidth(300);
        bordureDuBas2.setHeight(200);
        bordureDuBas2.setTranslateX(0);
        bordureDuBas2.setTranslateY(600);
        bordureDuBas2.setFill(new ImagePattern(getImageGrass().getImage()));




        bordureDesChemin.getChildren().addAll(bordureDuBas1,bordureDuHaut1,bordureDuBas2);
        return bordureDesChemin;

    }

    @Override
    public Button getJouer() {
        jouer.setOnAction(actionEvent -> {
            Group jeuxPrincipal = new Group();
            try {
                jeuxPrincipal.getChildren().addAll(getBordureDesChemin(),getQuitterDansLeJeux());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            try {
                fenetrejeux.getScene().setFill(new ImagePattern(getImageViewSol().getImage()));
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
