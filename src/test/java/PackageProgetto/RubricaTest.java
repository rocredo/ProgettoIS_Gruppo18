/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageProgetto;

import javafx.collections.ObservableList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gruppo18
 */
public class RubricaTest {
    
    private Contatto contatto;
    
    public RubricaTest() {
    }
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
        contatto = new Contatto();
        contatto.setNome("Claudio");
        contatto.setCognome("Bisio");
        contatto.setDomicilio("Via Appia");
        contatto.addNumero("3334445555");
        contatto.addEmail("mail@esempio.it");
        Rubrica.clear();
    }
    
    @After
    public void tearDown(){
        Rubrica.clear();
    }

    /**
     * Test of getContactList method, of class Rubrica.
     */
    @Test
    public void testGetContactList() {
        System.out.println("getContactList");
        assertNotNull(Rubrica.getContactList());
        assertTrue(Rubrica.getContactList().isEmpty());
    }

    /**
     * Test of add method, of class Rubrica.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Rubrica.add(contatto);
        assertTrue(Rubrica.getContactList().contains(contatto));
        assertEquals(1, Rubrica.getContactList().size());
    }

    /**
     * Test of remove method, of class Rubrica.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Rubrica.add(contatto);
        Rubrica.remove(contatto);
        assertFalse(Rubrica.getContactList().contains(contatto));
        assertTrue(Rubrica.getContactList().isEmpty());
    }

    /**
     * Test of caricaFileBinario method, of class Rubrica.
     */
    @Test
    public void testCaricaFileBinario() {
        System.out.println("caricaFileBinario");
        Rubrica.add(contatto);
        Rubrica.salvaFileBinario();
        Rubrica.clear();
        assertTrue(Rubrica.getContactList().isEmpty());
        
        Rubrica.caricaFileBinario();
        assertEquals(1, Rubrica.getContactList().size());
        assertTrue(Rubrica.getContactList().contains(contatto));
    }
    
}
