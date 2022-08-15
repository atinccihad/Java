package i18_while_doWhileLoop;

import java.util.Scanner;

public class C06_doWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int pozitifSayiAdedi = 0;
        int negatifSayiadedi = 0;
        int pozitifSayilarToplami = 0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi = scan.nextInt();
            if (sayi > 0) {
                pozitifSayilarToplami += sayi;
                pozitifSayiAdedi++;
            } else if (sayi < 0) {
                negatifSayiadedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }
        } while (sayi != 0);

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz.\nToplamlari= " + pozitifSayilarToplami);
        System.out.println(negatifSayiadedi + " adet negatif sayi girdiniz,\nAncak onlar toplama dahil edilmedi.");
    }
}
