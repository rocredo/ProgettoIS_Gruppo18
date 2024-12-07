/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import com.sun.corba.se.pept.transport.ContactInfoList;
import java.io.File;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * @class SchermataBaseController
 * @brief Controller per la schermata principale della rubrica.
 *
 * La classe collega i componenti dell'interfaccia grafica ai relativi metodi.
 * Gestisce la tabella dei contatti, l'aggiunta di nuovi contatti e il filtraggio
 * per preferiti.
 * 
 * @author Gruppo18
 */
public class SchermataBaseController implements Initializable{

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
    private Button refresh;
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
    
    private boolean showingFavorite;
    private Rubrica rubrica;

    /**
     * @brief Inizializza il controller e configura la tabella dei contatti.
     *
     * Imposta le proprietà delle colonne della tabella per collegarle
     * agli attributi della classe Contatto. Carica la lista dei contatti
     * nella tabella.
     */
    public void initialize(URL url, ResourceBundle rb) {
        
        showingFavorite = false;
        rubrica = new Rubrica();
        
        nameColumn.setCellValueFactory(new PropertyValueFactory("nome")); /////////
        surnameColumn.setCellValueFactory(new PropertyValueFactory("cognome"));
        numberColumn.setCellValueFactory(new PropertyValueFactory("numeroTelefonico1"));
        emailColumn.setCellValueFactory(new PropertyValueFactory("email1"));
        addressColumn.setCellValueFactory(new PropertyValueFactory("domicilio"));
        
        //nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        contactTable.setItems(rubrica.getContactList());
        
        /*contactTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 2) { // Doppio clic
            Contatto selectedContact = contactTable.getSelectionModel().getSelectedItem();
            if (selectedContact != null) {
                openContactDetailWindow(selectedContact);
            }
        }
        });*/
    }


    /**
     * @brief Apre una nuova finestra per aggiungere un contatto.
     *
     * Carica l'interfaccia grafica e apre una finestra per la creazione di un nuovo contatto
     *
     * @param event Click sul pulsante "Aggiungi".
     * @throws IOException Se si verifica un errore durante il caricamento del file FXML.
     */
    @FXML
    private void addContact(ActionEvent event) throws IOException {
        
        Contatto contatto1 = new Contatto();
        contatto1.setNome("pippo");
        Contatto contatto2 = new Contatto();
        contatto2.setNome("gino");
        contatto2.setIsfavorite();
        contactTable.getItems().add(contatto1);
        contactTable.getItems().add(contatto2);
        
        
        // Crea un FXMLLoader per caricare l'FXML e ottenere il controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CreazioneContattoView.fxml"));
        Parent root = loader.load(); // Carica l'FXML
        // Ottieni il controller associato
        /*CreazioneContattoController controller = loader.getController();
        controller.setList(contactList); //Se non va settata quindi, quando va ?*/

        //Crea e mostra la nuova finestra
        Scene scene = new Scene(root);
        Stage CreazioneContatto = new Stage();
        CreazioneContatto.setTitle("Creazione Contatto");
        CreazioneContatto.setScene(scene);
        CreazioneContatto.show();
       
    }

    /**
     * @brief Salva la lista dei contatti in un file CSV.
     *
     * Salva i contatti della rubrica in un file CSV. Ogni contatto viene
     * scritto in una riga con i suoi attributi separati da un ";". Viene
     * lanciato cliccando sul pulsante "Scarica".
     *
     */
    @FXML
    private void downloadContacts(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File file = fc.showSaveDialog(searchBox.getParent().getScene().getWindow());
        
    }

    /**
     * @brief Carica i contatti nella lista a partire da un file CSV.
     *
     * Carica dei contatti nella rubrica a partire da un file CSV. Viene lanciato
     * cliccando sul pulsante "Carica".
     *
     */
    @FXML
    private void uploadContacts(ActionEvent event) {
    }

    /**
     * @brief Metodo per visualizzare i contatti preferiti.
     *
     * Mostra la lista dei contatti preferiti. Viene lanciato cliccando sul pulsante
     * "Mostra preferiti".
     *
     */
    @FXML
    private void showFavorite(ActionEvent event) {
        
        if(!showingFavorite){
            ObservableList<Contatto> tmp = FXCollections.observableArrayList();
            contactTable.setItems(tmp);
            for(Contatto c : contactTable.getItems()){
                if(c.getIsFavorite()){
                    tmp.add(c);
                }
            }
            showingFavorite=!showingFavorite;
        }
        
        contactTable.setItems(rubrica.getContactList());
        showingFavorite=!showingFavorite;
        
    }
    
    @FXML
    private void updateName(TableColumn.CellEditEvent<Contatto,String> event){
        Contatto c = contactTable.getSelectionModel().getSelectedItem();
        c.setNome(event.getNewValue());
    }
}