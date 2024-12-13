/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageProgetto;

import java.util.List;
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
public class ContattoTest {
    
    private Contatto contatto;
    
    public ContattoTest() {
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
    }
    
    @After
    public void tearDown(){
        
    }

    /**
     * Test of getNome method, of class Contatto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        contatto.setNome("Claudio");
        assertEquals("Claudio", contatto.getNome());
    }

    /**
     * Test of getCognome method, of class Contatto.
     */
    @Test
    public void testGetCognome() {
        System.out.println("getCognome");
        contatto.setCognome("Bisio");
        assertEquals("Bisio", contatto.getCognome());
    }

    /**
     * Test of getNumeriTelefonici method, of class Contatto.
     */
    @Test
    public void testGetNumeriTelefonici() {
        System.out.println("getNumeriTelefonici");
        List<String> list = contatto.getNumeriTelefonici();
        assertEquals(list, contatto.getNumeriTelefonici());
    }

    /**
     * Test of getEmail method, of class Contatto.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        List<String> list = contatto.getEmail();
        assertEquals(list, contatto.getEmail());
    }

    /**
     * Test of getDomicilio method, of class Contatto.
     */
    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        contatto.setDomicilio("Via Appia");
        assertEquals("Via Appia", contatto.getDomicilio());
    }

    /**
     * Test of getIsFavorite method, of class Contatto.
     */
    @Test
    public void testGetIsFavorite() {
        System.out.println("getIsFavorite");
        assertFalse(contatto.getIsFavorite());
        contatto.setIsfavorite();
        assertTrue(contatto.getIsFavorite());
    }

    /**
     * Test of getPrimoNumero method, of class Contatto.
     */
    @Test
    public void testGetPrimoNumero() {
        System.out.println("getPrimoNumero");
        contatto.addNumero("3334445555");
        contatto.addNumero("6667778888");
        assertEquals("3334445555", contatto.getPrimoNumero());
    }

    /**
     * Test of getPrimaMail method, of class Contatto.
     */
    @Test
    public void testGetPrimaMail() {
        System.out.println("getPrimaMail");
        contatto.addEmail("mail1@esempio.com");
        contatto.addEmail("mail2@esempio.com");
        assertEquals("mail1@esempio.com", contatto.getPrimaMail());
    }

    /**
     * Test of setNome method, of class Contatto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        contatto.setNome("Claudio");
        assertEquals("Claudio", contatto.getNome());
    }

    /**
     * Test of setCognome method, of class Contatto.
     */
    @Test
    public void testSetCognome(){
        System.out.println("setCognome");
        contatto.setCognome("Bisio");
        assertEquals("Bisio", contatto.getCognome());
    }

    /**
     * Test of setDomicilio method, of class Contatto.
     */
    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        contatto.setDomicilio("Via Appia");
        assertEquals("Via Appia", contatto.getDomicilio());
    }

    /**
     * Test of setIsfavorite method, of class Contatto.
     */
    @Test
    public void testSetIsfavorite() {
        System.out.println("setIsfavorite");
        contatto.setIsfavorite();
        assertTrue(contatto.getIsFavorite());
    }

    /**
     * Test of addNumero method, of class Contatto.
     */
    @Test
    public void testAddNumero() {
        System.out.println("addNumero");
        contatto.addNumero("3334445555");
        assertTrue(contatto.getNumeriTelefonici().contains("3334445555"));
    }

    /**
     * Test of addEmail method, of class Contatto.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        contatto.addEmail("mail@esempio.it");
        assertTrue(contatto.getEmail().contains("mail@esempio.it"));
    }

    /**
     * Test of toString method, of class Contatto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        contatto.setNome("Claudio");
        contatto.setCognome("Bisio");
        contatto.setDomicilio("Via Appia");
        contatto.addNumero("3334445555");
        contatto.addEmail("mail@esempio.it");
        String tmp = "Claudio;Bisio;3334445555;;;mail@esempio.it;;;Via Appia\n";
        assertEquals(tmp, contatto.toString());
    }

    /**
     * Test of equals method, of class Contatto.
     */
    @Test
    public void testEquals(){
        System.out.println("equals");
        contatto.setNome("Claudio");
        contatto.setCognome("Bisio");
        contatto.setDomicilio("Via Appia");
        contatto.addNumero("3334445555");
        contatto.addEmail("mail@esempio.it");
        
        Contatto contatto2 = new Contatto();
        contatto2.setNome("Claudio");
        contatto2.setCognome("Bisio");
        contatto2.setDomicilio("Via Appia");
        contatto2.addNumero("3334445555");
        contatto2.addEmail("mail@esempio.it");
        assertTrue(contatto.equals(contatto2));
        
        contatto2.setNome("Massimo");
        assertFalse(contatto.equals(contatto2));
    }
    
}
