package com.company;


import java.util.Scanner;
public class sdvig {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.print("Введите сдвиг");
        int x = in.nextInt();
        int temp = 0;
        for (int i = 0;i < arr.length;i++)
            arr[i] = (int) ( Math.random() * n);
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < x; ++i){
            temp = arr[arr.length - 1];
            for(int j = arr.length - 1 ; j > 0 ; --j){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        for(int a : arr)
            System.out.println(a);
    }

   }
//вывод
//Введите размер массива: 4
//Введите сдвиг 2
//2 1 3 3
//3
//3
//2
//1







