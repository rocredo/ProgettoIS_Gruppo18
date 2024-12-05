/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

/**
 *
 * @author Mario
 */
public class ContattoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contatto contatto = new Contatto();
        contatto.setNome("mario");
        contatto.setCognome("rossi");
        contatto.addNumero("333444555");
        contatto.addNumero("3456789");
        
        System.out.println(contatto.toString());
    }
    
}
