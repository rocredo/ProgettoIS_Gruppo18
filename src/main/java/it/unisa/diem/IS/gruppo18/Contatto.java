/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javafx.beans.property.*;

/**
 * @class Contatto
 * @brief Classe che si occupa dela gestione dei contatti.
 *
 * La classe Contatto contiene tutte le informazioni relative a un singolo contatto.
 * Include i metodi per accedere e modificare le informazioni del contatto.
 *
 * @author Gruppo18
 */
public class Contatto implements Serializable{
    
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
    private boolean isFavorite;
    
    /**
     * @brief Costruttore di oggetti della classe Contatto.
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
    
    /**
     * @brief Ottiene il nome del contatto.
     * @return String nome.
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * @brief Ottiene il cognome del contatto.
     * @return String cognome.
     */
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * @brief Ritorna la lista dei numeri di telefono del contatto.
     */
    public List<String> getNumeriTelefonici(){
        return this.numeriTelefonici;
    }
    
    /**
     * @brief Ritorna la lista degli indirizzi email del contatto.
     */
    public List<String> getEmail(){
        return this.email;
    }
    

    /**
     * @brief Ottiene l'indirizzo di domicilio del contatto.
     * @return String domicilio.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * @brief Verifica se il contatto appartiene ai referiti.
     * @return Boolean isFavorite.
     */
    public boolean getIsFavorite(){
        return this.isFavorite;
    }
    /**
     * @Brief Ritorna il primo numero in elenco del Contatto
     * @return String PrimoNumero
     */
    public String getPrimoNumero(){
        for(String s : numeriTelefonici){
            if(!s.isEmpty()){
                return s;
            }
        }
        return "";
    }
    /**
     * @brief Ritorna la prima email in elenco del Contatto
     * @return String PrimaMail
     */
    public String getPrimaMail(){
        for(String s : email){
            if(!s.isEmpty()){
                return s;
            }
        }
        return "";
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
    

    /**
     * @brief Imposta il cognome del contatto.
     * @param cognome Cognome del contatto.
     */
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    

    /**
     * @brief Imposta l'indirizzo di domicilio del contatto.
     * @param domicilio Indirizzo di domicilio.
     */
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    /**
     * @brief Imposta o alterna lo stato di preferito del contatto.
     * Alterna lo stato `isFavorite` tra `true` e `false`.
     */
    public void setIsfavorite(){
        this.isFavorite = !isFavorite;
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
        
        sb.append(domicilio);

        sb.append("\n");
        return sb.toString();
    }
    
    /**
     * @brief Verifica l'uguaglianza tra con un altro oggetto
     * 
     * L'oggetto in input viene confrontato con l'oggetto chiamante per verificarne
     * l'uguaglianza in termini di attributi.
     * 
     * @param obj Oggetto da confrontare
     * @return boolean Esito confronto
     */
    
    @Override
    public boolean equals(Object obj){
        
        if(obj==null) return false;
        if(this==obj) return true;
        if(!(obj instanceof Contatto)) return false;
        
        Contatto tmp = (Contatto) obj;
        return this.nome.equals(tmp.getNome()) && this.cognome.equals(tmp.getCognome()) && this.numeriTelefonici.equals(tmp.getNumeriTelefonici()) && this.email.equals((tmp.getEmail()))
                && this.domicilio.equals(tmp.getDomicilio()) && (this.isFavorite == tmp.getIsFavorite());      
        
    }

    
}
