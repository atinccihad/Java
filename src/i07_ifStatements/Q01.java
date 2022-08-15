package i07_ifStatements;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi isteyin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girilen sayi cift");
        }
        if (sayi % 2 == 1) {
            System.out.println("Girilen sayi tek");
        }

    }
}
