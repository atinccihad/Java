package i08_ifStatements;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Kullanicidan maas icin bir teklif isteyin
        // ve asagidaki degerlere gore cevap yazdirin
        // 80000 uzerinde ise "Kabul ediyorum"
        // 60000-80000 arasinda ise "Konusabiliriz"
        // 60000 altinda ise "Maalesef Kabul edemem" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen maas icin teklif giriniz");
        double teklif = scan.nextDouble();

        if (teklif < 60000) {
            System.out.println("Maalesef Kabul edemem");
        } else if (teklif < 80000) {
            System.out.println("Konusabiliriz");
        } else if (teklif >= 80000) {
            System.out.println("Kabul ediyorum");
        }
    }
}
