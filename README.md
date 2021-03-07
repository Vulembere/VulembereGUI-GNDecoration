# VulembereGUI-GNDecoration

Une librairie inspiré du GNDecoration https://github.com/Gleidson28/GNDecorator;  Des belle interfaces sous javaFx.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import vulembere.vulembereGUI;

/**
 *
 * @author vulembere
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            vulembereGUI stage = new vulembereGUI();
            stage.setContent(FXMLLoader.load(getClass().getResource("/GUI/GUI.fxml")));
            stage.setTitle("My App");
            stage.setResizable(true);
            stage.setMaximized(true);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

