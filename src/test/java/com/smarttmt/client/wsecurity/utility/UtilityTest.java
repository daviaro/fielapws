package com.smarttmt.client.wsecurity.utility;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author desarrollo001
 */
public class UtilityTest {
    
    public UtilityTest() {
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
     * Test of copyFime method, of class Utility.
     */
    @Ignore
    @Test
    public void testCopyFime() {
        System.out.println("copyFime");
        String nameFile = "";
        byte[] expResult = null;
        byte[] result = Utility.copyFime(nameFile);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
