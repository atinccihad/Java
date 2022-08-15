package i18_while_doWhileLoop;

import java.util.Scanner;

public class R04 {
    public static void main(String[] args) {
        /*
        Bir tamsayıyı girdi olarak kabul eden ve faktöriyel hesaplayan ve çıktı gibi yazdırılan bir dönüş yöntemi yazın.

        Giriş: 6

        Çıkış: 6!=65432*1=720
         */
        Integer faktoriyel = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyel degerini bulmak istediginiz sayiyi girin");
        int sayi = scan.nextInt();
        int faktoriyelSayi = sayi;

        int num = 1;
        while (sayi > num) {
            faktoriyel *= (sayi);
            sayi--;
        }
        System.out.println(faktoriyelSayi + "! = " + faktoriyel);
    }
}
