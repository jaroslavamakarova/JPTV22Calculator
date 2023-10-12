/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22calculator;

/**
 *
 * @author pupil
 */
public class Calculator {

    // Addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("На ноль делить нельзя!");
            return Double.NaN; // NaN (Not-a-Number) as the result of division by zero
        }
    }
}
