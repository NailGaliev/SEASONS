package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Task5 {


    public static String repeatSeparator(String word, String sep, int count) {
        String answer = "";
        for (int i = 0; i < count; i++) {
            answer = answer + word;
            if (i != (count - 1)) {
                answer += sep;
                System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));
            }
        }
    }
}






