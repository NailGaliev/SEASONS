package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[][] a = new int[5][];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }
}



