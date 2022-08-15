package iJavaHomework;

import java.util.Scanner;

public class H27 {
    public static void main(String[] args) {
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et
        */
        int sayi = 0;
        mukemmelSayi(sayi);


    }

    public static void mukemmelSayi(int sayi) {
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mukemmel oldugunu sorgulamak icin sayi giriniz");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            } else if (toplam == sayi) {
                System.out.print(sayi + " mukemmel sayidir");
                break;
            } else {
                System.out.println(sayi + " mukemmel sayi degil");
                break;
            }

        }

    }
}
