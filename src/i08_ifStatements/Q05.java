package i08_ifStatements;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negatif ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse
        "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        sayilardan 0'a esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
         */
        System.out.println("Lutfen  iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Girilen sayilar pozitif, toplamlari=> " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("Girilen sayilar negatif, carpimlari=> " + sayi1 * sayi2);
        } else if ((sayi1 < 0 && sayi2 > 0) || (sayi2 < 0 && sayi1 > 0)) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
