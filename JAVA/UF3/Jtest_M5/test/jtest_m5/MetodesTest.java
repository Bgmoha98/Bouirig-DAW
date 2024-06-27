/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest_m5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohab
 */
public class MetodesTest {

    public MetodesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of contarVocals method, of class Metodes.
     */
    @Test
    public void testContarVocals() {
        System.out.println("contarVocals");
        String cadena = "";
        int expResult = 0;
        int result = Metodes.contarVocals(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        // TEST2
        String cadena1 = "Jamon";
        int expResult1 = 2;
        int result1 = Metodes.contarVocals(cadena1);
        assertEquals(expResult1, result1);
        
        // TEST3
        String cadena3 = "Rey";
        int expResult3 = 1;
        int result3 = Metodes.contarVocals(cadena3);
        assertEquals(expResult3, result3);

    }

    /**
     * Test of contarParaules method, of class Metodes.
     */
    @Test
    public void testContarParaules() {
        System.out.println("contarParaules");
        String cadena = "";
        int expResult = 0;
        int result = Metodes.contarParaules(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         // TEST2
        String cadena1 = "Jamon";
        int expResult1 = 1;
        int result1 = Metodes.contarParaules(cadena1);
        assertEquals(expResult1, result1);
        
        // TEST3
        String cadena3 = "Rey Mago";
        int expResult3 = 2;
        int result3 = Metodes.contarParaules(cadena3);
        assertEquals(expResult3, result3);
    }

}
