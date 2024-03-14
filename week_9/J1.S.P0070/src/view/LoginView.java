/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.print.attribute.standard.MediaSize;
import util.Menu;

/**
 *
 * @author PC
 */
public class LoginView {
    public void show(){
        String[] options = {"Vietnamese", "English", "Exit"};
        Menu<String> homeMenu = new Menu<String>("Login Program", options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
//                        englishCase();
                        break;
                    case 2:
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        };
        homeMenu.run();
    }
    
    
    
}
