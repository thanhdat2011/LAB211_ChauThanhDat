/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.IncomeTaxController;
import java.util.ArrayList;
import java.util.List;
import model.Child;
import model.Parent;
import model.Person;
import util.ValidationUtil;

/**
 *
 * @author PC
 */
public class IncomeTaxView {
    private ValidationUtil validationUtil = new ValidationUtil();
    private IncomeTaxController incomeTaxController = new IncomeTaxController();
   
    public void show() {
        showForm();
    }

    private void showForm() {
        String personName = validationUtil.inputWithOutEmpty("Enter your name");
        double income = validationUtil.inputDoubleGreaterThan("Enter your income", 0);
        
        // CHILD LIST
        int numberOfChild = validationUtil.inputIntegerGreaterThan("How many child ?", 0);
        List<Child> children = new ArrayList<>();
        for (int i = 0; i < numberOfChild; i++) {
            System.out.println("Enter child " + i+1);
            
            children.add(new Child(
//                    validationUtil.inputWithOutEmpty("======> Name"),
                    validationUtil.inputIntegerGreaterThan("======> Age", 0),
                    validationUtil.getChoiceYorN("======> Is studying ?(Y/N)")
            ));
        }
        
        // PARENT LIST
        int numberOfParent = validationUtil.inputIntegerInRange("How many parent available ?", 0,2);
        List<Parent> parent = new ArrayList<>();
        for (int i = 0; i < numberOfParent; i++) {
            System.out.println("Enter Parent " + i+1);
            
            parent.add(new Parent(
//                    validationUtil.inputWithOutEmpty("======> Name"),
                    validationUtil.inputIntegerGreaterThan("======> Age", 0)
            ));
        }
        
        Person person = new Person(personName, income, children, parent);
        
        System.out.printf("YOUR TAX : %.2f", incomeTaxController.getTax(person));
//        incomeTaxController.getTax(person);
    }
    
}
