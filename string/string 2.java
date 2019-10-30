package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слова одной строкой через пробел");
        String text = sc.nextLine();
        int count = 0;

        if(text.length() != 0){
            count++;
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("Вы ввели "+count+"слов");
    }
}
