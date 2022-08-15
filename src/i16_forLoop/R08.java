package i16_forLoop;

import java.util.List;
import java.util.Scanner;

public class R08 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf girmesini isteyiniz.
        Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın.
        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
        (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u

        Test Data:
        ```
        a
        ```
        Beklenen Çıktı:
        ```
        a harfi sesli harfdir.
        ```
        Test Data:
        ```
        d
        ```
        Beklenen Çıktı:
        ```
        d harfi sesiz harftir.
        ```
        Test Data:
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        char krk = scan.next().toLowerCase().charAt(0);
        char[] sesliHarfler = {'a', 'e', 'i', 'o', 'u'};
        char[] sessizHarfler = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'q', 'v', 'y', 'z', 'x'};


        if (krk >= 'a' && krk <= 'z') {
            for (int i = 0; i < sesliHarfler.length; i++) {
                if (sesliHarfler[i] == krk) {
                    System.out.println(krk + " sesli harfdir.");
                    break;
                }
            }
            for (int j = 0; j < sessizHarfler.length; j++) {
                if (sessizHarfler[j] == krk) {
                    System.out.println(krk + " sessiz harfdir");
                    break;
                }
            }
        } else {
            System.out.println("Yanlis karakter girdiniz!");
        }


    }
}



