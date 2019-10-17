package com.company;

import java.util.Scanner;

//public class Main {

    //public static void main(String[] args) {
//int i = 0;
//int j = 0;
     //int[][] a1 = new int[i][j];

       //System.out.print("enter size");
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
       // a1[i] = new int[n];


    //for( i = 0;i<a1.length;i++){
       // for( j=0;j<a1[i].length;j++){
          //  System.out.print(a1[i][j]+ " ");

      //  }
       // System.out.println();
   // }

   // }
 public class Main {


       public static void main(String[] args) {
           int[][] a1 = new int[5][];
           a1[0] = new int[1];
           a1[1] = new int[2];
           a1[2] = new int[3];
           a1[3] = new int[4];
           a1[4] = new int[5];
            for(int i =0;i<a1.length;i++){
                for(int j=0;j<a1[i].length;j++){
                    System.out.print(a1[i][j]+ " ");
                }
                System.out.println();
            }


       }
   }
