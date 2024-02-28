/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author PC
 */
public class CalculatorShapeController {

    public String getResultCircle(Circle circle) {
        return circle.getResult();
    }

    public String getResultTriangle(Triangle triangle) {
        if (!triangle.isTriangle()) {
            return "It is not triangle !!!";
        }
        return triangle.getResult();
    }

    public String getResultRectangle(Rectangle rectangle) {
        return rectangle.getResult();
    }
    
}
