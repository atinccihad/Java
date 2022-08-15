package i16_forLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz.");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        aralariTopla(sayi1, sayi2);
    }

    private static void aralariTopla(double sayi1, double sayi2) {
        int toplam = 0;
        if (sayi1 <= sayi2) {
            for (double i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
        } else {
            for (double i = sayi1; i >= sayi2; i--) {
                toplam += i;
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
