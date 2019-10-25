package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
  int x =150;
        System.out.print("enter month");
  x = sc.nextInt();


        switch (x){

            case 1:
                System.out.print("январь");
                break;
            case 2:
                System.out.print("февраль");
                break;
            case 3:
                System.out.print("март");
                break;
            case 4:
                System.out.print("апрель");
                break;
            case 5:
                System.out.print("май");
                break;
            case 6:
                System.out.print("июнь");
                break;
            case 7:
                System.out.print("июль");
                break;
            case 8:
                System.out.print("август");
                break;
            case 9:
                System.out.print("сентябрь");
                break;
            case 10:
                System.out.print("октябрь");
                break;
            case 11:
                System.out.print("ноябрь");
                break;
            case 12:
                System.out.print("декабрь");
                break;
        }
        }

}



