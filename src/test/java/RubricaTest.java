/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import it.unisa.diem.IS.gruppo18.*;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mario
 */
public class RubricaTest {
    
    private Contatto contatto;
    
    public RubricaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp(){
        contatto = new Contatto();
        contatto.setNome("Claudio");
        Rubrica.add(contatto);
    }
    
    @AfterEach
    public void tearDown() {
        Rubrica.getContactList().clear();
    }

    /**
     * Test of getContactList method, of class Rubrica.
     */
    @Test
    public void testGetContactList(){
        ObservableList<Contatto> contactList = Rubrica.getContactList();
        assertNotNull(contactList);
        assertEquals(1, contactList.size());
    }

    /**
     * Test of add method, of class Rubrica.
     */
    @Test
    public void testAdd() {
        Contatto contatto2 = new Contatto();
        contatto2.setNome("Massimo");
        Rubrica.add(contatto2);
        assertTrue(Rubrica.getContactList().contains(contatto2));
    }

    /**
     * Test of remove method, of class Rubrica.
     */
    @Test
    public void testRemove() {
        Rubrica.remove(contatto);
        assertFalse(Rubrica.getContactList().contains(contatto));   
    }
    
    /**
     * Test of caricaFileBinario method, of class Rubrica.
     */
    @Test
    public void testCaricaFileBinario() {
        Rubrica.salvaFileBinario();
        Rubrica.getContactList().clear();
        Rubrica.caricaFileBinario();
        assertEquals(1, Rubrica.getContactList().size());
        assertEquals(contatto,Rubrica.getContactList().get(0));
    }
    
}
