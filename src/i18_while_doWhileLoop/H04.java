package i18_while_doWhileLoop;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu
        ekrana yazdirin.Kullanicinin hata yapmadigini farz edin.
         */
        Scanner scan = new Scanner(System.in);
        int carpim = 1;
        System.out.println("Carpim tablosunu goruntulemek icin bir tamsayi giriniz.");
        int num = scan.nextInt();

        while (num * carpim != 0) {

            if (carpim <= 10 && carpim > 0) {
                System.out.println(num + " * " + carpim + " = " + (num * carpim));
            }
            carpim++;
        }
    }
}
