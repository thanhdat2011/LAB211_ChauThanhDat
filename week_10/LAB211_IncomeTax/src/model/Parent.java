/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author PC
 */
public class Parent implements ITax{
    private String name;
    private int age;
    private double deduction;
    
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Parent(int age) {
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDeduction() {
        if (age > 60) {
            deduction = ITax.DEDUCTION_PARENT_UPPER60;
        } else {
            deduction = ITax.NO_DEDUCTION;
        }
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "Parent{" + "name=" + name + ", age=" + age + ", deduction=" + getDeduction() + '}';
    }
    
    
}
