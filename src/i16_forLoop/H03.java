package i16_forLoop;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

        Örnek Çıktı:

        Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlarinin toplamini bulmak uzere 3 basamakli sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = sayi / 100;
        int rakamlarToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
        System.out.println("Girilen sayinin birler basamagi= " + birlerBasamagi + "\nGirilen sayinin onlar basamagi= " + onlarBasamagi + "\nGirilen sayinin yuzler basamagi= " + yuzlerBasamagi + "\nGirilen sayinin rakamlari toplami= " + rakamlarToplami);

    }
}
