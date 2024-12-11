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
    
    /**
     * @var contactList
     * @brief Lista osservabile dei contatti.
     *
     * Contiene gli oggetti della classe Contatto che rappresentano i contatti della rubrica.
     */
    private static ObservableList<Contatto> contactList = FXCollections.observableArrayList();
    
    public Rubrica(){
    }

    /**
     * @brief Restituisce la lista dei contatti.
     * 
     * Restituisce la lista osservabile dei contatti contenuti nella rubrica. Questo metodo
     * viene utilizzato dal controller per accedere alla lista.
     * 
     * @return ObservableList<Contatto>.
     */
    public ObservableList<Contatto> getContactList() {
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
    public void add(Contatto contatto){
        contactList.add(contatto);
    }
    
    public static void salvaFileBinario(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bin"))){
            List<Contatto> tmp = new LinkedList<>(contactList);
            oos.writeObject(tmp);
        }
        catch(IOException e){
            System.err.println("Errore nel salvataggio del file serializzato!\n");
        }
    }
    
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