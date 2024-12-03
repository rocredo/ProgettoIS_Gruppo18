/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.io.IOException;
import java.net.URL;
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

/**
 * FXML Controller class
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

    private ObservableList<Contatto> contactList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contactList = FXCollections.observableArrayList();
    }    

    @FXML
    private void saveNewContact(ActionEvent event) throws IOException {
        
        Contatto tmp = new Contatto();
        System.out.println(nameField.getText());
        tmp.setNome(nameField.getText());
        
        contactList.add(tmp);
        
        
    }
    
    public void setList(ObservableList<Contatto> list){
        this.contactList = list;
    }

    @FXML
    private void cancelNewContact(ActionEvent event) {
    }
    
}
