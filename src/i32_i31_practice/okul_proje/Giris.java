package i32_i31_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);// todo static tanimla

    public static void main(String[] args) {
        System.out.println("Hosgeldiniz");


        System.out.println("Isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyisim giriniz");
        String soyIsim = scan.nextLine();
        scan.nextLine(); // dummy

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        scan.nextLine(); // dummy

        System.out.println("Brans giriniz");
        String brans = scan.next();
        scan.nextLine(); // dummy

        System.out.println("TelNo giriniz");
        String telNo = scan.nextLine();
        scan.nextLine(); // dummy
        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyIsim, yas, brans, telNo);


        scan.nextLine(); // dummy
        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);


    }
}
