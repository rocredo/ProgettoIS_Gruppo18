/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @class ApplicazioneRubrica
 * 
 * @brief La classe ApplicazioneRubrica si occupa di istanziare la rubrica
 * all'avvio dell'applicazione, attraverso il metodo start().
 * 
 * @author Gruppo18
 */

public class ApplicazioneRubrica extends Application {
    
    /**
     * @brief Istanzia l'interfaccia della Rubrica.
     * 
     * Il metodo start() si occupa di istanziare l'interfaccia della 
     * rubrica su una finestra dedicata caricando eventuali file binari 
     * contenenti contatti pre esistenti.
     * 
     * @pre L'utente avvia il programma
     * @post La finestra contente la Rubrica si apre
     * 
     * @see Rubrica
     * @param stage
     * @throws IOException
     * 
     */
    
    @Override
    public void start(Stage stage) throws IOException {
        
        Rubrica.caricaFileBinario();
        
        Parent root = FXMLLoader.load(getClass().getResource("SchermataBaseView.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("DarkTheme.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @brief Main dell'applicazione.
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
