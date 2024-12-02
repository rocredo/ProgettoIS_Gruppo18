/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mario
 */
public class Contatto{
    
    private String nome;
    private String cognome;
    private List<String> numeriTelefonici;
    private List<String> email;
    private String domicilio;
    private boolean isFavorite;
    
    public Contatto(){
        this.numeriTelefonici = new LinkedList<>();
        this.email = new LinkedList<>();
        this.isFavorite = false;
    }
    
    // =====================================
    // Metodi Getter
    // =====================================
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    
    public List getNumeriTelefonici(){
        return this.numeriTelefonici;
    }
    
    public List getEmail(){
        return this.email;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public boolean getIsFavorite(){
        return this.isFavorite;
    }

    // =====================================
    // Metodi Setter
    // =====================================
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public void setIsfavorite(boolean value){
        this.isFavorite = !isFavorite;
    }

    
}
