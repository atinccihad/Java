package i09_ternary_switchCase;

import java.util.Scanner;

public class R09 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:

        Ay Numarasi:

        2

        Yil :

        2016

        OUTPUT  :

        Subat 2016 29 Gundur.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil = scan.nextInt();
        System.out.println("Ay numarasi giriniz");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak " + yil + " 31 Gundur");
                break;
            case 2:
                if (yil % 4 == 0) {
                    System.out.println("Subat " + yil + " 29 gundur");
                } else {
                    System.out.println("Subat " + yil + " 30 gundur");
                }
                break;
            case 3:
                System.out.println("Mart " + yil + " 31 gundur");
                break;
            case 4:
                System.out.println("Nisan " + yil + " 30 gundur");
                break;
            case 5:
                System.out.println("Mayis " + yil + " 31 gundur");
                break;
            case 6:
                System.out.println("Haziran " + yil + " 30 gundur");
                break;
            case 7:
                System.out.println("Temmuz " + yil + " 31 gundur");
                break;
            case 8:
                System.out.println("Agustos " + yil + " 30 gundur");
                break;
            case 9:
                System.out.println("Eylul " + yil + " 31 gundur");
                break;
            case 10:
                System.out.println("Ekim " + yil + " 30 gundur");
                break;
            case 11:
                System.out.println("Kasim " + yil + " 31 gundur");
                break;
            case 12:
                System.out.println("Aralik " + yil + " 30 gundur");
                break;
            default:
                System.out.println("Gecerli ay numarasi giriniz");
        }
    }
}
