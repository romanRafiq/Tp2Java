/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fiki.Impl;

import com.fiki.service.CalcInterface;

/**
 *
 * @author student
 */
public class ImplCalc implements CalcInterface{

    public double add(double num1, double num2) {
        return (num1 + num2);
    }

    public float subtract(float num1, float num2) {
        return (num1 - num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 *num2);
    }

    
    
}
