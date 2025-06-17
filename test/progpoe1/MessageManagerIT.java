/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package progpoe1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class MessageManagerIT {
    
    public MessageManagerIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of searchMessageById method, of class MessageManager.
     */
    @Test
    public void testSearchMessageById() {
        System.out.println("searchMessageById");
        String id = "";
        MessageManager instance = null;
        String expResult = "";
        String result = instance.searchMessageById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByCellphone method, of class MessageManager.
     */
    @Test
    public void testSearchByCellphone() {
        System.out.println("searchByCellphone");
        String number = "";
        MessageManager instance = null;
        String expResult = "";
        String result = instance.searchByCellphone(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayLongestMessage method, of class MessageManager.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("DisplayLongestMessage");
        MessageManager instance = null;
        String expResult = "";
        String result = instance.DisplayLongestMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteByHashes method, of class MessageManager.
     */
    @Test
    public void testDeleteByHashes() {
        System.out.println("DeleteByHashes");
        MessageManager instance = null;
        String expResult = "";
        String result = instance.DeleteByHashes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DisplayAllMessagesSent method, of class MessageManager.
     */
    @Test
    public void testDisplayAllMessagesSent() {
        System.out.println("DisplayAllMessagesSent");
        MessageManager instance = null;
        String expResult = "";
        String result = instance.DisplayAllMessagesSent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
