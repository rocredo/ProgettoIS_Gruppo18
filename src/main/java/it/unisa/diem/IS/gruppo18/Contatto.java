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
public class Contatto {
    
    private String nome;
    private String cognome;
    private String numeroTelefonico;
    private String email;
    private String domicilio;
    
    public Contatto(String nome, String cognome, String numeroTelefonico, String email, String domicilio){
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
        this.domicilio = domicilio;
    }
    
}
