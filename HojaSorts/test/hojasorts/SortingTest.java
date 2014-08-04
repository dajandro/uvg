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
public class SortingTest {
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of selectionSort method, of class Sorting.
     */
    @Test
    public void testSelectionSort() {
        System.out.println("selectionSort");
        Comparable[] list = {1,2,3};
        Sorting.selectionSort(list);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        Comparable[] list = {1,2,3};
        Sorting.bubbleSort(list);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of insertionSortDescendente method, of class Sorting.
     */
    @Test
    public void testInsertionSortDescendente() {
        System.out.println("insertionSortDescendente");
        Comparable[] list = {1,2,3};
        Sorting.insertionSortDescendente(list);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertionSortAscendente method, of class Sorting.
     */
    @Test
    public void testInsertionSortAscendente() {
        System.out.println("insertionSortAscendente");
        Comparable[] list = {1,2,3};
        Sorting.insertionSortAscendente(list);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of MergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        Comparable[] list = {1,2,3};
        Sorting.MergeSort(list);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
