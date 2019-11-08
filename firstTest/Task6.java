package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Task6 {


    public static void main(String[] args) throws IOException {
            FileWriter fw = new FileWriter("text.txt");
            int bottle = 99;
            while (bottle != 0) {
                fw.write(bottle + " bottles of beer on the wall, " + bottle + " bottles of beer. \n");
                bottle--;
                if (bottle == 0) {
                    fw.write("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
                } else {
                    fw.write("Take one down and pass it around, " + bottle + " bottles of beer on the wall.\n\n");
                }
            }
            fw.write("No more bottles of beer on the wall, no more bottles of beer.\n");
            bottle = 99;
            fw.write("Go to the store and buy some more, " + bottle + " bottles of beer on the wall.");
            fw.close();

        }
    }

