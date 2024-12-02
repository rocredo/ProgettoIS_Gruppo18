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

/**
 * FXML Controller class
 *
 * @author Gruppo18
 */
public class SchermataContattoController implements Initializable {

    @FXML
    private Label surnameLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label phoneLabel1;
    @FXML
    private Label phoneLabel2;
    @FXML
    private Label phoneLabel3;
    @FXML
    private Label emailLabel1;
    @FXML
    private Label emailLabel2;
    @FXML
    private Label emailLabel3;
    @FXML
    private Label addressLabel;
    @FXML
    private Button modifyButton;
    @FXML
    private Button favoriteButton;
    @FXML
    private Button exitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
