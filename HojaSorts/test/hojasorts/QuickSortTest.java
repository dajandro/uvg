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
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of quicksort method, of class QuickSort.
     */
    @Test
    public void testQuicksort() {
        System.out.println("quicksort");
        Comparable[] numeros = null;
        int izq = 0;
        int der = 0;
        QuickSort instance = null;
        instance.quicksort(numeros, izq, der);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class QuickSort.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        Comparable[] data = null;
        int i = 0;
        int j = 0;
        QuickSort instance = null;
        instance.swap(data, i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
