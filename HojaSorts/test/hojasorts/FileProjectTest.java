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
public class FileProjectTest {
    
    public FileProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CrearArchivo method, of class FileProject.
     */
    @Test
    public void testCrearArchivo() {
        System.out.println("CrearArchivo");
        Comparable[] numerosGenerados = null;
        FileProject instance = new FileProject();
        instance.CrearArchivo(numerosGenerados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LeerArchivo method, of class FileProject.
     */
    @Test
    public void testLeerArchivo() {
        System.out.println("LeerArchivo");
        FileProject instance = new FileProject();
        Comparable[] expResult = null;
        Comparable[] result = instance.LeerArchivo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearArchivoOrdenado method, of class FileProject.
     */
    @Test
    public void testCrearArchivoOrdenado() {
        System.out.println("CrearArchivoOrdenado");
        Comparable[] numerosGenerados = null;
        FileProject instance = new FileProject();
        instance.CrearArchivoOrdenado(numerosGenerados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
