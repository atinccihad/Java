package iJavaHomework;

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize1 vize2 ve final notunuzu giriniz");
        double vize1 = scan.nextDouble();
        double vize2 = scan.nextDouble();
        double finalNotu = scan.nextDouble();
        System.out.println("Girilen notlara gore gecme notunuz=> " + (((vize1 + vize2) / 2) * 30 / 100 + finalNotu * 70 / 100));
    }
}
