/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.util.LinkedList;
import java.util.List;
import javafx.beans.property.*;

/**
 * @class Contatto
 * @brief Modello per la gestione dei contatti.
 *
 * La classe Contatto contiene tutte le informazioni relative a un singolo contatto.
 * Include i metodi per accedere e modificare le informazioni del contatto..
 *
 * @author Gruppo18
 */
public class Contatto{
    
<<<<<<< HEAD
    /**
     * @var nome
     * @brief Nome del contatto.
     */
    private String nome;
    /**
     * @var cognome
     * @brief Cognome del contatto.
     */
    private String cognome;
    /**
     * @var numeriTelefonici
     * @brief Lista dei numeri di telefono del contatto.
     */
    private List<String> numeriTelefonici;
    /**
     * @var email
     * @brief Lista degli indirizzi email del contatto.
     */
    private List<String> email;
    /**
     * @var domicilio
     * @brief Indirizzo di domicilio del contatto.
     */
    private String domicilio;
    /**
     * @var isFavorite
     * @brief Variabile che indica se il contatto appartiene ai preferiti.
     */
=======
    private String nome;
    private String cognome;
    private List<Property> numeriTelefonici;
    private List<Property> email;
    private String domicilio;
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    private boolean isFavorite;
    
    /**
     * @brief Costruttore di default della classe Contatto.
     *
     * Inizializza i campi numeriTelefonici e email come liste vuote
     * e imposta la variabile isFavorite a false.
     */
    public Contatto(){
        this.numeriTelefonici = new LinkedList<>();
        this.email = new LinkedList<>();
        this.isFavorite = false;
    }
    
    // =====================================
    // Metodi Getter
    // =====================================
    
<<<<<<< HEAD
    /**
     * @brief Ottiene il nome del contatto.
     * @return String nome.
     */
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    public String getNome(){
        return this.nome;
    }
    
<<<<<<< HEAD
    /**
     * @brief Ottiene il cognome del contatto.
     * @return String cognome.
     */
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * @brief Ottiene la lista dei numeri di telefono del contatto.
     * @return List<String> numeriTelefonici.
     */
    public List getNumeriTelefonici(){
        return this.numeriTelefonici;
    }
    
    /**
     * @brief Ottiene la lista degli indirizzi email del contatto.
     * @return List<String> email.
     */
    public List getEmail(){
        return this.email;
    }
    
<<<<<<< HEAD
    /**
     * @brief Ottiene l'indirizzo di domicilio del contatto.
     * @return String domicilio.
     */
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    public String getDomicilio(){
        return this.domicilio;
    }
    
<<<<<<< HEAD
    /**
     * @brief Verifica se il contatto appartiene ai referiti.
     * @return Boolean isFavorite.
     */
    public Boolean getIsFavorite(){
=======
    public boolean getIsFavorite(){
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
        return this.isFavorite;
    }

    // =====================================
    // Metodi Setter
    // =====================================
    
    /**
     * @brief Imposta il nome del contatto.
     * @param nome Nome del contatto.
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
<<<<<<< HEAD
    /**
     * @brief Imposta il cognome del contatto.
     * @param cognome Cognome del contatto.
     */
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
<<<<<<< HEAD
    /**
     * @brief Imposta l'indirizzo di domicilio del contatto.
     * @param domicilio Indirizzo di domicilio.
     */
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    /**
     * @brief Imposta o alterna lo stato di preferito del contatto.
     * Alterna lo stato `isFavorite` tra `true` e `false`.
     */
    public void setIsfavorite(){
        this.isFavorite = !isFavorite;
<<<<<<< HEAD
    }
    
    /**
     * @brief Aggiunge un numero alla lista dei numeri telefonici.
     * @param numero Nuovo numero di telefono.
     */
    public void addNumero(String numero){
        this.numeriTelefonici.add(numero);
    }
    
    /**
     * @brief Aggiunge un indirizzo e-mail alla lista degli indirizzi e-mail.
     * @param email Nuovo indirizzo e-mail.
     */
    public void addEmail(String email){
        this.email.add(email);
    }
    
    /**
     * @brief Restituisce una rappresentazione in formato stringa del contatto.
     *
     * Restituisce il contatto sotto forma di stringa secondo un formato specifico
     * che separa ogni attributo con un ";". La stringa include il nome, il cognome, i numeri di telefono,
     * gli indirizzi email e l'indirizzo di domicilio del contatto.
     * Se alcuni dei dati sono assenti, verranno aggiunti degli spazi vuoti per
     * mantenere la formattazione consistente.
     * 
     *
     * @return Una stringa contenente i dettagli del contatto, separati da `;`.
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(nome);
        sb.append(";");
        sb.append(cognome);
        sb.append(";");
        
        int i = 0;
        int j;
        for(String s : numeriTelefonici){
            sb.append(s);
            sb.append(";");
            i++;
        }
        if(i<3){
            for(j=0;j<(3-i);j++){
                sb.append("");
                sb.append(";");
            }
        }
        
        i=0;
        for(String s : email){
            sb.append(s);
            sb.append(";");
            i++;
        }
        if(i<3){
            for(j=0;j<(3-i);j++){
                sb.append("");
                sb.append(";");
            }
        }
        
        if(domicilio!=null){
        sb.append(domicilio);
        }
        else sb.append("");
        
        sb.append("\n");
        return sb.toString();
=======
>>>>>>> 1e38d6a6a80c4b356f2f603f86dc6b9f7ea7fd5c
    }

    
}
