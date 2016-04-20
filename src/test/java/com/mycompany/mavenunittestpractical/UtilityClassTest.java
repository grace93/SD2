/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenunittestpractical;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k00199763
 */
public class UtilityClassTest {
    
    public UtilityClassTest() {
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
     * Test of concatWords method, of class UtilityClass.
     */
     @Test
   public void concatWords_inputStringsHelloWorld_OutputsOneString() {
        System.out.println("concatWords");
        String result = UtilityClass.concatWords("Hello", ", ", "world", "!");
        String expResult = "Hello, world!";
         assertEquals(expResult, result);
    }


    /**
     * Test of computeFactorial method, of class UtilityClass.
     */
    @Test
   
    public void computeFactorial_Factorial5_Is120(){
    System.out.println("ComputeFactorial 5");
    assertEquals("120",UtilityClass.computeFactorial(5));
    }
    
    @Test
   
    public void computeFactorial_Factorial5_Is720(){
    System.out.println("ComputeFactorial 6");
    assertEquals("720",UtilityClass.computeFactorial(6));
    }
    
    @Test
   
    public void computeFactorial_Factorial5_Is3628800(){
    System.out.println("ComputeFactorial 10");
    assertEquals("3628800",UtilityClass.computeFactorial(10));
    }
    
//       @Test(timeout=1000)
//    public void computeFactorial_ComputesFactorialOfRandomNo_CalculatesFactorialOrTimesOut() {     
//
//    System.out.println("ComputeFactorial with time out");
//    final int factorialOf = 1 + (int) (30000 * Math.random());
//    System.out.println("computing " + factorialOf + '!'+ " =" );
//    System.out.println(UtilityClass.computeFactorial(factorialOf));
//    }

  @Test (expected=IllegalArgumentException.class)
    public void computeFactorial_FactorialNegative5_ThrowsException() {
    System.out.println("computeFactorial of -5");
    final int factorialOf = -5;
    System.out.println(factorialOf + "! = " + UtilityClass.computeFactorial(factorialOf));
}
    
}
