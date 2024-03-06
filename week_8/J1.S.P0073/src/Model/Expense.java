/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Expense {
    //expense (ID, Date, Quantity, Content)
    private int ID;
    private String date;
    private double amount;
    private String content;

    public Expense() {
    }

    public Expense(int ID, String date, double amount, String content) {
        this.ID = ID;
        this.date = date;
        this.amount = amount;
        this.content = content;
    }
    
    public Expense(String date, double amount, String content) {
        this.date = date;
        this.amount = amount;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-10s | %-10s | %-10s", ID, date, amount, content);
    }
    
}
