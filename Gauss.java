package com.company;

import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
        int k, j, i, n;
        double r;
        double[][] a;
        double[] b;
        double[] x;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность: ");
        n = 2;
        a = new double[40][40];
        b = new double[40];
        x = new double[40];
        for (i = 1; i <= n; i++) {
            System.out.println("i: " + i);
            for (j = 1; j <= n; j++) {
                System.out.println(" A(" + i + "," + j + "):");
                a[i][j] = in.nextDouble();
            }
            System.out.println(" B(" + i + "):");
            b[i] = in.nextFloat();
        }
        for (i = 1; i <= n; i++) {
            for (j = i + 1; j <= n; j++) {
                a[j][i] = -a[j][i] / a[i][i];
                for (k = i + 1; k <= n; k++) {
                    a[j][k] = a[j][k] + a[j][i] * a[i][k];
                }
                b[j] = b[j] + a[j][i] * b[i];
            }
        }
        x[n] = b[n] / a[n][n];
        for (i = n - 1; i > 1; i--) {
            r = b[i];
            for (j = i+1; j <= n; i++) {
                r = r - (x[j] * a[i][j]);
                x[i] = r / a[i][i];
            }
        }
        System.out.println("Результаты: ");
        for (i = 1; i < n; i++) {
            System.out.println("X(" + i + ")=" + x[i]);
        }
    }
}