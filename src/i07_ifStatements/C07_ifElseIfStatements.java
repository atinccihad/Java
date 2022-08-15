package i07_ifStatements;

import java.util.Scanner;

public class C07_ifElseIfStatements {
    public static void main(String[] args) {
        // Bir onceki soruda kullanici negatif deger girerse uyaralim
        // NOT : birden fazla if else if birbirine baglanmissa
        // son durum onemlidir eger else ile bitiyorsa
        // butun ihtimaller kapsaniyor demektir
        // ama else if ile bitiyorsa kapsanmayan durumlar olabilir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen emekliliginizi sorgulamak icin yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen gecerli yas giriniz!");
        } else if (yas < 65) {
            System.out.println("Emekli olamazsiniz, " + (65 - yas) + " yil daha calismalisin");
        } else {
            System.out.println("**** Emekli olabilirsin ****");
        }

    }
}
