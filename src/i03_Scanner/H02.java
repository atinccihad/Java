package i03_Scanner;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        double sayi3 = scan.nextDouble();
        System.out.println("Karenin cevresi=> " + (sayi3 * 4) +
                "Karenin alani=>" + (sayi3 * sayi3));
    }
}
