/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fiki.service;

/**
 *
 * @author student
 */
public interface Employee {
    
    public String getName();
    public String getSurname();
    public double getSalary();
    public boolean gotRaise();
    public boolean gotChildren();
    public void setObject(String firstName, String surname, double salary,boolean raise,boolean children);
    
}
