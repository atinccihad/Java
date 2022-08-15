package i03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Sirasiyla Isminizi Soyisminizi ve Yasinizi giriniz ");
        String isim = scan.nextLine();
        String soyIsim = scan.next();
        int yas = scan.nextInt();
        System.out.println("girilen bilgiler = " + isim + " " + soyIsim + " " + yas);

        /*
        String verileri scanner ile alinirken
        next() : ilk bosluga kadar olan kismi(1 kelime) alir
        nextLine() : satirin sonuna kadar ne yazarsak alir
        NOT : eger ardarda birden fazla String deger alacaksak nectLine() kullanmaliyiz
         */

    }
}
