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
public class User_detailsIT {
    
    public User_detailsIT() {
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
     * Test of getUsername method, of class User_details.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User_details.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User_details instance = new User_details();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User_details.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User_details.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User_details instance = new User_details();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhonenumber method, of class User_details.
     */
    @Test
    public void testGetPhonenumber() {
        System.out.println("getPhonenumber");
        User_details instance = new User_details();
        String expResult = "";
        String result = instance.getPhonenumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhonenumber method, of class User_details.
     */
    @Test
    public void testSetPhonenumber() {
        System.out.println("setPhonenumber");
        String phonenumber = "";
        User_details instance = new User_details();
        instance.setPhonenumber(phonenumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidUsername method, of class User_details.
     */
    @Test
    public void testValidUsername() {
        System.out.println("ValidUsername");
        String username = "";
        User_details instance = new User_details();
        boolean expResult = false;
        boolean result = instance.ValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidCredentails method, of class User_details.
     */
    @Test
    public void testValidCredentails() {
        System.out.println("ValidCredentails");
        String password = "";
        User_details instance = new User_details();
        boolean expResult = false;
        boolean result = instance.ValidCredentails(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ValidatePhonenumber method, of class User_details.
     */
    @Test
    public void testValidatePhonenumber() {
        System.out.println("ValidatePhonenumber");
        String phonenumber = "";
        User_details instance = new User_details();
        boolean expResult = false;
        boolean result = instance.ValidatePhonenumber(phonenumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
