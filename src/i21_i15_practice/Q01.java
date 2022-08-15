package i21_i15_practice;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Harf giriniz.");
        String harfGirisi = scan.next();

        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnprstvyzqwx";
        if (harfGirisi.length() == 1) {
            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (sesliHarfler.contains(harfGirisi)) {
                    System.out.println("sesli harf");
                    break;
                } else if (sessizHarfler.contains(harfGirisi)) {
                    System.out.println("sessiz harf");
                    break;
                } else {
                    System.out.println("Yanlis karakter girdiniz!");
                    break;
                }
            }
        } else {
            System.out.println("Tek karakter girdiniz..");
        }

    }
}
