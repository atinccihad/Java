package iJavaHomework;

import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort
         * islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapilacak islem icin 2 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen iki sayi ile yapilacak islemi seciniz");
        char islem = scan.next().charAt(0);
        switch (islem) {
            case '+':
                System.out.println("Girilen sayilarin toplami= " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Girilen sayilarin farki= " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Girilen sayilarin carpimi= " + sayi1 * sayi2);
                break;
            case '/':
                System.out.println("Girilen sayilarin bolumu= " + sayi1 / sayi2);
                break;
            default:
                System.out.println("Islem icin \n+    -     *       /\nIsaretlerinden birini giriniz. ");
        }

    }
}
