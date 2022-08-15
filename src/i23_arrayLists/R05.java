package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R05 {
    public static void main(String[] args) {
        /*
        Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.

        Giriş : 5

        Çıktı : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
        int num=scan.nextInt();
        int asalSayiSayisi=0;

        for ( asalSayiSayisi = 0; asalSayiSayisi < 10 ; asalSayiSayisi++) {


        }


        int sayac;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 2; i <= sayi ; i++)
        {
            sayac = 0;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 0) {
                System.out.println(i + " asal bir sayidir.");
            }
        }



    }
}
