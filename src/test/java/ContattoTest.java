/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import it.unisa.diem.IS.gruppo18.Contatto;
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
public class ContattoTest {
    
    /*@BeforeEach
    public void setUp() {
        contatto = new Contatto();
    }
    
    @AfterEach
    public void tearDown() {
        contatto = null;
    }*/
    
    @Test
    public void testSetNome(){
        Contatto contatto = new Contatto();
        contatto.setNome("Claudio");
        assertEquals("Claudio", contatto.getNome());
    }
    
    @Test
    public void testSetCognome(){
        Contatto contatto = new Contatto();
        contatto.setCognome("Bisio");
        assertEquals("Bisio", contatto.getCognome());
    }
    
    @Test
    public void testAddNumero(){
        Contatto contatto = new Contatto();
        contatto.addNumero("3334445555");
        assertTrue(contatto.getNumeriTelefonici().contains("3334445555"));
    }

    @Test
    public void testAddEmail(){
        Contatto contatto = new Contatto();
        contatto.addEmail("mail@esempio.unisa.it");
        assertTrue(contatto.getEmail().contains("mail@esempio.unisa.it"));
    }
    
    @Test
    public void testSetDomicilio(){
        Contatto contatto = new Contatto();
        contatto.setDomicilio("Via Appia");
        assertEquals("Via Appia",contatto.getDomicilio());
    }
    
    @Test
    public void testToString(){
        Contatto contatto = new Contatto();
        contatto.setNome("Claudio");
        contatto.setCognome("Bisio");
        contatto.addNumero("3334445555");
        contatto.addEmail("mail@esempio.unisa.it");
        contatto.setDomicilio("Via Appia");
        String rigaCSV = "Claudio;Bisio;3334445555;;;mail@esempio.unisa.it;;;Via Appia\n";
        assertEquals(rigaCSV,contatto.toString());
    }
    
    @Test
    public void testEquals(){
        Contatto contatto1 = new Contatto();
        contatto1.setNome("Claudio");
        contatto1.setCognome("Bisio");
        contatto1.addNumero("3334445555");
        contatto1.addEmail("mail@esempio.unisa.it");
        contatto1.setDomicilio("Via Appia");
        Contatto contatto2 = new Contatto();
        contatto2.setNome("Claudio");
        contatto2.setCognome("Bisio");
        contatto2.addNumero("3334445555");
        contatto2.addEmail("mail@esempio.unisa.it");
        contatto2.setDomicilio("Via Appia");
        assertTrue(contatto1.equals(contatto2));
    }
    
}
