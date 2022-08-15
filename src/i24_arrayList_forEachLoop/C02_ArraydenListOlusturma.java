package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir List olusturun
        Kullanicidan bir sayi isteyip Listede var olup olmadigini yazdirin.
         */
        Random random = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = random.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) { // bildiMi==false da olabilir
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " tahminde listeden bir sayi buldunuz.");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " sayi girildi fakat listede bulunamadi!!");
                tahminSayisi++;
            }
        }


    }
}
