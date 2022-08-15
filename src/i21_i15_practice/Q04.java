package i21_i15_practice;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        String str = "";
        String tersStr = "";
        reverseString(str, tersStr);


    }

    public static String reverseString(String str, String tersStr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tersine cevirmek icin String giriniz");
        str = scan.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);

        }
        System.out.println("String is reversed=> "+tersStr);
        return tersStr;
    }
}
