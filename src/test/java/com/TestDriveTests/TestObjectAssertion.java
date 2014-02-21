/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.TestDriveTests;

import com.confi.AppConfig;
import com.fiki.Impl.ImplEmployee;
import com.fiki.service.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class TestObjectAssertion {
    
    private static ApplicationContext ctx;
    private static Employee empObject;
    
    public TestObjectAssertion() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testRaise() {
    empObject.setObject("Rafiq","Roman", 10000f, true, false);
    //assertTruth(true, empObject.gotRaise(),"Was not a true value");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empObject = (ImplEmployee)ctx.getBean("empClass");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    
}
