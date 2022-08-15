package i24_i01_anOverview;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
         /*
        1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        Test Data
        34
        Beklenen Çıktı
        7
     */
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();

        while (sayi > 0) {
            sum += sayi % 10;
            sayi /= 10;
        }
        System.out.println("sayinin rakamlari toplami= " + sum);


    }

}
