package com.company;


import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Видите размер таблицы по вертикали - ");
        int n = r.nextInt();
        System.out.print("Видите размер таблицы по горизонтали - ");
        int l = r.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < l + 1; k++) {
                System.out.printf("%4d", (k * i));}
            System.out.println("");
        }
    }

}



