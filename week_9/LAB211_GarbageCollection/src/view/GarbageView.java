/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.GarbageController;
import model.GarbagePoint;
import util.Menu;
import util.ValidationUtil;

/**
 *
 * @author PC
 */
public class GarbageView {
    private final ValidationUtil validationUtil = new ValidationUtil();
    private final GarbageController garbageController = new GarbageController();
    
    public void show(){
        String[] option = {"Enter the amount of garbage at each station", "Get Fee", "Exit"};
        Menu<String> homeMenu = new Menu<String>("GARBAGE COLLECTION", option) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        int size = validationUtil.inputIntegerGreaterThan("How many points are the truck going to collect ?", 0);
                        for (int i = 0; i < size; i++) {
                            System.out.print("Point " + (i+1) + ": ");
                            garbageController.add(new GarbagePoint(validationUtil.inputDoubleGreaterThan("Enter weight", 0)));
                        }
                        break;
                    case 2:
                        System.out.println("TOTAL FEE");
                        System.out.println(garbageController.getTotalFee());
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice !!!");
                }
            }
        };
        homeMenu.run();
    }
}
