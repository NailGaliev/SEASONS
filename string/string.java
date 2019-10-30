package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str ="C:\\ Users \\ User \\ IdeaProject \\ string \\ main .java";
        Scanner sc = new Scanner(str);
        while(sc.hasNext()){
            if(sc.hasNext("main")){
                System.out.println(sc.next());
            }else if (sc.hasNextInt()){
                System.out.println(sc.hasNextInt());

            }else{
                sc.next();
            }

        }

    }
    String str ="C:\\ Users \\ User \\ IdeaProject \\ string \\ main. java";
    Scanner sc = new Scanner(str);
while(sc.hasNext())

    {
        if (sc.hasNext("java")) {
            System.out.println(sc.next());


        }
    }


        }

