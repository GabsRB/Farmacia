package com.mycompany;

import com.mycompany.Banco;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image; 
import java.io.IOException;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class Principal extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MenuPrincipal"));
        stage.setTitle("Menu Principal");
        stage.getIcons().add(new Image("image/IconMenu (2).png"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
       launch();
        /*try {
            System.out.println("Conectando ...");
            Banco.conectar();
            System.out.println("Conectado ...");
            Banco.desconectar();
            System.out.println("Desconectado...");
        }
        catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }*/
    }

}