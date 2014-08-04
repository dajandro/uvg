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
public class NodoTest {
    
    public NodoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setValor method, of class Nodo.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        Nodo instance = new Nodo();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguiente method, of class Nodo.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        Nodo siguiente = null;
        Nodo instance = new Nodo();
        instance.setSiguiente(siguiente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Nodo.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Nodo instance = new Nodo();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class Nodo.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Nodo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Nodo instance = new Nodo();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Nodo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object other = null;
        Nodo instance = new Nodo();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Nodo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nodo instance = new Nodo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
