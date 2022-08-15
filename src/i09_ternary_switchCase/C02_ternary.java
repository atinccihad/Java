package i09_ternary_switchCase;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        // Eger ternary icindeki sonuclar farkli data turlerinde
        // ise atama yapamayiz sadece yazdirabiliriz
        // sayi>0 ? "Sayi Pozitif" : (sayi*sayi) ;

        System.out.println(sayi > 0 ? "Sayi Pozitif" : (sayi * sayi));
    }
}
