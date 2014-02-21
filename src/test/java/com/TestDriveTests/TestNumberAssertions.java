/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.TestDriveTests;

import com.confi.AppConfig;
import com.fiki.Impl.ImplCalc;
import com.fiki.service.CalcInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TestNumberAssertions {
    //variables
    private static ApplicationContext ctx;
    private static CalcInterface calObject;
    
    public TestNumberAssertions() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdd() 
    {               
        Assert.assertEquals(11d, calObject.add(5, 6));//the ##d is to show dat it is a double value        
    }
    
    @Test
     public void subtract()
     {
         Assert.assertEquals(4f, calObject.subtract(10f, 6f));
     }

     public void multiply()
     {
         Assert.assertEquals(60, calObject.subtract(10, 6));
     }
     

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calObject = (ImplCalc)ctx.getBean("CalcClass");
        
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
        
        calObject = null;//free resources
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
