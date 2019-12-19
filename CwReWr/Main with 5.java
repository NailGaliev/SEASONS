package com.company;

import java.io.ByteArrayOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

        public static class ControlWorkReWriting {

            /**
             * Студент Галиев Н.М
             * <p>
             * Группа 11-908
             * <p>
             * Высшая школа информационных технологий и систем
             * <p>
             * Казанский (Приволжский) федеральный университет
             * <p>
             * <p>
             * <p>
             * Контрольная работа №3.
             * <p>
             * <p>
             * <p>
             * Максимальный балл 10.
             * <p>
             * Итого:
             */



            public static void main(String[] args) {
                System.out.println(isPalindrome("adf32efa"));

                System.out.println(fromTextSum("1337qwde"));
            }

            /**
             * 1. Проверить является ли строка палиндромом.
             * <p>
             * Проверка:
             * <p>
             * метод:
             * <p>
             * тест:
             * <p>
             * Итого (макс. 2 балла):
             */
            static boolean isPalindrome(String text) {
                text = text.replaceAll("\\W","");
                StringBuilder strBuilder = new StringBuilder(text);
                strBuilder.reverse();
                String invertedText = strBuilder.toString();
                return text.equalsIgnoreCase(invertedText);
            }
            }

    static int fromTextSum(String text1){
        text1 = text1.replaceAll("[^0-9]+", " ");
        int a = 0;
        for (int i = 0; i < text1.length(); i++) {
            a += Integer.parseInt(text1.valueOf(i));
        }
        return a;
    }



            /**
             * 2. Дана строка, сложить все числа в ней. Если чисел нет выводим 0. Протестировать.
             * <p>
             * <p>
             * <p>
             * Проверка:
             * <p>
             * метод:
             * <p>
             * тест:
             * <p>
             * Итого (макс. 2 балла):
             */




            /**
             * 3. Написать метод генерирующий сложный пароль (цифры, символы и латинский алфавит).
             * <p>
             * <p>
             * <p>
             * Проверка:
             * <p>
             * метод:
             * <p>
             * тест:
             * <p>
             * Итого (макс. 2 балла):
             */

            public String generatePassword() {
                String str = "";
                int length = (int)((Math.random()*5)+8);
                byte num;
                byte r;
                char [] symbols = {'%','&','$','@','#'};
                char [] letters = "hfdshfidsbf".toCharArray();
                char [] digits = "2281337".toCharArray();
                for (int i = 0; i < length; i++){
                    num = (byte)(Math.random()*3);
                    switch (num){
                        case (0):
                            str+= symbols[(int)(Math.random()*symbols.length)];
                            break;

                        case (1):
                            r = (byte)(Math.random()*2);
                            switch (r){
                                case (0):
                                    str+= letters[(int)(Math.random()*letters.length)];
                                    break;
                                case(1):
                                    str+= Character.toUpperCase(letters[(int)(Math.random()*letters.length)]);
                                    break;
                            }
                            break;
                        case (2):
                            str+= digits[(int)(Math.random()*10)];
                    }
                }
                return str;
            }


            /**
             * 4. Написать метод, который сравнивает две строки и выводит 0 если они равны, 1 если лексиграфически
             * <p>
             * первая находится раньше второй, -1 в обратном случае.
             * <p>
             * Проверка:
             * <p>
             * метод:
             * <p>
             * тест:
             * <p>
             * Итого (макс. 2 балла):
             */

            public static int compareStrings(String string, String string2) {
                int compare = 0;
                int size = 0;
                if (string.length()-1 >= string2.length()-1){
                    size = string2.length()-1;
                } else size = string.length()-1;
                for (int i = 0; i <= size; i++) {
                    int symbolFirst = (int)string.charAt(i);
                    int symbolSecond = (int)string2.charAt(i);
                    if (symbolFirst < symbolSecond) return 1;
                    else if(symbolFirst > symbolSecond) return -1;
                }
                if (string.length() < string2.length() && string.length() != string2.length()) {
                    return 1;
                } else if (string.length() > string2.length() && string.length() != string2.length()){
                    return -1;
                }

                return 0;
            }


            /**
             * 5. Описать рекурсивную функцию NOD(A, B) целого типа, находящую
             * <p>
             * наибольший общий делитель (НОД) двух целых положительных чисел A
             * <p>
             * и B, используя алгоритм Евклида:
             * <p>
             * НОД(A, B) = НОД(B, A mod B), если B != 0; НОД(A, 0) = A.
             * <p>
             * С помощью этой функции найти НОД(A, B), НОД(A, C), НОД(A,D), если
             * <p>
             * даны числа A, B, C, D.
             * <p>
             * <p>
             * <p>
             * Проверка:
             * <p>
             * метод:
             * <p>
             * тест:
             * <p>
             * Итого (макс. 2 балла):
             */


            static void getGCD (int a, int b, int c, int d) {
                System.out.println(gCD(a, b));
                System.out.println(gCD(a, c));
                System.out.println(gCD(a, d));
            }

    static int gCD (int a, int b) {
        if (b == 0){
            return a;
        }
        else {
            return gCD(b, a % b);
        }
    }





            }




