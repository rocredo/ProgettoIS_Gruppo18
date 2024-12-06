/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @class CreazioneContattoController
 * @brief Controller per l'interfaccia di creazione di un nuovo contatto.
 *
 * Gestisce l'interfaccia utente e la logica per l'aggiunta di un nuovo contatto.
 * Include il metodo per acquisire i dati dall'interfaccia di creazione contatto
 * per creare un nuovo contatto da salvare nella lista osservabile di Rubrica.
 * 
 * @author Gruppo18
 */
public class CreazioneContattoController implements Initializable {

    @FXML
    private TextField surnameField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField numberField1;
    @FXML
    private TextField numberField2;
    @FXML
    private TextField numberField3;
    @FXML
    private TextField emailField1;
    @FXML
    private TextField emailField2;
    @FXML
    private TextField emailField3;
    @FXML
    private TextField addressField;
    @FXML
    private Button saveNewButton;
    @FXML
    private Button cancelNewButton;
    
    private Rubrica rubrica;

    /**
     * @brief Inizializza il controller.
     * Viene chiamato automaticamente quando la scena viene caricata.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        rubrica = new Rubrica();
    }    

    /**
     * @brief Metodo per salvare un nuovo contatto.
     * 
     * Acquisisce i dati dai campi dei textfield, crea un nuovo oggetto Contatto, imposta
     * i rispettivi cambi e lo aggiunge alla rubrica. Viene lanciato cliccando sul pulsante
     * "Salva".
     * 
     * @throws IOException Se ci sono problemi con l'IO.
     */
    @FXML
    private void saveNewContact(ActionEvent event) throws IOException {

        Contatto contatto = new Contatto();
        /*tmp.getNome().set(nameField.getText());
        tmp.setCognome(surnameField.textProperty());
        tmp.setDomicilio(addressField.textProperty());
        tmp.getNumeriTelefonici().add(numberField1.textProperty());
        tmp.getEmail().add(emailField1.textProperty());*/
        contatto.setNome(nameField.getText());
        rubrica.add(contatto);
        Stage stage = (Stage) cancelNewButton.getScene().getWindow();
        stage.close();
    
    }

    /**
     * @brief Metodo per annullare la creazione di un nuovo contatto.
     *
     * Chiude la finestra corrente. Viene lanciato cliccando sul pulsante "Annulla".
     *
     */
    @FXML
    private void cancelNewContact(ActionEvent event) {
        Stage stage = (Stage) cancelNewButton.getScene().getWindow();
        stage.close();
    }
    
}
