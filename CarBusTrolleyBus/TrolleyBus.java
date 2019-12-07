package com.company;

import java.awt.*;

public class TrolleyBus extends Car {
    protected boolean electicTraction;
    public TrolleyBus(String model, int maxSpeed, String color, double trunkCapacity, double power, Point point){
        super(model,maxSpeed,color,trunkCapacity,power,point);
        this.electicTraction=true;
    }
    public void Print(){
        super.Print();
        System.out.println("sitPlace"+electicTraction);
    }
    public TrolleyBus(){
            super();
            electicTraction=true;
    }
}
