/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojasorts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class BaseSortsTest {
    
    public BaseSortsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListaNumeros method, of class BaseSorts.
     */
    @Test
    public void testGetListaNumeros() {
        System.out.println("getListaNumeros");
        BaseSorts instance = new BaseSorts();
        Comparable[] expResult = null;
        Comparable[] result = instance.getListaNumeros();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaNumeros method, of class BaseSorts.
     */
    @Test
    public void testSetListaNumeros() {
        System.out.println("setListaNumeros");
        Comparable[] listaNumeros = null;
        BaseSorts instance = new BaseSorts();
        instance.setListaNumeros(listaNumeros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
