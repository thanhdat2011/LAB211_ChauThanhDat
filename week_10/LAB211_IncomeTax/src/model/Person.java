/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author PC
 */
public class Person {
    private String name;
    private double income;
    List<Child> children;
    List<Parent> parent;
    
    public Person() {
    }

    public Person(String name, double income, List<Child> children, List<Parent> parent) {
        this.name = name;
        this.income = income;
        this.children = children;
        this.parent = parent;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<Parent> getParent() {
        return parent;
    }

    public void setParent(List<Parent> parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", income=" + income + ", children=" + children + ", parent=" + parent + '}';
    }
    
    
}
