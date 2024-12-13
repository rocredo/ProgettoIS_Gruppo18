package it.unisa.diem.IS.gruppo18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @class Rubrica
 * @brief Classe che si occupa della gestione della rubrica.
 *
 * Si occupa della gestione dei dati relativi ai contatti della rubrica e
 * fornisce i metodi per accedervi e modificarli.
 * Implementa una "ObservableList" per consentire l'aggiornamento automatico
 * delle viste in risposta a modifiche sui dati.
 * 
 * @author Gruppo18
 */
public class Rubrica {
    
    /**
     * @var contactList
     * @brief Lista osservabile dei contatti.
     *
     * Contiene gli oggetti della classe Contatto che rappresentano i contatti della rubrica.
     */
    private static ObservableList<Contatto> contactList = FXCollections.observableArrayList();
    
    /**
     * @brief Ritorna la lista dei contatti.
     * 
     * Restituisce la lista osservabile dei contatti contenuti nella rubrica. Questo metodo
     * viene utilizzato dal controller per accedere alla lista.
     * 
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
     * @pre Input: Oggetto di classe Contatto.
     * @post L'oggetto di classe Contatto viene aggiunto alla Rubrica.
     * 
     * @param contatto Oggetto della classe Contatto da aggiungere alla rubrica.
     */
    public static void add(Contatto contatto){
        contactList.add(contatto);
    }
    
    /**
     * @brief Rimuove un contatto dalla rubrica.
     * 
     * Rimuove un oggetto di classe Contatto dalla lista dei contatti. 
     * Questo metodo viene chiamato dal controller per aggiornare la lista.
     * 
     * @pre Input: Oggetto di classe Contatto presente nella Rubrica.
     * @post L'oggetto di classe Contatto viene eliminato dalla Rubrica.
     * 
     * @param contatto Oggetto della classe Contatto da rimuovere dalla rubrica.
     */
    public static void remove(Contatto contatto){
        contactList.remove(contatto);
    }
    
    /**
     * @brief Salva il file bin
     * 
     * Salva un file binario ricaricabile al successivo avvio dell'applicazione
     * in modo da visualizzare gli stessi contatti presenti al momento della
     * chiusura.
     * 
     */
    public static void salvaFileBinario(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bin"))){
            List<Contatto> tmp = new LinkedList<>(contactList);
            oos.writeObject(tmp);
        }
        catch(IOException e){
            System.err.println("Errore nel salvataggio del file serializzato!\n");
        }
    }
    
    /**
     * @brief Carica il file bin
     * 
     * Carica un file binario in modo da visualizzare gli stessi contatti 
     * presenti al momento della precedente chiusura dell'applicazione.
     * 
     * @pre Il file bin esiste e si trova nel path corretto.
     * @post L'interfaccia della Rubrica si apre con all'interno dei contatti
     * pre caricati.
     * 
     */
    
    public static void caricaFileBinario(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bin"))){
            ObservableList tmp = FXCollections.observableArrayList((List<Contatto>) ois.readObject());
            contactList = tmp;
        }
        catch(IOException e){
            System.err.println("Errore nel caricamento del file serializzato!\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rubrica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}