package i22_i21_practice;

import java.util.Scanner;

public class Q03 {
    /*
   Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
   ve x girildiğinde ise "Program bitti" yazan programı yazınız.
   */
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String okunan = "";
        do {
            System.out.println("Program calisiyor");
            System.out.println("harf giriniz : ");
            okunan = abc.next();

        } while (!okunan.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
