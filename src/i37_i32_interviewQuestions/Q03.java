package i37_i32_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
        kontrol edin

        Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
        1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
         sayı böleni olmalıdır.
         1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();


        boolean asalMi = true;

        if (sayi > 1) {
            for (int i = 2; i < sayi; i++) { // bolen sayilar
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) System.out.println("Sayi asal");
            else System.out.println("sayi asal degil");
        } else if (sayi < 0) {
            System.out.println("Negative sayi giremezsiniz");
        } else {
            System.out.println("sayi asal degil 1 veya 0 girdiniz");
        }

    }
}
