package i24_i01_anOverview;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        /*
        32----
        İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

        num1 = num2 => true
         */
        int num1 = 0;
        int num2 = 0;

        System.out.println(esitMi(num1, num2));
    }

    private static boolean esitMi(int num1, int num2) {
        boolean kontrol = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Esitligini kontrol etmek icin iki sayi giriniz");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1 == num2) {
            kontrol = true;
        } else {
            kontrol = false;
        }

        return kontrol;
    }
}
