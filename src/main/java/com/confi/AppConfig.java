/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.confi;

import com.fiki.Impl.ImplCalc;
import com.fiki.Impl.ImplEmployee;
import com.fiki.service.CalcInterface;
import com.fiki.service.Employee;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author student
 */
public class AppConfig {
    
    @Bean(name = "CalcClass")
    public CalcInterface getCalcClass()
    {
        return new ImplCalc();
    }
    
    @Bean(name = "empClass")
    public Employee getEmployeeClass()
    {
        return new ImplEmployee();
    }
    
}
