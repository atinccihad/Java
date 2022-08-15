package i07_ifStatements;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        // Soru 3) Kullaniciya yasini sorun,
        // eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        // 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen emekliliginizi sorgulamak icin yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 65) {
            System.out.println("Emekli olamazsiniz, " + (65 - yas) + " yil kadar daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
