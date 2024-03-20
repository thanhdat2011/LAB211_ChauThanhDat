/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CalculatingTaxService;
import model.Person;

/**
 *
 * @author PC
 */
public class IncomeTaxController {
    private CalculatingTaxService calculatingTax = new CalculatingTaxService();
    
    public double getTax(Person person) {
        double tax = calculatingTax.getTotalTax(person);
        return tax;
    }
    
}
