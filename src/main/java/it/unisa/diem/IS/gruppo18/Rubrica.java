package it.unisa.diem.IS.gruppo18;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @Class Rubrica
 * @brief Modello per la gestione della rubrica.
 *
 * Si occupa della gestione dei dati relativi ai contatti della rubrica e
 * fornisce i metodi per accedervi e modificarli.
 * Implementa una "ObservableList" per consentire l'aggiornamento automatico
 * delle viste in risposta a modifiche sui dati.
 * 
 * @author Gruppo18
 */
public class Rubrica {
<<<<<<< HEAD
    
    /**
     * @var contactList
     * @brief Lista osservabile dei contatti.
     *
     * Contiene gli oggetti della classe Contatto che rappresentano i contatti della rubrica.
     */
    public static ObservableList<Contatto> contactList = FXCollections.observableArrayList();
=======

    private static ObservableList<Contatto> contactList = FXCollections.observableArrayList();
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c

    /**
     * @brief Restituisce la lista dei contatti.
     * 
     * Restituisce la lista osservabile dei contatti contenuti nella rubrica. Questo metodo
     * viene utilizzato dal controller per accedere alla lista.
     * 
     * @return ObservableList<Contatto>.
     */
    public static ObservableList<Contatto> getContactList() {
        return contactList;
    }

    /**
     * @brief Aggiunge un contatto alla rubrica.
     * 
     * Aggiunge un oggetto della classe Contatto alla lista dei contatti. 
     * Questo metodo viene chiamato dal controller per aggiornare la lista.
     * 
     * @param contatto Oggetto della classe Contatto da aggiungere alla rubrica.
     */
    public static void add(Contatto contatto){
        contactList.add(contatto);
    }
    
}