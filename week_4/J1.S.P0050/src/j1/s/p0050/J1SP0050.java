/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0050;

/**
 *
 * @author PC
 */
public class J1SP0050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1 -> Manager.superlativeEquation();
                case 2 -> Manager.quadraticEquation();
                case 3 -> {
                    return;
                 }
            }
             System.out.println("");
        }
    }
    
}
