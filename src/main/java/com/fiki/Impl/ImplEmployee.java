/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fiki.Impl;

import com.fiki.service.Employee;

/**
 *
 * @author student
 */
public class ImplEmployee implements Employee{
    
    private String firstName,surname;
    
    private double salary;
    
    private boolean raise,children; 
    
    
    public void setObject(String firstName, String surname, double salary,boolean raise,boolean children)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.raise = raise;
        this.children = children;
    }
    
    public String getName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public boolean gotRaise() {
        return raise;
    }

    public boolean gotChildren() {
       return children;
    }
    
}
