package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr=");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            array[i] = i * 7 + 1;

            System.out.print(array[i] + " ");
        }

    }

    public static int getSecondLargest(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr=");
        int c = sc.nextInt();
        int[] array2 = new int[c];
        int highest = 0;
        int secondH = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
            System.out.println(array2[i] + " ");
            if (array2[i] > highest) {
                secondH = highest;
                highest = array2[i];

            } else if (array2[i] > secondH) {
                secondH = array2[i];
            }
        }
        System.out.println("max 2 = " + secondH);
        return 0;
    }


}

