/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public interface ITax {
    double DEDUCTION_CHILD_UNDER18 = 4400000;
    double DEDUCTION_CHILD_UPPER18_ISSTUDY = 6000000;
    double NO_DEDUCTION = 0;
    double DEDUCTION_PARENT_UPPER60 = 4400000;
    double TAXABLE_INCOME = 11000000;
    
    double TAX_RATE_BELOW_4 = 0.02;
    double TAX_RATE_4_6 = 0.05;
    double TAX_RATE_6_10 = 0.1;
    double TAX_RATE_UPPER_10 = 0.2;
    
    double TAX_FOR_BELOW_4 = 80000;
    double TAX_FOR_4_6 = 100000;
    double TAX_FOR_6_10 = 400000;
    
    double INCOME_10TR = 10000000;
    double INCOME_6TR =  6000000;
    double INCOME_4TR =  4000000;
}
