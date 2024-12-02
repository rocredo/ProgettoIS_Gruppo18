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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gruppo18
 */
public class SchermataBaseController {

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
    @FXML
    private TableView<Contatto> contactTable;
    @FXML
    private TableColumn<Contatto, String> nameColumn;
    @FXML
    private TableColumn<Contatto, String> surnameColumn;
    @FXML
    private TableColumn<Contatto, String> numberColumn;
    @FXML
    private TableColumn<Contatto, String> emailColumn;
    @FXML
    private TableColumn<Contatto, String> addressColumn;

    private ObservableList<Contatto> contactList;
    /**
     * Initializes the controller class.
     */
    /*@Override
    public void initialize(URL url, ResourceBundle rb) {
        
        contactList = FXCollections.observableArrayList();
        contactTable.setItems(contactList);
        
        nameColumn.setCellValueFactory(new PropertyValueFactory("nome")); /////////
        surnameColumn.setCellValueFactory(new PropertyValueFactory("cognome"));
        numberColumn.setCellValueFactory(new PropertyValueFactory("numeroTelefonico"));
        emailColumn.setCellValueFactory(new PropertyValueFactory("email"));
        addressColumn.setCellValueFactory(new PropertyValueFactory("domicilio"));
        
        contactTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 2) { // Doppio clic
            Contatto selectedContact = contactTable.getSelectionModel().getSelectedItem();
            if (selectedContact != null) {
                openContactDetailWindow(selectedContact);
            }
        }
    });
    }*/

    /*DA MODIFICARE
    private void openContactDetailWindow(Contatto contact) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ContactDetail.fxml"));
        Parent root = loader.load();

        // Passa i dati al controller della finestra di dettaglio
        ContactDetailController controller = loader.getController();
        controller.setContact(contact);

        // Configura e mostra la finestra
        Stage stage = new Stage();
        stage.setTitle("Dettagli Contatto");
        stage.setScene(new Scene(root));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}*/


    @FXML
    private void aggiungiContatto(ActionEvent event) {
        /**/
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