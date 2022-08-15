package i07_ifStatements;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin kenar uzunluklarini alin
        // ve dikdortgenin kare olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        if (kenar1 == kenar2) {
            System.out.println("Girilen dikdortgen KARE");
        }
        if (kenar1 != kenar2) {
            System.out.println("Girilen dikdortgen KARE DEGİL");
        }
    }
}
