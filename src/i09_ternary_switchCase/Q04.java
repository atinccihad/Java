package i09_ternary_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        // girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin

        System.out.println("Lutfen dikdortgenin uzunlugunu ve genisligini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println(kenar1 == kenar2 ? "Kare" : "Dikdortgen");
    }
}
