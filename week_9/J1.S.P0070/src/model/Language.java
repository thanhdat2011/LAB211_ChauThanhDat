/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author PC
 */
public class Language {
    private String resourceBundle;

    public Language(String resourceBundle) {
        this.resourceBundle = resourceBundle;
    }

    public String getResourceBundle() {
        return resourceBundle;
    }

    public void setResourceBundle(String resourceBundle) {
        this.resourceBundle = resourceBundle;
    }
    
    public void changeLanguage(){
//       Locale.setDefault(Locale.);

        // Load English properties file
//        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundle.Vi");
        ResourceBundle bundle = ResourceBundle.getBundle(resourceBundle);

        // Retrieve and display error messages
        System.out.println(bundle.getString("account.number.invalid"));
//        System.out.println(bundle.getString("account.number.length"));
        System.out.println(bundle.getString("password.invalid"));
        System.out.println(bundle.getString("captcha.incorrect"));

    }
}
