package iJavaHomework;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz");
        int num = scan.nextInt();
        if (num < 10000 || num > 99999) {
            System.out.println("5 basamakli sayi giriniz");

        } else {
            System.out.println("Girilen 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplami= " + (num / 10000 + num / 1000 % 10 + num % 10 + num / 10 % 10));
        }
    }
}
