package com.company;

import java.awt.*;

public class Bus extends Car {
    protected int sitPlace;
    public Bus(String model, int maxSpeed, String color, double trunkCapacity, double power, Point point){
        super(model,maxSpeed,color,trunkCapacity,power,point);
        this.sitPlace=sitPlace;
    }
    public void Print(){
        super.Print();
        System.out.println("sitPlace"+sitPlace);
    }
public Bus(){
        super();
        sitPlace = 5;

}
    }
