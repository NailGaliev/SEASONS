package com.company;

import java.util.Scanner;

public class Matrix202747 {

    public static void main(String[] args) {

            int M = 5;
            int N = 7;
            int[][] da = new int[M][N];
            for (int i = 0; i < da.length; i++) {
                int sum = 0;
                int pro = 1;
                for (int j = 0; j < da[i].length; j++) {
                    da[i][j] = (int) (Math.random() * 10 + 1);
                    System.out.print(da[i][j] + "\t");
                    int h = da[i][j];
                    sum += h;
                    pro *= h;
                }
                System.out.print("\nСумма = " + sum + "\t");
                System.out.println("Произведение = " + pro);
                System.out.println();
            }
        }
    }






    public static void main(String[] args) {
        int M = 4;
        int N = 4;
        int[][] mas = new int[M][N];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int min;
        for (int i = 0; i < mas.length; i++) {
            min = mas[i][0];
            for (int j = 0; j < mas[i].length; j++) {
                if (min > mas[i][j]) {
                    min = mas[i][j];
                }
            }
            System.out.printf("Line #%d: min = %d;\n", i + 1, min);
        }
    }








    public static void main(String[] args) {
        int M = 3;
        int N = 3;
        int[][] mas = new int[M][N];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        int k, k1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k = ");
        k=sc.nextInt();
        System.out.println("enter k1 = ");
        k1=sc.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][k]=   mas[i][k1];
                System.out.print(mas[i][j] + " ");




            }
            System.out.println();
        }
    }
}