/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class AccountService {
    private final static List<Account> accountList;
    static {
        accountList = new ArrayList<>();
    }
    
    public List<Account> findAll(){
        return accountList;
    }
}
