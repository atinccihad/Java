package iJavaHomework;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
                Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
                */
        double kombinasyon = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kombinasyonlarini bulmak uzere 2 sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int num1Faktoriyel = 1;
        for (int i = num1; i > 0; i--) {
            num1Faktoriyel = num1Faktoriyel * i;
        }

        int num2Faktoriyel = 1;
        for (int i = num2; i > 0; i--) {
            num2Faktoriyel = num2Faktoriyel * i;
        }
        int nEksiRFaktoriyel = 1;
        int i = 1;
        if (num1 - num2 > 0) {
            for (i = num1 - num2; i > 0; i--) {
                if (i != 0 && i > 0) {
                    nEksiRFaktoriyel = nEksiRFaktoriyel * i;
                }
            }
        } else if (num1 - num2 < 0) {
            i = (-1) * (num1 - num2);
        }


        System.out.println("Verilen iki sayinin kombinasyonu= " + num1Faktoriyel / num2Faktoriyel * nEksiRFaktoriyel);


    }
}
