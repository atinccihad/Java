package i26_i22_practice;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        int karakterSayisi = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Karakter sayisinin hesaplanmasi icin cumle giriniz");
        String cumle = scan.nextLine();
        cumle = cumle.replaceAll(" ", "");

        for (int i = 0; i < cumle.length(); i++) {
            karakterSayisi++;
        }

        System.out.println("Girilen cumledeki bosluklar haric karakter sayisi= " + karakterSayisi);
    }
}
