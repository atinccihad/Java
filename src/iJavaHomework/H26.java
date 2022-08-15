package iJavaHomework;

import java.util.Scanner;

public class H26 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Bir harf giriniz");
        char harf=scan.next().charAt(0);
        int count=0;

        for (char i = 0; i <= cumle.length() ; i++) {
            if (harf==i){
                count++;
                harf++;
            }

        }
        System.out.println("Girdiginiz "+cumle+" cumlesinde "+harf+" "+(count-1)+" adet kullanilmistir.");

    }
}
