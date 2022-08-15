package i18_while_doWhileLoop;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve lcm'yi (En Küçük Ortak Çoklu) bulun.

       Giriş :

       30 ve 40

       Beklenen çıktı:

       30 ve 40 = 10 için GCD

       30 ve 40 = 120 için LCM
         */

        int ekok = 1;
        int ebob = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("2 tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3=sayi1*sayi2;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob=i;
            }
        }
        for (int i = sayi3; i >0 ; i--) {
            if (i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }
        }
        System.out.println("ebob = "+ebob);
        System.out.println("ekok = " + ekok);

    }
}
