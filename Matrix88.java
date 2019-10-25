package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Matrix88 {


    public static void main(String[] args) {
        int[][] matrixB = {
                {9,1,5},
                {4,1,1},
                {2,2,1}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "   ");
            }
            System.out.println();
        }
         System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[1][0]=0;
                matrixB[2][0]=0;
                matrixB[2][1]=0;




                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }

}




