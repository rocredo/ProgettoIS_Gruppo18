/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

/**
 *
 * @author mario
 */
public class Contatto implements Comparable<Contatto>{
    
    private String nome;
    private String cognome;
    private String numeroTelefonico;
    private String email;
    private String domicilio;
    private boolean isFavorite;
    
    public Contatto(String nome, String cognome, String numeroTelefonico, String email, String domicilio){
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
        this.domicilio = domicilio;
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
    
    public String getNumeroTelefonico(){
        return this.numeroTelefonico;
    }
    
    public String getEmail(){
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
    
    public void setNumeroTelefonico(String numero){
        this.numeroTelefonico = numero;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public void setIsfavorite(boolean value){
        this.isFavorite = value;
    }
    
    @Override
    public int compareTo(Contatto o) {
        return this.nome.compareTo(o.getNome());
    }

    
}
