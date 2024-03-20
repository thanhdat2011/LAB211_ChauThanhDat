/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Child implements ITax, Comparable<Child>{
    private String name;
    private int age;
    private boolean isStudy;
    private double deduction;

    public Child() {
    }

    public Child(String name, int age, boolean isStudy) {
        this.name = name;
        this.age = age;
        this.isStudy = isStudy;
    }

    public Child(int age, boolean isStudy) {
        this.age = age;
        this.isStudy = isStudy;
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

    public boolean isIsStudy() {
        return isStudy;
    }

    public void setIsStudy(boolean isStudy) {
        this.isStudy = isStudy;
    }

    public double getDeduction() {
        if (age < 18) {
            deduction = ITax.DEDUCTION_CHILD_UNDER18;
        } else if (age >= 18 && isStudy == true) {
            deduction = ITax.DEDUCTION_CHILD_UPPER18_ISSTUDY;
        } else if (age >= 18 && isStudy == false) {
            deduction = ITax.NO_DEDUCTION;
        } else if (age > 22) {
            deduction = ITax.NO_DEDUCTION;
        }
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "Child{" + "name=" + name + ", age=" + age + ", isStudy=" + isStudy + ", deduction=" + getDeduction() + '}';
    }
    
    
    @Override
    public int compareTo(Child o) {
        return (int) (o.getDeduction() - this.getDeduction());
    }

    
    
    
}
