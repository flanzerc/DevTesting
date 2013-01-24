/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.junit;

import com.test.tld.Dummy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 3129916
 */
public class DummyJUnitTest {


    public DummyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Running beforClass");
    }

    @Before
    public void setUp() {
         System.out.println("Running Before");
    }

    

    @Test
    public void testAddMethod() {

        MyClass myclass = new MyClass();
        int a = 4, b = 4;
        int d = myclass.divideMethod(a , b);
        
        assertEquals(1, d);

    }

    @Test(expected=ArithmeticException.class)
    public void testAddMethod2() {
        System.out.println("Test2");
        Dummy d = new Dummy();
        int actualRs = d.addTwoVal(4, 0);

    }

    

    @After
    public void tearDown() {
         System.out.println("Running After");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Running Afterclass");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}