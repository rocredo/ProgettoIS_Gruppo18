/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.IS.gruppo18;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author mario
 */
public class Rubrica {

    public static ObservableList<Contatto> contactList = FXCollections.observableArrayList();

    public static ObservableList<Contatto> getContactList() {
        return contactList;
    }

    public static void add(Contatto contatto){
        contactList.add(contatto);
    }
    
}