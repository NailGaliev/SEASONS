package com.company;

import java.awt.*;

public class Car {
    public Car() {
point.x =3;
color ="black";
maxSpeed=500;
model="car";
power=4.25;
trunkCapacity=3;
point.y=4;

    }
    public String model;
    public int maxSpeed;
    public double trunkCapacity;
    public String color;
    public double power;
    protected Point point=new Point(0,0);




    public Car(String model, int maxSpeed, String color, double trunkCapacity, double power,Point point) {
        this.color = color;
        this.power = power;
        this.model = model;
        this.trunkCapacity = trunkCapacity;
        this.maxSpeed = maxSpeed;
        this.point=point;

    }
 public void Print(){
     System.out.println("the model of car " + model + " max speed =" + maxSpeed + " color: " + color + " capacity= " + trunkCapacity + "Power of car = " + power+"(x,y)"+point);
 }
public void Move(int x ,int y){
        point.x += x;
        point.y += y;
}

    }

