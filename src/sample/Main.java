package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group menu = new Group();
        FenetreJeux fenetreJeux = new FenetreJeux();
        primaryStage.setTitle("Tower Defend");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        MenuPrincipal menuPrincipal = new MenuPrincipal();


        do {

            //Menu Principal

            menu.getChildren().addAll(fenetreJeux.getJouer(),menuPrincipal.getQuitter(),menuPrincipal.getTitre());
            menuPrincipal.premierStage = primaryStage;
            primaryStage.setScene(new Scene(menu));
            primaryStage.show();


        }while (menuPrincipal.quitter.equals(true));


    }


    public static void main(String[] args) {
        launch(args);
    }
}
