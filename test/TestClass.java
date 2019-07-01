/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator_testcases.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-074
 */
public class TestClass {
    
        @Test
    public void AddTest1(){
    
    System.out.println(" Addition Test 1");
    Calculator test =new Calculator();
    
    int a=5;
    int b=10;
    double expected_result=15;
    
    double result=test.sum(a, b);
    assertEquals(expected_result, result, 0);
    
    }
    
    
            @Test
    public void AddTest2(){
    
        
   System.out.println(" Addition Test 2");
    Calculator test =new Calculator();
    assertEquals(20, test.sum(10, 10));
    
    }
    
                @Test
    public void SubTest(){
    
    Calculator test =new Calculator();
    assertEquals(test.sub(10, 5),5);
    
    }
    
                @Test
    public void MulTest(){
    
    Calculator test =new Calculator();
    assertEquals(test.sum(5, 5),25);
    
    }
    
                @Test
    public void divTest(){
    
    Calculator test =new Calculator();
    assertEquals(test.sum(10, 5),10);
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
