package i11_i09_practice;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int bb = sayi % 10;
        int ob = (sayi / 10) % 10;
        int yb = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yb) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("ucyuz");
                    break;
                case 4:
                    System.out.print("dortyuz");
                    break;
                case 5:
                    System.out.print("besyuz");
                    break;
                case 6:
                    System.out.print("altiyuz");
                    break;
                case 7:
                    System.out.print("yediyuz");
                    break;
                case 8:
                    System.out.print("sekizyuz");
                    break;
                case 9:
                    System.out.print("dokuzyuz");
                    break;
                default:
                    System.out.println("yuzler basamagi icin gecerli sayi giriniz!!");
            }
            switch (ob) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print(" on");
                    break;
                case 2:
                    System.out.print(" yirmi");
                    break;
                case 3:
                    System.out.print(" otuz");
                    break;
                case 4:
                    System.out.print(" kirk");
                    break;
                case 5:
                    System.out.print(" elli");
                    break;
                case 6:
                    System.out.print(" altmıs");
                    break;
                case 7:
                    System.out.print(" yetmis");
                    break;
                case 8:
                    System.out.print(" seksen");
                    break;
                case 9:
                    System.out.print(" doksan");
                    break;
                default:
                    System.out.println("onlar basamagi icin gecerli sayi giriniz!!");
            }
            switch (bb) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print(" bir");
                    break;
                case 2:
                    System.out.print(" iki");
                    break;
                case 3:
                    System.out.print(" uc");
                    break;
                case 4:
                    System.out.print(" dort");
                    break;
                case 5:
                    System.out.print(" bes");
                    break;
                case 6:
                    System.out.print(" alti");
                    break;
                case 7:
                    System.out.print(" yedi");
                    break;
                case 8:
                    System.out.print(" sekiz");
                    break;
                case 9:
                    System.out.print(" dokuz");
                    break;
                default:
                    System.out.println("birler basamagi icin gecerli sayi giriniz!!");
            }
        } else {
            System.out.println("3 basamakli sayi giriniz!!");
        }
    }
}
