/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageProgetto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
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
 * 
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

    /**
     * @brief Inizializza il controller.
     * Viene chiamato automaticamente quando la scena viene caricata.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
        /*String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        
        BooleanBinding isEmail1 = emailField1.textProperty().isNotEmpty().and(
            new BooleanBinding(){
                
                {
                    super.bind(emailField1.textProperty());
                }
                
                @Override
                protected boolean computeValue(){
                    return (!pattern.matcher(emailField1.textProperty().get()).matches());
                }
                    
            });
        
        BooleanBinding isEmail2 = emailField2.textProperty().isNotEmpty().and(
            new BooleanBinding(){
                
                {
                    super.bind(emailField2.textProperty());
                }
                
                @Override
                protected boolean computeValue(){
                    return (!pattern.matcher(emailField2.textProperty().get()).matches());
                }
                    
            });
        
        BooleanBinding isEmail3 = emailField3.textProperty().isNotEmpty().and(
            new BooleanBinding(){
                
                {
                    super.bind(emailField3.textProperty());
                }
                
                @Override
                protected boolean computeValue(){
                    return (!pattern.matcher(emailField3.textProperty().get()).matches());
                }
                    
            });*/
        
        saveNewButton.disableProperty().bind(nameField.textProperty().isEmpty().and(surnameField.textProperty().isEmpty()));
    }    

    /**
     * @brief Metodo per salvare un nuovo contatto.
     * 
     * Acquisisce i dati dai textfield, crea un nuovo oggetto Contatto, imposta
     * i rispettivi cambi e lo aggiunge alla rubrica. Viene lanciato cliccando sul pulsante
     * "Salva".
     * 
     * @pre L'utente, dopo aver compilato almeno il campo nome o il campo cognome
     * clicca sul tasto "Salva".
     * @post Il Contatto viene salvato nella Rubrica.
     * 
     * @param event Click sul tasto "Salva"
     * 
     * @throws IOException Se ci sono problemi con l'IO.
     */
    @FXML
    private void saveNewContact(ActionEvent event) throws IOException {

        Contatto contatto = new Contatto();
        
        contatto.setNome(nameField.getText());
        contatto.setCognome(surnameField.getText());
        contatto.addNumero(numberField1.getText());
        contatto.addNumero(numberField2.getText());
        contatto.addNumero(numberField3.getText());
        contatto.addEmail(emailField1.getText());
        contatto.addEmail(emailField2.getText());
        contatto.addEmail(emailField3.getText());
        contatto.setDomicilio(addressField.getText());
        Rubrica.add(contatto);
        Rubrica.salvaFileBinario();
        Stage stage = (Stage) cancelNewButton.getScene().getWindow();
        stage.close();
    
    }

    /**
     * @brief Metodo per annullare la creazione di un nuovo contatto.
     *
     * Chiude la finestra corrente. Viene lanciato cliccando sul pulsante "Annulla".
     *
     * @pre L'utente clicca sul tasto "Annulla"
     * @post La creazione del contatto viene annullata e la finestra viene
     * chiusa
     * 
     * @param event Click sul tasto "Annulla".
     * 
     */
    @FXML
    private void cancelNewContact(ActionEvent event) {
        Stage stage = (Stage) cancelNewButton.getScene().getWindow();
        stage.close();
    }
    
}
