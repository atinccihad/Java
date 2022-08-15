package i08_i01_practice;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("vize1 vize2 ve final notlarinizi giriniz giriniz");
        double vize1 = scan.nextDouble();
        double vize2 = scan.nextDouble();
        double finalNotu = scan.nextDouble();

        double gecmeNotu = (((vize1 + vize2) / 2 * 30 / 100) + finalNotu * 70 / 100);
        System.out.println("gecmeNotu = " + gecmeNotu);
    }
}
