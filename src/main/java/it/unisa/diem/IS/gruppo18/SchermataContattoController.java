/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
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
    
    private Rubrica rubrica;
    private Contatto contatto;
    private TableView<Contatto> contactTable;
    private boolean isEditing;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isEditing = false;
        rubrica = new Rubrica();
        
        modifyButton.disableProperty().bind(nameField.textProperty().isEmpty().and(surnameField.textProperty().isEmpty()));
        /*favoriteButton.styleProperty()*/
        
    }    

    public void setContact(Contatto contatto, TableView<Contatto> contactTable){
        this.contatto = contatto;
        nameField.setText(contatto.getNome().get());
        surnameField.setText(contatto.getCognome());
        numberField1.setText(contatto.getNumeriTelefonici().get(0));
        numberField2.setText(contatto.getNumeriTelefonici().get(1));
        numberField3.setText(contatto.getNumeriTelefonici().get(2));
        emailField1.setText(contatto.getEmail().get(0));
        emailField2.setText(contatto.getEmail().get(1));
        emailField3.setText(contatto.getEmail().get(2));
        addressField.setText(contatto.getDomicilio());
        this.contactTable = contactTable;
    }
    
    @FXML
    private void deleteContact(ActionEvent event) {
        rubrica.getContactList().remove(contatto);
    }
    
    @FXML
    private void modifyContact(ActionEvent event) {
       
        isEditing=!isEditing;        
        
        if(isEditing){
            modifyButton.textProperty().set("Salva");
            nameField.setEditable(true);
            surnameField.setEditable(true);
        }else{
            modifyButton.textProperty().set("Modifica");
            nameField.setEditable(false);
            surnameField.setEditable(false);
            contatto.setNome(nameField.getText());
            contatto.setCognome(surnameField.getText());
            contactTable.setItems(rubrica.getContactList());
        }
    }

    @FXML
    private void addToFavorite(ActionEvent event) {
        contatto.setIsfavorite();
    }

    @FXML
    private void exit(ActionEvent event) {
         Stage stage = (Stage) addressField.getScene().getWindow();
        stage.close();
    }
    
}
