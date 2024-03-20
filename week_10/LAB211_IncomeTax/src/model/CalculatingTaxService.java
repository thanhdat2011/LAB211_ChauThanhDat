/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC
 */
public class CalculatingTaxService implements ITax{

    private double getChildDeduction(List<Child> children) {
        Collections.sort(children);
        children.forEach(System.out::println);
        if (children.size() > 1) {
            return children.get(0).getDeduction() + children.get(1).getDeduction();
        }
        return children.get(0).getDeduction();
    }

    private double getParentDeduction(List<Parent> parent) {
        parent.forEach(System.out::println);
        if (parent.size() > 1) {
            return parent.get(0).getDeduction() + parent.get(1).getDeduction();
        }
        return parent.get(0).getDeduction();
    }

    public double getTotalTax(Person person) {
        double tax;
        double childDeduction = getChildDeduction(person.getChildren());
        double parentDeduction = getParentDeduction(person.getParent());
        double taxableIncome = person.getIncome() - (ITax.TAXABLE_INCOME + childDeduction + parentDeduction);
        System.out.println("taxableIncome" + taxableIncome);
        if (taxableIncome > INCOME_10TR) {
            tax = TAX_FOR_BELOW_4 + TAX_FOR_4_6 + TAX_FOR_6_10 + (taxableIncome - INCOME_10TR)*TAX_RATE_UPPER_10;
        } else if (taxableIncome > INCOME_6TR) {
            tax = TAX_FOR_BELOW_4 + TAX_FOR_4_6 + (taxableIncome - INCOME_6TR)*TAX_RATE_6_10;
        } else if (taxableIncome > INCOME_4TR) {
            tax = TAX_FOR_BELOW_4 + (taxableIncome - INCOME_4TR)*TAX_RATE_4_6;
        } else
            tax = taxableIncome*TAX_RATE_BELOW_4;
        return tax;
    }

    
}
