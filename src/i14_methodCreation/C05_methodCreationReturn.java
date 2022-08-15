package i14_methodCreation;

import java.util.Scanner;

public class C05_methodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin islemi bir methodda yapip
        sonucunu main method'a dondurebiliriz
        budurumda return type'i void olmayan bir method'un sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */

        // Kullanicidan sehir ismini ve dogum tarihini alip
        // Bunlari programda kullanacagimiz formatta bize donduren method olusturun
        // Sehir ismini programimizda buyuk harf olarak
        // Tarihi ise  2022-06-30  seklinde kullanalim

        String sehir = sehirAl();
        String dogumTarihi = tarihAl();

        System.out.println("sehir = " + sehir);
        System.out.println("dogumTarihi = " + dogumTarihi);
    }

    public static String tarihAl() {
        String dogumTarihi = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Dogum yili giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {
            dogumTarihi = yil + "-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazmalisin(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak giriniz");
        int ay = scan.nextInt();

        if (ay <= 0 || ay > 12) {
            System.out.println("Ay no 1-12 arasinda olmalidir");
        } else if (ay < 10) {
            dogumTarihi = dogumTarihi + "0" + ay + "-";
        } else {
            dogumTarihi = dogumTarihi + ay + "-";
        }
        System.out.println("lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("gun no olarak 1-31 arasinda sayi girilmelidir");
        } else if (gun < 10) {
            dogumTarihi = dogumTarihi + "0" + gun;
        } else {
            dogumTarihi = dogumTarihi + gun;
        }
        return dogumTarihi;
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sehir ismini giriniz");
        String sehirIsmi = scan.next().toUpperCase();

        return sehirIsmi;
    }
}
