package com.company;

import java.util.Scanner;

public class Task9 {




            public static void main (String[] args) {
                System.out.println("Enter test sen:");
                Scanner sc = new Scanner(System.in);
                String s;
                s = sc.nextLine();
                int array[] = new int[26];
                String result = "";
                for (char c: s.toLowerCase().toCharArray()) {
                    if (c >= 'a' && c <= 'z') {
                        array[c - 'a']++;
                    }
                }
                for (int i = 0;i <26; i++) {
                    if (array[i] != 0) {
                        result += (char) (i + 'a') + ":" + array[i] + "\n";
                    }
                }
                System.out.println("result:"+result);
            }
        }


