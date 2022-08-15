package i08_i01_practice;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("5basamakli sayi giriniz");
        int num = scan.nextInt();
        int ilkIki = num / 1000;
        System.out.println("ilkIki = " + ilkIki);
        int sonIki = num % 100;
        System.out.println("sonIki = " + sonIki);

        int ilkIkiToplam = (ilkIki / 10) + (ilkIki % 10);
        int sonIkiToplam = (sonIki / 10) + (sonIki % 10);

        System.out.println("Sayilarin istenilen rakamlari toplami=> "+(ilkIkiToplam+sonIkiToplam));

    }
}
