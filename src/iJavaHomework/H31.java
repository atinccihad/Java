package iJavaHomework;

import java.util.Scanner;

public class H31 {
    public static void main(String[] args) {
        /*
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.
            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16
            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25
            Example 3:
            Input: 14
            Output: false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif sayi giriniz");
        double doubleSayi = scan.nextDouble();
        int sayi = (int) doubleSayi;

        if (doubleSayi == sayi) {
            System.out.println("Tam kare");
        } else {
            System.out.println("false");
        }

    }
}
