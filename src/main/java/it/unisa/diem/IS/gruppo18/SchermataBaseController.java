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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mario
 */
public class SchermataBaseController implements Initializable {

    @FXML
    private TextField searchBox;
    @FXML
    private Button addButton;
    @FXML
    private Button downloadButton;
    @FXML
    private Button uploadButton;
    @FXML
    private Button showFavoriteButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aggiungiContatto(ActionEvent event) {
    }

    @FXML
    private void scaricaContatti(ActionEvent event) {
    }

    @FXML
    private void caricaContatti(ActionEvent event) {
    }

    @FXML
    private void showFavorite(ActionEvent event) {
    }
    
}
