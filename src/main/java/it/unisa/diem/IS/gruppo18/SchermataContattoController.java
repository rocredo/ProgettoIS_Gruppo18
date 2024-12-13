/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

/**
 * @class SchermataContattoController
 * 
 * @brief Questa classe si occupa di gestire le modifiche su contatti pre
 * esistenti all'interno della rubrica. 
 * 
 * @author Gruppo18
 */
public class SchermataContattoController implements Initializable {

    @FXML
    private Button modifyButton;
    @FXML
    private Button favoriteButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Label addressLabel;
    @FXML
    private TextField addressField;
    @FXML
    private TextField emailField1;
    @FXML
    private TextField emailField2;
    @FXML
    private TextField emailField3;
    @FXML
    private TextField numberField1;
    @FXML
    private TextField numberField2;
    @FXML
    private TextField numberField3;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameField;
    @FXML
    private Label surnameLabel;
    @FXML
    private TextField surnameField;
    

    private Contatto contatto;
    private TableView<Contatto> contactTable;
    private boolean isEditing;
    
    /**
     * @brief Inizializza il controller.
     * Viene chiamato automaticamente quando la scena viene caricata.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        isEditing = false;

        modifyButton.disableProperty().bind(nameField.textProperty().isEmpty().and(surnameField.textProperty().isEmpty()));
    
        
    }    
    
    /**
     * @brief Metodo per salvare le modifiche sul Contatto.
     * 
     * @pre L'input deve essere un oggetto di classe Contatto.
     * @post Il metodo modifica gli attributi dell'oggetto ricevuto in input.
     * @param contatto Oggetto di classe Contatto da modificare.
     * @param contactTable Riferimento alla TableView.
     */
    
    public void setContact(Contatto contatto, TableView<Contatto> contactTable){
        this.contatto = contatto;
        nameField.setText(contatto.getNome());
        surnameField.setText(contatto.getCognome());
        numberField1.setText(contatto.getNumeriTelefonici().get(0));
        numberField2.setText(contatto.getNumeriTelefonici().get(1));
        numberField3.setText(contatto.getNumeriTelefonici().get(2));
        emailField1.setText(contatto.getEmail().get(0));
        emailField2.setText(contatto.getEmail().get(1));
        emailField3.setText(contatto.getEmail().get(2));
        addressField.setText(contatto.getDomicilio());
        this.contactTable = contactTable;
        if(contatto.getIsFavorite()){
            this.favoriteButton.setStyle("-fx-background-color: #FFDB58;-fx-text-fill: #282828;");
        }
        else this.favoriteButton.setStyle("-fx-background-color: transparent;");
    }
    
    /**
     * @brief Metodo per l'eliminazione di un Contatto in Rubrica.
     * @pre L'utente clicca sul tasto "Elimina".
     * @post Il contatto viene eliminato dalla Rubrica.
     * @see Rubrica.remove().
     * 
     */
    @FXML
    private void deleteContact(ActionEvent event) {
        Rubrica.remove(contatto);
        Rubrica.salvaFileBinario();
        Stage stage = (Stage) addressField.getScene().getWindow();
        stage.close();
    }
    
    /**
     * @brief Metodo per abilitare o disabilitare la modifica dei campi nome, 
     * cognome, email, telefono e domicilio. 
     * @pre L'utente clicca sul tasto Modifica
     * @post Il tasto "Modifica" cambia nome in "Salva", o viceversa, e
     * i campi contenenti le informazioni del contatto diventano modificabili,
     * o vengono congelati.
     * @param event Click sul tasto "Modifica" o "Salva".
     */
    
    @FXML
    private void modifyContact(ActionEvent event) {
       
        isEditing=!isEditing;        
        
        if(isEditing){
            modifyButton.textProperty().set("Salva");
            nameField.setEditable(true);
            surnameField.setEditable(true);
            numberField1.setEditable(true);
            numberField2.setEditable(true);
            numberField3.setEditable(true);
            emailField1.setEditable(true);
            emailField2.setEditable(true);
            emailField3.setEditable(true);
            addressField.setEditable(true);
        }else{
            modifyButton.textProperty().set("Modifica");
            nameField.setEditable(false);
            surnameField.setEditable(false);
            contatto.setNome(nameField.getText());
            contatto.setCognome(surnameField.getText());
            contatto.getNumeriTelefonici().set(0, numberField1.getText());
            contatto.getNumeriTelefonici().set(1, numberField2.getText());
            contatto.getNumeriTelefonici().set(2, numberField3.getText());
            contatto.getEmail().set(0, emailField1.getText());
            contatto.getEmail().set(1, emailField2.getText());
            contatto.getEmail().set(2, emailField3.getText());
            contatto.setDomicilio(addressField.getText());
            contactTable.setItems(Rubrica.getContactList());
            Rubrica.salvaFileBinario();
        }
    }
    
    /**
     * @brief Metodo per aggiungere o rimuovere un Contatto alla lista dei 
     * contatti preferiti.
     * @pre L'utente clicca sul tasto "Preferito".
     * @post Il tasto preferito diventa giallo ed il contatto viene aggiunto
     * alla lista dei contatti preferiti oppure il tasto diventa trasparente
     * ed il contatto viene rimosso dalla lista dei contatti preferiti.
     * @param event Click sul tasto "Preferito".
     */
    
    @FXML
    private void addToFavorite(ActionEvent event) {
        contatto.setIsfavorite();
        Rubrica.salvaFileBinario();
        if(contatto.getIsFavorite()){
            this.favoriteButton.setStyle("-fx-background-color: #FFDB58;-fx-text-fill: #282828;");
        }
        else this.favoriteButton.setStyle("-fx-background-color: transparent;");
    }

    /**
     * @brief Metodo per chiudere la finestra del contatto.
     * @pre L'utente clicca sul tasto "Esci".
     * @post La finestra del contatto viene chiusa.
     * @param event Click sul tasto "Esci".
     * 
     */
    @FXML
    private void exit(ActionEvent event) {
        Stage stage = (Stage) addressField.getScene().getWindow();
        stage.close();
    }
    
}
