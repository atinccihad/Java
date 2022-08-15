package i17_nestedForLoop;

import java.util.Scanner;

public class C09_whileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {

            // Kullanicidan bir sifre alalim
            System.out.println("Lufen bir sifre giriniz");
            sifre = scan.nextLine();

            // 4 kontrollu bir islem yapalim
            // ilk harf kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol == 4) { // tum kontrollerden gecmis durumda
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            } else {// sifre basarisiz
                // tekrar basa donecek
                // kontrol variable sifirlanmali
                kontrol = 0;
                System.out.println("Islem basarisiz\n\t\tLutfen yeni bir sifre girin.");
                sifreBasariliMi = false;
            }
        }

    }
}
