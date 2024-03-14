/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GarbagePoint;
import model.Truck;

/**
 *
 * @author PC
 */
public class GarbageController {
    private final Truck truck = new Truck();
    public void add(GarbagePoint garbagePoint) {
        truck.add(garbagePoint);
    }

    public double getTotalFee() {
        return truck.start();
    }
    
}
