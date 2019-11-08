package com.company;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        double f1 = 0.0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }


        double f2 = 0.1 * 11;


        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);


        if (f1 == f2)

            System.out.printf("Числа %f и %f равны, с точностью до эпсилон = 0,01.%n" );
        else
            System.out.println("\"Числа %f и %f не равны.%n\"");
    }

}
