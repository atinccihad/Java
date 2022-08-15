package i05_mathematicalOperations;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

        INPUT:

        Dakika sayısı: 3456789

        OUTPUT :

        3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("birkaç yil ve gun sayisina donusturmek uzere dakika giriniz");
        Integer dakika=scan.nextInt();

        System.out.println(dakika+" dakika yaklasik "+(dakika/(365*24*60)+" yil "+dakika%(365)+" gundur"));

    }
}
