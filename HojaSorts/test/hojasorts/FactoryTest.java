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
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSort method, of class Factory.
     */
    @Test
    public void testGetSort() {
        System.out.println("getSort");
        String entry = "1";
        Comparable[] list ={1,5,3} ;
        Factory instance = new Factory();
        BaseSorts expResult = instance.getSort(entry, list);
        BaseSorts result = instance.getSort(entry, list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
