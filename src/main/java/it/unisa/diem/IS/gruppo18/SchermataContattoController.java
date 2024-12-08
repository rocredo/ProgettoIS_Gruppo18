/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rubrica = new Rubrica();
        // TODO
    }    

    
    @FXML
    private void deleteContact(ActionEvent event) {
        //rubrica.getContactList().remove();
    }
    
    @FXML
    private void modifyContact(ActionEvent event) {
    }

    @FXML
    private void addToFavorite(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
    }
    
}
