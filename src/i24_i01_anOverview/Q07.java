package i24_i01_anOverview;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /*
         7-----
       Ugly Number:

       Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


       Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

       Test Data:
       13

       Beklenen çıktı:
       ugly number  degildir

       Test Data:
       25
       Beklenen Çıktı:

       ugly number
         */
        int[]ugly={1, 2, 3, 4, 5, 6, 8, 9, 10, 12};
        Scanner scan=new Scanner(System.in);
        System.out.println("ugly number olup olmadığını kontrol etmek için sayi giriniz");
        int num= scan.nextInt();





    }
}
