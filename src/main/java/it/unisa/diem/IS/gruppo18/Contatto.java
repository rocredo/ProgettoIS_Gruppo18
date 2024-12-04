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
 *
 * @author Gruppo18
 */
public class Contatto{
    
    private StringProperty nome;
    private StringProperty cognome;
    private List<StringProperty> numeriTelefonici;
    private List<StringProperty> email;
    private StringProperty domicilio;
    private BooleanProperty isFavorite;
    
    public Contatto(){
        this.nome = new SimpleStringProperty();
        /*this.cognome = new SimpleStringProperty();
        this.numeriTelefonici = new LinkedList<>();
        this.email = new LinkedList<>();
        this.domicilio = new SimpleStringProperty();
        this.isFavorite = new SimpleBooleanProperty(false);*/
    }
    
    // =====================================
    // Metodi Getter
    // =====================================
    
    public StringProperty getNome(){
        return this.nome;
    }
    
    public StringProperty getCognome(){
        return this.cognome;
    }
    
    public List getNumeriTelefonici(){
        return this.numeriTelefonici;
    }
    
    public List getEmail(){
        return this.email;
    }
    
    public StringProperty getDomicilio(){
        return this.domicilio;
    }
    
    public BooleanProperty getIsFavorite(){
        return this.isFavorite;
    }

    // =====================================
    // Metodi Setter
    // =====================================
    
    public void setNome(String nome){
        this.nome.set(nome);
    }
    
    public void setCognome(StringProperty cognome){
        this.cognome = cognome;
    }
    
    public void setDomicilio(StringProperty domicilio){
        this.domicilio = domicilio;
    }
    
    public void setIsfavorite(){
        this.isFavorite.set(!isFavorite.get());
    }

    
}
