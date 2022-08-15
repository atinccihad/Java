package i12_StringManipulations;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan=new  Scanner(System.in);
        System.out.println("Kullanici adi");
        String kullaniciAdi=scan.nextLine();
        System.out.println("Soyadiniz");
        String kullaniciSoyadi=scan.nextLine();
        System.out.println("kkNo giriniz");
        String kkNo=scan.nextLine();

        System.out.println(kullaniciAdi.substring(3));
        System.out.println(kullaniciSoyadi.substring(kullaniciSoyadi.length() - 3)); //
        System.out.println(kullaniciAdi.substring(2, 4));

        String isimIlkHarf = kullaniciAdi.substring(0, 1).toUpperCase();
        String isimGeriyeKalanlar = kullaniciAdi.substring(1).replaceAll("\\w", "*");
        String soyisimIlkHarf = kullaniciSoyadi.substring(0, 1).toUpperCase();
        String soyisimGeriyeKalanlar = kullaniciSoyadi.substring(1).replaceAll("\\w","*");
        String kkIlk4 = kkNo.substring(0, 4);
        String kkGeriyeKalanlar = " **** **** ****";
        System.out.println(isimIlkHarf + isimGeriyeKalanlar + " " +
                soyisimIlkHarf + soyisimGeriyeKalanlar + "\n" +
                kkIlk4 + kkGeriyeKalanlar);
    }
}
